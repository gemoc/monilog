package org.gemoc.monilogger.nodes.expression;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "-")
public abstract class SimpleExpressionMinusNode extends SimpleExpressionUnaryNode {

	@Specialization
	protected double minus(double value) {
		return -value;
	}
	
	@Specialization
	protected long minus(long value) {
		return -value;
	}

	@Fallback
	protected Object typeError(Object value) {
		throw SimpleExpressionException.typeError(this, value);
	}

}
