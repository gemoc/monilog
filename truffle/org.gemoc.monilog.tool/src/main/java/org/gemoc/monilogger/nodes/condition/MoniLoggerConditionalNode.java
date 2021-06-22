package org.gemoc.monilogger.nodes.condition;

import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;

@NodeChild(value = "condition", type = MoniLoggerExecutableNode.class)
public abstract class MoniLoggerConditionalNode extends MoniLoggerExecutableNode {

	@Specialization
	public Object execute(VirtualFrame frame, boolean condition) {
		return condition;
	}

	@Specialization
	public Object execute(VirtualFrame frame, Object condition) {
		return condition != null;
	}
	
	
	
	
}
