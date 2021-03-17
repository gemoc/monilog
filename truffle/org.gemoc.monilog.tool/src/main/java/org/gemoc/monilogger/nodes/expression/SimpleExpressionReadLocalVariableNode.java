package org.gemoc.monilogger.nodes.expression;

import org.gemoc.monilogger.MoniLoggerInstrument;
import org.graalvm.polyglot.Context;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.dsl.Cached;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.NodeLibrary;
import com.oracle.truffle.api.interop.UnknownIdentifierException;
import com.oracle.truffle.api.interop.UnsupportedMessageException;
import com.oracle.truffle.api.library.CachedLibrary;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.Node;

public abstract class SimpleExpressionReadLocalVariableNode extends SimpleExpressionNode {

	private final String member;
	protected final Node location;
	
	@Child
	private InteropLibrary variables;

	protected final boolean onEnter;
	
	private final MoniLoggerInstrument instrument;
	
	@CompilationFinal
	private boolean isLocal = true;
	@CompilationFinal
	private boolean initialized = false;

	protected SimpleExpressionReadLocalVariableNode(String member, Node location, boolean onEnter) {
		this.member = member;
		this.location = location;
		this.onEnter = onEnter;
		this.instrument = Context.getCurrent().getEngine().getInstruments().get(MoniLoggerInstrument.ID)
				.lookup(MoniLoggerInstrument.class);
	}
	
//	@CompilationFinal
//	private boolean unboxed = false;

	@ExplodeLoop
	@Specialization
	protected Object doRead(VirtualFrame frame, //
			@CachedLibrary("location") NodeLibrary localNodeLibrary, //
			@Cached("getLocalScope(localNodeLibrary, frame)") Object localScope, //
			@CachedLibrary("localScope") InteropLibrary localScopeLibrary, //
			@Cached("getLanguageScope()") Object languageScope, //
			@CachedLibrary("languageScope") InteropLibrary languageScopeLibrary) {
		if (!initialized) {
			CompilerDirectives.transferToInterpreterAndInvalidate();
			Object result = null;
			try {
				result = readMember(localScopeLibrary, localScope);
			} catch (IllegalArgumentException e) {
			}
			if (result == null) {
				isLocal = false;
				result = readMember(languageScopeLibrary, languageScope);
			}
			initialized = true;
			return result;
		} else {
			if (isLocal) {
				return readMember(localScopeLibrary, localScope);
			} else {
				return readMember(languageScopeLibrary, languageScope);
			}
		}
	}

	protected Object getLocalScope(NodeLibrary nodes, VirtualFrame frame) {
		try {
			return nodes.getScope(location, frame, onEnter);
		} catch (UnsupportedMessageException e) {
			throw new IllegalArgumentException(e);
		}
	}
	
	protected Object getLanguageScope() {
		return instrument.getEnv().getScope(location.getRootNode().getLanguageInfo());
	}

	protected Object getMembers(InteropLibrary scopeLibrary, Object scope) {
		try {
			return scopeLibrary.getMembers(scope);
		} catch (UnsupportedMessageException e) {
			throw new IllegalArgumentException(e);
		}
	}

	protected Object readMember(InteropLibrary scopeLibrary, Object scope) {
		try {
			return scopeLibrary.readMember(scope, member);
		} catch (UnsupportedMessageException | UnknownIdentifierException e) {
			throw new IllegalArgumentException(e);
		}
	}

//	@Specialization(guards = "frame.isLong(getSlot(frame))")
//	protected long readLong(VirtualFrame frame) {
//		return FrameUtil.getLongSafe(frame, getSlot(frame));
//	}

//	@Specialization(guards = "frame.isBoolean(getSlot(frame))")
//	protected boolean readBoolean(VirtualFrame frame) {
//		return FrameUtil.getBooleanSafe(frame, getSlot(frame));
//	}

//	@Specialization(replaces = { "readDouble", "readLong", "readBoolean" })
//	protected Object readObject(VirtualFrame frame) {
//		if (!frame.isObject(getSlot(frame))) {
//			CompilerDirectives.transferToInterpreter();
//			Object result = frame.getValue(getSlot(frame));
//			frame.setObject(getSlot(frame), result);
//			return result;
//		}
//		if (!unboxed) {
//			CompilerDirectives.transferToInterpreterAndInvalidate();
//			final SimpleExpressionUnboxValueNode[] unboxPtr = new SimpleExpressionUnboxValueNode[1]; 
//			atomic(() -> {
//				unboxPtr[0] = SimpleExpressionUnboxValueNodeGen.create(this);
//				replace(unboxPtr[0]);
//				unboxed = true;
//			});
//			return unboxPtr[0].execute(frame);
//		}
//		return FrameUtil.getObjectSafe(frame, getSlot(frame));
//	}
	
//	protected FrameSlot getSlot(VirtualFrame frame) {
//		if (slot == null) {
//			CompilerDirectives.transferToInterpreterAndInvalidate();
//			slot = frame.getFrameDescriptor().findFrameSlot(variableName);
//		}
//		return slot;
//	}
	
}
