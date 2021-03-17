package org.gemoc.monilogger.nodes.expression;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "==")
public abstract class SimpleExpressionEqNode extends SimpleExpressionBinaryNode {

	@Specialization
	protected boolean eq(long left, long right) {
		return left == right;
	}

	@Specialization
	protected boolean eq(double left, double right) {
		return left == right;
	}

	@Specialization
	protected boolean eq(long left, double right) {
		return left == right;
	}

	@Specialization
	protected boolean eq(double left, long right) {
		return left == right;
	}

	@Specialization
	protected boolean eq(boolean left, boolean right) {
		return left == right;
	}

	@Specialization
	protected boolean eq(String left, double right) {
		return Double.parseDouble(left) == right;
	}

	@Specialization
	protected boolean eq(double left, String right) {
		return left == Double.parseDouble(right);
	}

	@Specialization
	protected boolean eq(String left, long right) {
		return Double.parseDouble(left) == right;
	}

	@Specialization
	protected boolean eq(long left, String right) {
		return left == Double.parseDouble(right);
	}

	@Fallback
	protected Object typeError(Object left, Object right) {
		throw SimpleExpressionException.typeError(this, left, right);
	}

}
