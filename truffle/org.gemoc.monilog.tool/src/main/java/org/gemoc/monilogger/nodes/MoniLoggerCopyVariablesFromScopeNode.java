package org.gemoc.monilogger.nodes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

import org.gemoc.monilogger.MoniLoggerInstrument;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.Scope;
import com.oracle.truffle.api.dsl.Cached;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.Frame;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.InvalidArrayIndexException;
import com.oracle.truffle.api.interop.NodeLibrary;
import com.oracle.truffle.api.interop.UnknownIdentifierException;
import com.oracle.truffle.api.interop.UnsupportedMessageException;
import com.oracle.truffle.api.library.CachedLibrary;

public abstract class MoniLoggerCopyVariablesFromScopeNode extends MoniLoggerExecutableNode {

	@Child
	private InteropLibrary variables;

	private final boolean doPolyglot;

	protected final String bindingsName;
	protected final Set<String> writtenMembers = new HashSet<>();
	private final Function<Frame, Iterable<Scope>> scopeGetter;

	private final MoniLoggerInstrument instrument;
	
	@CompilationFinal
	private int nbScopes = -1;
	@CompilationFinal
	protected boolean initialized = false;

	public abstract Object execute(VirtualFrame frame);

	protected MoniLoggerCopyVariablesFromScopeNode(String bindingsName, Function<Frame, Iterable<Scope>> scopeGetter,
			boolean doPolyglot) {
		this.bindingsName = bindingsName;
		this.scopeGetter = scopeGetter;
		this.instrument = Context.getCurrent().getEngine().getInstruments().get(MoniLoggerInstrument.ID)
				.lookup(MoniLoggerInstrument.class);
		this.doPolyglot = doPolyglot;
	}

	@Specialization(guards = "!initialized")
	protected Object initialize(VirtualFrame frame) {
		CompilerDirectives.transferToInterpreterAndInvalidate();
		final Value bindings = getBindings();
		final Iterator<Scope> scopes = getScopes(frame);
		writtenMembers.clear();
		int i = 0;
		while (scopes.hasNext()) {
			final Scope scope = scopes.next();

			final Object args = scope.getArguments();
			if (args != null) {
				copyVariables(args, bindings);
			}

			final Object vars = scope.getVariables();
			if (vars != null) {
				copyVariables(vars, bindings);
			}
			
			i++;
		}
		nbScopes = i;
		initialized = true;
		return true;
	}

	@Specialization(guards = "initialized", replaces = "initialize")
	protected Object doRead(VirtualFrame frame, //
			@Cached("getBindings()") Value bindings) {
		final Iterator<Scope> scopes = getScopes(frame);
		writtenMembers.clear();
		
		for (int i = 0; i < nbScopes; i++) {
			final Scope scope = scopes.next();

			final Object args = scope.getArguments();
			if (args != null) {
				copyVariables(args, bindings);
			}

			final Object vars = scope.getVariables();
			if (vars != null) {
				copyVariables(vars, bindings);
			}
		}

		return true;
	}
	
	@TruffleBoundary
	private final Iterator<Scope> getScopes(Frame frame) {
		return scopeGetter.apply(frame).iterator();
	}

	protected Value getBindings() {
		if (doPolyglot) {
			return Context.getCurrent().getPolyglotBindings();
		}
		return Context.getCurrent().getBindings(bindingsName);
	}

	private void copyVariables(Object vars, Value bindings) {
		try {
			final InteropLibrary varsLibrary = InteropLibrary.getFactory().create(vars);
			insert(varsLibrary);
			variables = varsLibrary;
			final Object members = variables.getMembers(vars);
			final InteropLibrary membersLibrary = InteropLibrary.getFactory().create(members);
			for (int i = 0; i < membersLibrary.getArraySize(members); i++) {
				final String memberName = (String) membersLibrary.readArrayElement(members, i);
				final Object value = variables.readMember(vars, memberName);
				if (!writtenMembers.contains(memberName)) {
					bindings.putMember(memberName, value);
					writtenMembers.add(memberName);
				}
			}
		} catch (UnsupportedMessageException | UnknownIdentifierException | InvalidArrayIndexException e) {
			e.printStackTrace();
		}
	}
}
