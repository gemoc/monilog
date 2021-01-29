package org.gemoc.monilogger.nodes.action;

import java.util.logging.Level;

import org.gemoc.monilogger.MoniLoggerInstrument;
import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;
import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.TruffleLogger;
import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;

public class MoniLoggerExternalLayoutNode extends MoniLoggerExecutableNode {
	
	private final Value layoutValue;

	@Children
	private final MoniLoggerExecutableNode[] argNodes;
	
	private final TruffleLogger logger;
	private final Level level;
	
	public MoniLoggerExternalLayoutNode(Value layoutValue, MoniLoggerExecutableNode[] argNodes, Level level) {
		this.layoutValue = layoutValue;
		this.argNodes = argNodes;
		this.level = level;
		this.logger = TruffleLogger.getLogger(MoniLoggerInstrument.ID);
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
