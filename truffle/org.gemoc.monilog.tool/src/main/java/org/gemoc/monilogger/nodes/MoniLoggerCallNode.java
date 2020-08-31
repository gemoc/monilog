package org.gemoc.monilogger.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.DirectCallNode;

public class MoniLoggerCallNode extends MoniLoggerExecutableNode {

	@Child 
	private DirectCallNode callNode;
	
	private Object cachedResult;
	
	public MoniLoggerCallNode(DirectCallNode callNode) {
		this.callNode = callNode;
	}
	
	public Object execute(VirtualFrame frame) {
		cachedResult = callNode.call();
		return cachedResult;
	}
	
	protected Object getCachedResult() {
		return cachedResult;
	}

}
