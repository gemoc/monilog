package org.gemoc.monilogger;

import java.util.Collections;
import java.util.function.BiFunction;

import org.gemoc.monilog.moniLog.ASTEvent;
import org.gemoc.monilog.moniLog.ASTEventKind;
import org.gemoc.monilog.moniLog.BeforeASTEvent;
import org.gemoc.monilogger.nodes.MoniLoggerASTEventNode;
import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;

import com.oracle.truffle.api.instrumentation.EventContext;
import com.oracle.truffle.api.instrumentation.ExecutionEventNode;
import com.oracle.truffle.api.instrumentation.ExecutionEventNodeFactory;
import com.oracle.truffle.api.nodes.Node;

public class MoniLoggerASTEventNodeFactory implements ExecutionEventNodeFactory {

	private final String name;
	private final boolean before;

	private final BiFunction<String, Node, MoniLoggerExecutableNode> moniloggerFactory;

	MoniLoggerASTEventNodeFactory(ASTEvent event, BiFunction<String, Node, MoniLoggerExecutableNode> moniloggerFactory) {
		this.name = event.getName();
		final ASTEventKind kind = event.getKind();
		this.before = kind instanceof BeforeASTEvent;
		this.moniloggerFactory = moniloggerFactory;
	}

	@Override
	public ExecutionEventNode create(final EventContext ec) {
		// TODO: for each property state
		final String languageId = ec.getInstrumentedSourceSection().getSource().getLanguage();
		return new MoniLoggerASTEventNode(name, before, /* TODO */ Collections.emptyList(),
				moniloggerFactory.apply(languageId, ec.getInstrumentedNode()));
	}
}
