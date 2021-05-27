package org.gemoc.monilogger.nodes.action;

import java.util.HashMap;
import java.util.Map;

import org.gemoc.monilogger.MoniLoggerInstrument;
import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.dsl.Cached;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;

@NodeChild(value = "value", type = MoniLoggerExecutableNode.class)
public abstract class MoniLoggerSetVariableNode extends MoniLoggerExecutableNode {

	protected final String variableName;

	protected final MoniLoggerInstrument instrument;

	protected MoniLoggerSetVariableNode(String variableName) {
		this.variableName = variableName;
		this.instrument = Context.getCurrent().getEngine().getInstruments().get(MoniLoggerInstrument.ID)
				.lookup(MoniLoggerInstrument.class);
	}

	@Specialization(assumptions = "instrument.getContextActive().getAssumption()")
	protected Object doSet(VirtualFrame frame, Object value, //
			@Cached("getMoniLogContext()") Value monilogContext) {
		monilogContext.putHashEntry(variableName, value);
		return value;
	}

	protected Value getMoniLogContext() {
		final Value bindings = Context.getCurrent().getPolyglotBindings();
		if (!bindings.hasMember(MoniLoggerInstrument.MONILOG_CONTEXT)) {
			final Map<String, Object> monilogContext = new HashMap<>();
			bindings.putMember(MoniLoggerInstrument.MONILOG_CONTEXT, monilogContext);
		}
		return bindings.getMember(MoniLoggerInstrument.MONILOG_CONTEXT);
	}

}
