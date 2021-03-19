package org.gemoc.monilogger.nodes.action;

import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;
import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;

public class MoniLoggerExternalLayoutNode extends MoniLoggerExecutableNode {
	
	private final Value layoutValue;

	@Children
	private final MoniLoggerExecutableNode[] argNodes;
	
	public MoniLoggerExternalLayoutNode(Value layoutValue, MoniLoggerExecutableNode[] argNodes) {
		this.layoutValue = layoutValue;
		this.argNodes = argNodes;
	}
	
	@Override
	@ExplodeLoop
	public Object execute(VirtualFrame frame) {
		final Object[] args = new Object[argNodes.length];
		for (int i = 0; i < argNodes.length; i++) {
			args[i] = argNodes[i].execute(frame);
		}
		return doInvoke(args);
	}
	
	@TruffleBoundary(allowInlining = true)
	private Object doInvoke(Object[] args) {
		return layoutValue.invokeMember("call", args);
	}
}
