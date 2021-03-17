package org.gemoc.monilogger.nodes.expression;

import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;

@NodeChild("receiverNode")
public abstract class SimpleExpressionReadPropertyNode extends SimpleExpressionNode {

	static final int LIBRARY_LIMIT = 3;
	
	private final String propertyName;
	
	public SimpleExpressionReadPropertyNode(String propertyName) {
		this.propertyName = propertyName;
	}

	@Specialization(guards = "receiver.hasMembers()")
	protected Object readObject(Value receiver) {
		return receiver.getMember(propertyName);
	}
}
