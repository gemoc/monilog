package org.gemoc.monilogger.nodes.expression;

import java.util.HashMap;
import java.util.Map;

import org.gemoc.monilogger.MoniLoggerInstrument;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.dsl.Cached;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;

public abstract class SimpleExpressionReadPropertyNode extends SimpleExpressionNode {

	static final int LIBRARY_LIMIT = 3;
	
	private final String propertyName;
	
	protected final MoniLoggerInstrument instrument;
	
	@Child
	private SimpleExpressionNode defaultValue;
	
	protected SimpleExpressionReadPropertyNode(String propertyName, SimpleExpressionNode defaultValue) {
		this.propertyName = propertyName;
		this.defaultValue = defaultValue;
		this.instrument = Context.getCurrent().getEngine().getInstruments().get(MoniLoggerInstrument.ID)
				.lookup(MoniLoggerInstrument.class);
	}

	@Specialization(assumptions = "instrument.getContextActive().getAssumption()")
	protected Object doRead(VirtualFrame frame, //
			@Cached("getMoniLogContext(frame)") Value monilogContext) {
		return monilogContext.getHashValue(propertyName);
	}
	
	protected Value getMoniLogContext(VirtualFrame frame) {
		final Value bindings = Context.getCurrent().getPolyglotBindings();
		if (!bindings.hasMember(MoniLoggerInstrument.MONILOG_CONTEXT)) {
			final Map<String, Object> monilogContext = new HashMap<>();
			bindings.putMember(MoniLoggerInstrument.MONILOG_CONTEXT, monilogContext);
		}
		final Value context = bindings.getMember(MoniLoggerInstrument.MONILOG_CONTEXT);
		if (!context.hasHashEntry(propertyName)) {
			context.putHashEntry(propertyName, defaultValue.execute(frame));
		}
		return context;
	}
}
