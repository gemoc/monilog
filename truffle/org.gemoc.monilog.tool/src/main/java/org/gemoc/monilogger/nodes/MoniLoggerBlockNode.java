package org.gemoc.monilogger.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.BlockNode;

public class MoniLoggerBlockNode extends MoniLoggerExecutableNode implements BlockNode.ElementExecutor<MoniLoggerExecutableNode> {

	@Child
	private BlockNode<MoniLoggerExecutableNode> blockNode;
	
	public MoniLoggerBlockNode(MoniLoggerExecutableNode[] nodes) {
		this.blockNode = BlockNode.create(nodes, this);
	}
	
	@Override
	public Object execute(VirtualFrame frame) {
		return blockNode.executeGeneric(frame, BlockNode.NO_ARGUMENT);
	}
	
	@Override
	public void executeVoid(VirtualFrame frame, MoniLoggerExecutableNode node, int index, int argument) {
		executeGeneric(frame, node, index, argument);
	}

	@Override
	public Object executeGeneric(VirtualFrame frame, MoniLoggerExecutableNode node, int index, int argument) {
		return node.execute(frame);
	}
	
}
