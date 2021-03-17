package org.gemoc.monilogger.nodes.expression;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "vector")
public final class SimpleExpressionVectorNode extends SimpleExpressionNode {

	@Children
	private SimpleExpressionNode[] valueNodes;

	public SimpleExpressionVectorNode(SimpleExpressionNode[] valueNodes) {
		this.valueNodes = valueNodes;
	}

	@Override
	@ExplodeLoop
	public Object execute(VirtualFrame frame) {
		final Object[] result = new Object[valueNodes.length];
		for (int i = 0; i < valueNodes.length; i++) {
			result[i] = valueNodes[i].execute(frame);
		}
		return result;
	}
}
