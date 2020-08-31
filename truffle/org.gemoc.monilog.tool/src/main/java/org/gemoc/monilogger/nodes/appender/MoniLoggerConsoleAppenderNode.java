package org.gemoc.monilogger.nodes.appender;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import org.gemoc.monilogger.MoniLoggerInstrument;
import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.TruffleLogger;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;

public class MoniLoggerConsoleAppenderNode extends MoniLoggerExecutableNode {

	private final String formatString;
	@Children
	private final MoniLoggerExecutableNode[] valueNodes;
	
	private final TruffleLogger logger;
	private final Level level;
	
	public MoniLoggerConsoleAppenderNode(String formatString, MoniLoggerExecutableNode[] valueNodes, Level level) {
		this.valueNodes = valueNodes;
		if (formatString.isBlank()) {
			this.formatString = buildDefaultFormatString(valueNodes);
		} else {
			this.formatString = formatString;
		}
		this.level = level;
		this.logger = TruffleLogger.getLogger(MoniLoggerInstrument.ID);
	}
	
	@Override
	@ExplodeLoop
	public Object execute(VirtualFrame frame) {
		Object[] values = new Object[valueNodes.length];
		for (int i = 0; i < valueNodes.length; i++) {
			Object value = valueNodes[i].execute(frame);
			values[i] = value;
		}
		logger.log(level, formatString, values);
		return null;
	}
	
	@TruffleBoundary
	private <T> String buildDefaultFormatString(T[] array) {
		final List<String> strings = new ArrayList<>();
		for (int i = 0; i < valueNodes.length; i++) {
			strings.add("{" + i + "}");
		}
		return strings.stream().reduce((s1, s2) -> s1 + ", " + s2).get();
	}
}
