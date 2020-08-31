package org.gemoc.monilogger.nodes.appender;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.TruffleFile;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;

public class MoniLoggerFileAppenderNode extends MoniLoggerExecutableNode {
	
	@Children
	private final MoniLoggerExecutableNode[] valueNodes;
	
	private final TruffleFile file;
	
	private final String formatString;
	
	public MoniLoggerFileAppenderNode(TruffleFile file, String formatString, MoniLoggerExecutableNode[] valueNodes) {
		this.file = file;
		this.valueNodes = valueNodes;
		if (formatString.isBlank()) {
			this.formatString = buildDefaultFormatString(valueNodes);
		} else {
			this.formatString = formatString;
		}
	}
	
	@Override
	@ExplodeLoop
	public Object execute(VirtualFrame frame) {
		Object[] values = new Object[valueNodes.length];
		for (int i = 0; i < valueNodes.length; i++) {
			values[i] = valueNodes[i].execute(frame);
		}
		try(BufferedWriter writer = file.newBufferedWriter(StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
			writer.append(format(formatString, values));
			writer.newLine();
		} catch (IOException e) { 
			e.printStackTrace();
		}
		return null;
	}
	
	@TruffleBoundary
	private <T> String buildDefaultFormatString(T[] array) {
		final List<String> strings = new ArrayList<>();
		for (int i = 0; i < valueNodes.length; i++) {
			strings.add("{" + (i) + "}");
		}
		return strings.stream().reduce((s1, s2) -> s1 + ", " + s2).get();
	}
	
	@TruffleBoundary
	private String format(String formatString, Object[] values) {
		return MessageFormat.format(formatString, values);
	}

}
