package org.gemoc.monilogger.nodes;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.instrumentation.ExecutionEventNode;
import com.oracle.truffle.api.profiles.ConditionProfile;

@NodeChild(value = "condition", type = MoniLoggerExecutableNode.class)
public abstract class MoniLoggerExecutionEventNode extends ExecutionEventNode {

	@Child
	private MoniLoggerExecutableNode action;
	
	private final boolean onEnter;
	private final boolean onReturnValue;

	private final ConditionProfile conditionProfile = ConditionProfile.createBinaryProfile();

	
	public MoniLoggerExecutionEventNode(boolean onEnter, boolean onReturnValue, MoniLoggerExecutableNode action) {
		this.onEnter = onEnter;
		this.onReturnValue = onReturnValue;
		this.action = action;
	}

	@Override
	protected void onEnter(VirtualFrame frame) {
		if (onEnter) {
			execute(frame);
		}
	}

	@Override
	protected void onReturnValue(VirtualFrame frame, Object result) {
		if (onReturnValue) {
			execute(frame);
		}
	}
	
	protected abstract void execute(VirtualFrame frame);

	@Specialization
	protected void doAction(VirtualFrame frame, boolean condition) {

		if (conditionProfile.profile(condition)) {
			action.execute(frame);
		}
	}

}
