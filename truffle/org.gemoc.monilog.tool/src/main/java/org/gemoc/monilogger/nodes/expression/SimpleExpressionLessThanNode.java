package org.gemoc.monilogger.nodes.expression;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "<")
public abstract class SimpleExpressionLessThanNode extends SimpleExpressionBinaryNode {

	@Specialization
	protected boolean lessThan(long left, long right) {
		return left < right;
	}

	@Specialization
	protected boolean lessThan(double left, double right) {
		return left < right;
	}

	@Specialization
	protected boolean lessThan(long left, double right) {
		return left < right;
	}

	@Specialization
	protected boolean lessThan(double left, long right) {
		return left < right;
	}

	@Specialization
	protected boolean lessThan(String left, double right) {
		return Double.parseDouble(left) < right;
	}

	@Specialization
	protected boolean lessThan(double left, String right) {
		return left < Double.parseDouble(right);
	}

	@Specialization
	protected boolean lessThan(String left, long right) {
		return Double.parseDouble(left) < right;
	}

	@Specialization
	protected boolean lessThan(long left, String right) {
		return left < Double.parseDouble(right);
	}

	@Fallback
	protected Object typeError(Object left, Object right) {
		throw SimpleExpressionException.typeError(this, left, right);
	}

}
