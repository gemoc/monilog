package org.gemoc.monilogger.nodes.expression;

import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;

public abstract class SimpleExpressionNode extends MoniLoggerExecutableNode {

	public boolean executeBoolean(VirtualFrame frame) throws UnexpectedResultException {
		return SimpleExpressionTypesGen.expectBoolean(execute(frame));
	}

	public long executeLong(VirtualFrame frame) throws UnexpectedResultException {
		return SimpleExpressionTypesGen.expectLong(execute(frame));
	}

	public double executeDouble(VirtualFrame frame) throws UnexpectedResultException {
		return SimpleExpressionTypesGen.expectDouble(execute(frame));
	}

}
