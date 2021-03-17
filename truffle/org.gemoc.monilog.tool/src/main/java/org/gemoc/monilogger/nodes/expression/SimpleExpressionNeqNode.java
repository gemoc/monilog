package org.gemoc.monilogger.nodes.expression;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "!=")
public abstract class SimpleExpressionNeqNode extends SimpleExpressionBinaryNode {

	@Specialization
	protected boolean neq(long left, long right) {
		return left != right;
	}

	@Specialization
	protected boolean neq(double left, double right) {
		return left != right;
	}

	@Specialization
	protected boolean neq(long left, double right) {
		return left != right;
	}

	@Specialization
	protected boolean neq(double left, long right) {
		return left != right;
	}

	@Specialization
	protected boolean neq(boolean left, boolean right) {
		return left != right;
	}

	@Fallback
	protected Object typeError(Object left, Object right) {
		throw SimpleExpressionException.typeError(this, left, right);
	}

}
