package org.gemoc.monilogger.nodes.expression;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "||")
public abstract class SimpleExpressionOrNode extends SimpleExpressionBinaryNode {

	@Specialization
	protected boolean or(boolean left, boolean right) {
		return left || right;
	}

	@Fallback
	protected Object typeError(Object left, Object right) {
		throw SimpleExpressionException.typeError(this, left, right);
	}

}
