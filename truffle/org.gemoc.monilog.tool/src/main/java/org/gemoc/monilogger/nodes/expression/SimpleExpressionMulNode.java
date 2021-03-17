package org.gemoc.monilogger.nodes.expression;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "*")
public abstract class SimpleExpressionMulNode extends SimpleExpressionBinaryNode {

	@Specialization
	protected long mul(long left, long right) {
		return left * right;
	}

	@Specialization
	protected double mul(double left, double right) {
		return left * right;
	}

	@Specialization
	protected double mul(long left, double right) {
		return left * right;
	}

	@Specialization
	protected double mul(double left, long right) {
		return left * right;
	}

	@Fallback
	protected Object typeError(Object left, Object right) {
		throw SimpleExpressionException.typeError(this, left, right);
	}

}
