package org.gemoc.monilogger;

import java.util.Collections;
import java.util.function.Function;

import org.gemoc.monilog.moniLog.ASTEvent;
import org.gemoc.monilog.moniLog.BeforeASTEvent;
import org.gemoc.monilog.moniLog.CallEvent;
import org.gemoc.monilog.moniLog.MoniLogPackage;
import org.gemoc.monilog.moniLog.WriteEvent;
import org.gemoc.monilogger.nodes.MoniLoggerASTEventNode;
import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;

import com.oracle.truffle.api.instrumentation.EventContext;
import com.oracle.truffle.api.instrumentation.ExecutionEventNode;
import com.oracle.truffle.api.instrumentation.ExecutionEventNodeFactory;
import com.oracle.truffle.api.instrumentation.StandardTags.WriteVariableTag;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.UnknownIdentifierException;
import com.oracle.truffle.api.interop.UnsupportedMessageException;
import com.oracle.truffle.api.nodes.Node;

public class MoniLoggerASTEventNodeFactory implements ExecutionEventNodeFactory {

	private final String name;
	private final boolean call;
	private final boolean before;

	private final Function<Node, MoniLoggerExecutableNode> moniloggerFactory;

	MoniLoggerASTEventNodeFactory(ASTEvent event, Function<Node, MoniLoggerExecutableNode> moniloggerFactory) {
		switch (event.eClass().getClassifierID()) {
		case MoniLogPackage.WRITE_EVENT: {
			this.name = ((WriteEvent) event).getElement().getName();
			this.call = false;
			break;
		}
		case MoniLogPackage.CALL_EVENT: {
			final CallEvent callEvent = (CallEvent) event;
			this.name = callEvent.getElement().getName();
			this.call = true;
			break;
		}
		default:
			throw new IllegalArgumentException();
		}
		this.before = event.getKind() instanceof BeforeASTEvent;
		this.moniloggerFactory = moniloggerFactory;
	}

	@Override
	public ExecutionEventNode create(final EventContext ec) {
		if (call) {
			return new MoniLoggerASTEventNode(before, /* TODO */ Collections.emptyList(),
					moniloggerFactory.apply(ec.getInstrumentedNode()));
		} else {
			final Object nodeObject = ec.getNodeObject();
			if (nodeObject != null) {
				final InteropLibrary lib = InteropLibrary.getUncached(ec.getNodeObject());
				try {
					if (lib.isMemberReadable(nodeObject, WriteVariableTag.NAME)
							&& lib.readMember(nodeObject, WriteVariableTag.NAME).equals(name)) {
						return new MoniLoggerASTEventNode(before, /* TODO */ Collections.emptyList(),
								moniloggerFactory.apply(ec.getInstrumentedNode()));
					}
				} catch (UnsupportedMessageException | UnknownIdentifierException e) {
					e.printStackTrace();
				}
			}
			return null;
		}
	}
}
