package org.gemoc.monilogger.nodes;

import java.util.Iterator;
import java.util.function.Function;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.Scope;
import com.oracle.truffle.api.dsl.Cached;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.Frame;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.UnknownIdentifierException;
import com.oracle.truffle.api.interop.UnsupportedMessageException;

public abstract class MoniLoggerReadFromScopeNode extends MoniLoggerExecutableNode {

	@Child
	private InteropLibrary variables;
	
	private final String variableName;
	protected final String bindingsName;
	private final Function<Frame, Iterable<Scope>> scopeGetter;
	
	public abstract Object execute(VirtualFrame frame);

	protected MoniLoggerReadFromScopeNode(String variableName, String bindingsName, Function<Frame, Iterable<Scope>> scopeGetter) {
		this.variableName = variableName;
		this.bindingsName = bindingsName;
		this.scopeGetter = scopeGetter;
	}

//	@Specialization(guards = "receiver != null")
//	protected Object doRead(VirtualFrame frame, //
//			@Cached("getVariables(frame)") Object receiver, //
//			@Cached("getBindings()") Value bindings) {
//		try {
//			final Object result = variables.readMember(receiver, variableName);
//			bindings.putMember(variableName, result);
//			return result;
//		} catch (UnsupportedMessageException | UnknownIdentifierException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
	
	@Specialization
	protected Object doRead(VirtualFrame frame, //
			@Cached("getBindings()") Value bindings) {
		try {
			final Object receiver = getVariables(frame);
			final Object result = variables.readMember(receiver, variableName);
			bindings.putMember(variableName, result);
			return result;
		} catch (UnsupportedMessageException | UnknownIdentifierException e) {
			e.printStackTrace();
		}
		return null;
	}

	protected Value getBindings() {
		return Context.getCurrent().getBindings(bindingsName);
	}
	
	protected Object getVariables(VirtualFrame frame) {
		Object result = null;
		final Iterator<Scope> localScopes = scopeGetter.apply(frame).iterator();
		while (localScopes.hasNext()) {
			final Scope scope = localScopes.next();
			final Object args = scope.getArguments();
			if (args != null) {
				setVariables(args);
				if (variables.isMemberReadable(args, variableName)) {
					result = args;
					break;
				}
			}
			final Object vars = scope.getVariables();
			if (vars != null) {
				setVariables(vars);
				if (variables.isMemberReadable(vars, variableName)) {
					result = vars;
					break;
				}
			}
		}
		return result;
	}
	
	private void setVariables(Object obj) {
//		if (variables == null) {
			final InteropLibrary argsLibrary = InteropLibrary.getFactory().create(obj);
			insert(argsLibrary);
			variables = argsLibrary;
//		} else {
//			final InteropLibrary argsLibrary = InteropLibrary.getFactory().create(obj);
//			variables.replace(argsLibrary);
//		}
	}
}
