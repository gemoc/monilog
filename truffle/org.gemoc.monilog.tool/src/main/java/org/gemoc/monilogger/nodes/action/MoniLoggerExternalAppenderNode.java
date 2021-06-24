package org.gemoc.monilogger.nodes.action;

import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;
import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;

@NodeChild(value = "message", type = MoniLoggerExecutableNode.class)
public abstract class MoniLoggerExternalAppenderNode extends MoniLoggerExecutableNode {
	
	private final Value appenderValue;

	@Children
	private final MoniLoggerExecutableNode[] argNodes;
	
	public MoniLoggerExternalAppenderNode(Value appenderValue, MoniLoggerExecutableNode[] argNodes) {
		this.appenderValue = appenderValue;
		this.argNodes = argNodes;
	}
	
	@ExplodeLoop
	@Specialization(guards = "message.isString()")
	public Object executeString(VirtualFrame frame, Value message) {
		final Object[] args = new Object[argNodes.length + 1];
		args[0] = message.asString();
		for (int i = 0; i < argNodes.length; i++) {
			args[i+1] = argNodes[i].execute(frame);
		}
		doInvoke(args);
		return null;
	}
	
	@ExplodeLoop
	@Specialization
	public Object executeString(VirtualFrame frame, String message) {
		final Object[] args = new Object[argNodes.length + 1];
		args[0] = message;
		for (int i = 0; i < argNodes.length; i++) {
			args[i+1] = argNodes[i].execute(frame);
		}
		doInvoke(args);
		return null;
	}
	
	@ExplodeLoop
	@Specialization
	public Object executeString(VirtualFrame frame, Object message) {
		final Object[] args = new Object[argNodes.length + 1];
		args[0] = message;
		for (int i = 0; i < argNodes.length; i++) {
			args[i+1] = argNodes[i].execute(frame);
		}
		doInvoke(args);
		return null;
	}
	
	@TruffleBoundary(allowInlining = true)
	private void doInvoke(Object[] args) {
		appenderValue.invokeMember("call", args);
	}
	
	
	
}
