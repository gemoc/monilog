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
import com.oracle.truffle.api.nodes.Node;

public abstract class SimpleExpressionReadLocalVariableNode extends SimpleExpressionNode {

	private final String member;
	protected final Node location;

	protected final boolean onEnter;

	private final MoniLoggerInstrument instrument;

	@CompilationFinal
	private boolean isLocal = true;
	@CompilationFinal
	private boolean initialized = false;
	@Child
	private InteropLibrary localScopeLibrary;

	protected SimpleExpressionReadLocalVariableNode(String member, Node location, boolean onEnter) {
		this.member = member;
		this.location = location;
		this.onEnter = onEnter;
		this.instrument = Context.getCurrent().getEngine().getInstruments().get(MoniLoggerInstrument.ID)
				.lookup(MoniLoggerInstrument.class);
	}

	@Specialization
	protected Object doRead(VirtualFrame frame, //
			@CachedLibrary("location") NodeLibrary localNodeLibrary, //
			@Cached("getLanguageScope()") Object languageScope, //
			@CachedLibrary("languageScope") InteropLibrary languageScopeLibrary) {
		if (!initialized) {
			CompilerDirectives.transferToInterpreterAndInvalidate();
			Object result = null;
			try {
				final Object localScope = getLocalScope(localNodeLibrary, frame);
				final InteropLibrary localScopeLibrary = InteropLibrary.getUncached(localScope);
				result = readMember(localScopeLibrary, localScope);
				if (result != null) {
					this.localScopeLibrary = localScopeLibrary;
					adoptChildren();
				}
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
				final Object localScope = getLocalScope(localNodeLibrary, frame);
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

}
