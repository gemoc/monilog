package org.gemoc.monilogger.nodes.action;

import java.util.logging.Level;

import org.gemoc.monilogger.MoniLoggerInstrument;
import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;
import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.TruffleLogger;
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
	
	private final TruffleLogger logger;
	private final Level level;
	
	public MoniLoggerExternalAppenderNode(Value appenderValue, MoniLoggerExecutableNode[] argNodes, Level level) {
		this.appenderValue = appenderValue;
		this.argNodes = argNodes;
		this.level = level;
		this.logger = TruffleLogger.getLogger(MoniLoggerInstrument.ID);
	}
	
	@ExplodeLoop
	@Specialization(guards = "message.isString()")
	public Object executeString(VirtualFrame frame, Value message) {
		final Object[] args = new Object[argNodes.length];
		for (int i = 0; i < argNodes.length; i++) {
			args[i] = argNodes[i].execute(frame);
		}
		doInvoke(message.asString(), args);
		return null;
	}
	
	@ExplodeLoop
	@Specialization
	public Object executeString(VirtualFrame frame, String message) {
		final Object[] args = new Object[argNodes.length];
		for (int i = 0; i < argNodes.length; i++) {
			args[i] = argNodes[i].execute(frame);
		}
		doInvoke(message, args);
		return null;
	}
	
	@TruffleBoundary(allowInlining = true)
	private void doInvoke(String message, Object[] args) {
		appenderValue.invokeMember("call", message, args);
	}
}
