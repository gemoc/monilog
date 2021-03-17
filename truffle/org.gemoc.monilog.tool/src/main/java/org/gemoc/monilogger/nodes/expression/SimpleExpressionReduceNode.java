package org.gemoc.monilogger.nodes.expression;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.profiles.ConditionProfile;

@NodeChild(value = "condition", type = SimpleExpressionNode.class)
public abstract class SimpleExpressionReduceNode extends SimpleExpressionNode {

	@Child
	private SimpleExpressionNode thenNode;
	@Child
	private SimpleExpressionNode elseNode;

	private final ConditionProfile conditionProfile = ConditionProfile.createCountingProfile();
	
	protected SimpleExpressionReduceNode(SimpleExpressionNode left, SimpleExpressionNode right) {
		this.thenNode = left;
		this.elseNode = right;
	}

	@Specialization
	public Object execute(VirtualFrame frame, boolean condition) {
		if (conditionProfile.profile(condition)) {
			return thenNode.execute(frame);
		} else {
			return elseNode.execute(frame);
		}
	}
}
