package org.gemoc.monilogger.nodes.condition;

import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;
import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;

public class MoniLoggerConditionalNode extends MoniLoggerExecutableNode {

	@Children
	private final MoniLoggerExecutableNode[] conditions;
	
	public MoniLoggerConditionalNode(MoniLoggerExecutableNode[] conditions) {
		this.conditions = conditions;
	}
	
	@Override
	@ExplodeLoop
	public Object execute(VirtualFrame frame) {
		boolean result = true;
		for (int i = 0; i < conditions.length; i++) {
			if (!result) {
				break;
			}
			final MoniLoggerExecutableNode condition = conditions[i];
			final Object eval = condition.execute(frame);
			final Value val = Value.asValue(eval);
			if (val.isBoolean()) {
				// If it's a boolean, use as is.
				result = val.asBoolean();
			} else {
				// If it's not, check whether it's null.
				// If not, the condition is validated.
				result = !val.isNull();
			}
		}
		return result;
	}
	
	
}
