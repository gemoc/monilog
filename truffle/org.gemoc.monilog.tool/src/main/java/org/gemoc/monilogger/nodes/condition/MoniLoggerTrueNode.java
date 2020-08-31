package org.gemoc.monilogger.nodes.condition;

import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;

import com.oracle.truffle.api.frame.VirtualFrame;

public class MoniLoggerTrueNode extends MoniLoggerExecutableNode {

	@Override
	public Object execute(VirtualFrame frame) {
		return true;
	}
	
}
