package org.gemoc.monilogger.nodes.expression;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "+")
public abstract class SimpleExpressionAddNode extends SimpleExpressionBinaryNode {

	@Specialization
	protected long add(long left, long right) {
		return left + right;
	}

	@Specialization
	protected double add(double left, double right) {
		return left + right;
	}

	@Specialization
	protected double add(long left, double right) {
		return left + right;
	}

	@Specialization
	protected double add(double left, long right) {
		return left + right;
	}

	@Specialization
	protected Object add(String left, String right) {
		return left + right;
	}

	@Fallback
	protected Object typeError(Object left, Object right) {
		throw SimpleExpressionException.typeError(this, left, right);
	}

}
