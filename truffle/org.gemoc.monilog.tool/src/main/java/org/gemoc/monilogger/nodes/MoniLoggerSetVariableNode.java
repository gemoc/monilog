package org.gemoc.monilogger.nodes;

import org.gemoc.monilogger.MoniLoggerInstrument;
import org.graalvm.polyglot.Context;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.dsl.Cached;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.InvalidArrayIndexException;
import com.oracle.truffle.api.interop.NodeLibrary;
import com.oracle.truffle.api.interop.UnknownIdentifierException;
import com.oracle.truffle.api.interop.UnsupportedMessageException;
import com.oracle.truffle.api.interop.UnsupportedTypeException;
import com.oracle.truffle.api.library.CachedLibrary;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.Node;

@NodeChild(value = "value", type = MoniLoggerExecutableNode.class)
public abstract class MoniLoggerSetVariableNode extends MoniLoggerExecutableNode {

	@Child
	private InteropLibrary variables;

	protected final boolean onEnter;

	protected final String variableName;

	protected final Node localNode;

	private final MoniLoggerInstrument instrument;

	public abstract Object execute(VirtualFrame frame);

	@CompilationFinal
	private boolean initialized = false;

	@CompilationFinal
	private boolean inLocalScope = false;
	
	protected MoniLoggerSetVariableNode(String variableName, Node localNode, boolean onEnter) {
		this.variableName = variableName;
		this.localNode = localNode;
		this.instrument = Context.getCurrent().getEngine().getInstruments().get(MoniLoggerInstrument.ID)
				.lookup(MoniLoggerInstrument.class);
		this.onEnter = onEnter;
	}

	@ExplodeLoop
	@Specialization
	protected Object doRead(VirtualFrame frame, Object value, //
			@CachedLibrary("localNode") NodeLibrary localNodeLibrary, //
			@Cached("getLocalScope(localNodeLibrary, frame)") Object localScope, //
			@CachedLibrary("localScope") InteropLibrary localScopeLibrary, //
			@Cached("getLanguageScope()") Object languageScope, //
			@CachedLibrary("languageScope") InteropLibrary languageScopeLibrary) {
		try {
			if (!initialized) {
				CompilerDirectives.transferToInterpreterAndInvalidate();
				final Object localMembers = getMembers(localScopeLibrary, localScope);
				final Object languageMembers = getMembers(languageScopeLibrary, languageScope);
				final InteropLibrary localMembersLibrary = InteropLibrary.getUncached();
				final InteropLibrary languageMembersLibrary = InteropLibrary.getUncached();
				final InteropLibrary memberNameLibrary = InteropLibrary.getFactory().getUncached();
				for (int i = 0; i < localMembersLibrary.getArraySize(localMembers); i++) {
					final Object memberNameObject = localMembersLibrary.readArrayElement(localMembers, i);
					final String memberName = memberNameLibrary.asString(memberNameObject);
					if (memberName.equals(variableName)) {
						initialized = true;
						inLocalScope = true;
						writeMember(localScopeLibrary, localScope, variableName, value);
						break;
					}
				}
				if (!initialized) {
					for (int i = 0; i < languageMembersLibrary.getArraySize(languageMembers); i++) {
						final Object memberNameObject = languageMembersLibrary.readArrayElement(languageMembers, i);
						final String memberName = memberNameLibrary.asString(memberNameObject);
						if (memberName.equals(variableName)) {
							initialized = true;
							writeMember(languageScopeLibrary, languageScope, variableName, value);
							break;
						}
					}
				}
			} else {
				if (inLocalScope) {
					writeMember(localScopeLibrary, localScope, variableName, value);
				} else {
					writeMember(languageScopeLibrary, languageScope, variableName, value);
				}
			}
			return true;
		} catch (UnsupportedMessageException | InvalidArrayIndexException e) {
			return CompilerDirectives.shouldNotReachHere(e);
		}
	}

	protected Object getLocalScope(NodeLibrary nodes, VirtualFrame frame) {
		try {
			return nodes.getScope(localNode, frame, onEnter);
		} catch (UnsupportedMessageException e) {
			throw new IllegalArgumentException(e);
		}
	}

	protected Object getMembers(InteropLibrary scopeLibrary, Object scope) {
		try {
			return scopeLibrary.getMembers(scope);
		} catch (UnsupportedMessageException e) {
			throw new IllegalArgumentException(e);
		}
	}
	
	protected Object getLanguageScope() {
		return instrument.getEnv().getScope(localNode.getRootNode().getLanguageInfo());
	}
	
	private void writeMember(InteropLibrary scopeLibrary, Object scope, String memberName, Object value) {
		try {
			scopeLibrary.writeMember(scope, memberName, value);
		} catch (UnsupportedMessageException | UnknownIdentifierException | UnsupportedTypeException e) {
			e.printStackTrace();
		}
	}

}
