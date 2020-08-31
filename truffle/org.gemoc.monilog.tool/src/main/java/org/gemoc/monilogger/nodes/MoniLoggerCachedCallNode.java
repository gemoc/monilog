package org.gemoc.monilogger.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class MoniLoggerCachedCallNode extends MoniLoggerExecutableNode {

	private final MoniLoggerCallNode callNode;
	
	protected MoniLoggerCachedCallNode(MoniLoggerCallNode callNode) {
		this.callNode = callNode;
	}
	
	public Object execute(VirtualFrame frame) {
		return callNode.getCachedResult();
	}

}
