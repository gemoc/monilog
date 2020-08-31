package org.gemoc.monilogger.nodes.condition;

import org.gemoc.monilog.moniLog4DSL.TemporalPropertyConditionKind;
import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;
import org.gemoc.monilogger.temporalpatterns.AbstractTemporalProperty.PropertyState;
import org.gemoc.monilogger.temporalpatterns.TruthValue;

import com.oracle.truffle.api.frame.VirtualFrame;

public class MoniLoggerTemporalPatternNode extends MoniLoggerExecutableNode {

	@Children
	private final MoniLoggerExecutableNode[] valueNodes;
	
	private PropertyState propertyState;
	private TemporalPropertyConditionKind kind;
	
	public MoniLoggerTemporalPatternNode(MoniLoggerExecutableNode[] valueNodes, PropertyState propertyState, TemporalPropertyConditionKind kind) {
		this.valueNodes = valueNodes;
		this.propertyState = propertyState;
		this.kind = kind;
	}
	
	public Object execute(VirtualFrame frame) {
		final boolean result;
		switch (propertyState.getValue()) {
		case SATISFIED:
			switch (kind) {
			case NS:
				result = false;
				break;
			case NV:
				result = true;
				break;
			case S:
				result = true;
				break;
			case V:
				result = false;
				break;
			default:
				throw new IllegalStateException();
			}
			break;
		case UNKNOWN:
			switch (kind) {
			case NS:
				result = true;
				break;
			case NV:
				result = true;
				break;
			case S:
				result = false;
				break;
			case V:
				result = false;
				break;
			default:
				throw new IllegalStateException();
			}
			break;
		case VIOLATED:
			switch (kind) {
			case NS:
				result = true;
				break;
			case NV:
				result = false;
				break;
			case S:
				result = false;
				break;
			case V:
				result = true;
				break;
			default:
				throw new IllegalStateException();
			}
			break;
		default:
			throw new IllegalStateException();
		}
		propertyState.setValue(TruthValue.UNKNOWN);
		return result;
	}

}
