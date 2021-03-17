package org.gemoc.monilogger.nodes.expression;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "!")
public abstract class SimpleExpressionNotNode extends SimpleExpressionUnaryNode {

	@Specialization
	protected boolean not(boolean value) {
		return !value;
	}

	@Fallback
	protected Object typeError(Object value) {
		throw SimpleExpressionException.typeError(this, value);
	}

}
