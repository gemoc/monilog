package org.gemoc.monilogger.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;

public abstract class MoniLoggerExecutableNode extends Node {

	public abstract Object execute(VirtualFrame frame);
	
}
