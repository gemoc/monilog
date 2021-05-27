package org.gemoc.monilogger.nodes.action;

import java.util.HashMap;
import java.util.Map;

import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;

public class MoniLoggerEmitEventNode extends MoniLoggerExecutableNode {

	private final String eventType;

	@Children
	private MoniLoggerExecutableNode[] values;
	
	public MoniLoggerEmitEventNode(String eventType, MoniLoggerExecutableNode[] values) {
		this.eventType = eventType;
		this.values = values;
	}

	@Override
	@ExplodeLoop
	public Object execute(VirtualFrame frame) {
		final Map<String, Object> event = new HashMap<>(values.length + 1);
		event.put(eventType, eventType);
		for (int i = 0; i < values.length; i++) {
			final Object value = values[i].execute(frame);
			event.put("prop"+i, value);
		}
//		TODO send the event somehow
		return null;
	}
}
