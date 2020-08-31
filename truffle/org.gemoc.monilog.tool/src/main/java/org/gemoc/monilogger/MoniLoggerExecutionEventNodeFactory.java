package org.gemoc.monilogger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

import org.gemoc.monilog.moniLog4DSL.Event;
import org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage;
import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;
import org.gemoc.monilogger.nodes.MoniLoggerExecutionEventNodeGen;
import org.gemoc.monilogger.nodes.condition.MoniLoggerTrueNode;

import com.oracle.truffle.api.instrumentation.EventContext;
import com.oracle.truffle.api.instrumentation.ExecutionEventNode;
import com.oracle.truffle.api.instrumentation.ExecutionEventNodeFactory;
import com.oracle.truffle.api.nodes.Node;

public class MoniLoggerExecutionEventNodeFactory implements ExecutionEventNodeFactory {

	private final Map<String, Boolean> before = new HashMap<>();
	private final Map<String, Boolean> after = new HashMap<>();
	private final BiFunction<String, Node, MoniLoggerExecutableNode> conditionNodeFactory;
	private final BiFunction<String, Node, MoniLoggerExecutableNode> actionNodeFactory;

	MoniLoggerExecutionEventNodeFactory(List<Event> events, BiFunction<String, Node, MoniLoggerExecutableNode> conditionNodefactory,
			BiFunction<String, Node, MoniLoggerExecutableNode> actionNodefactory) {
		events.stream().forEach(e -> {
			switch (e.eClass().getClassifierID()) {
			case MoniLog4DSLPackage.BEFORE_EVENT:
				before.put(e.getRuleID(), true);
				after.put(e.getRuleID(), false);
				break;
			case MoniLog4DSLPackage.AFTER_EVENT:
				before.put(e.getRuleID(), false);
				after.put(e.getRuleID(), true);
				break;
			case MoniLog4DSLPackage.BEFORE_AFTER_EVENT:
				before.put(e.getRuleID(), true);
				after.put(e.getRuleID(), true);
				break;
			}
		});
		this.conditionNodeFactory = conditionNodefactory;
		this.actionNodeFactory = actionNodefactory;
	}

	@Override
	public ExecutionEventNode create(final EventContext ec) {
		final Node node = ec.getInstrumentedNode();
		final String id = ec.getInstrumentedNode().getRootNode().getLanguageInfo().getId();
		final String rootName = ec.getInstrumentedNode().getRootNode().getName();
		final MoniLoggerExecutableNode conditionNode = conditionNodeFactory == null ? new MoniLoggerTrueNode()
				: conditionNodeFactory.apply(id, node);
		final MoniLoggerExecutableNode actionNode = actionNodeFactory == null ? null : actionNodeFactory.apply(id, node);
		if (actionNode != null) {
			if (before.isEmpty() && after.isEmpty()) {
				return MoniLoggerExecutionEventNodeGen.create(false, true, actionNode, conditionNode);
			}
			return MoniLoggerExecutionEventNodeGen.create(before.get(rootName), after.get(rootName), actionNode,
					conditionNode);
		} else {
			return null;
		}
	}
}
