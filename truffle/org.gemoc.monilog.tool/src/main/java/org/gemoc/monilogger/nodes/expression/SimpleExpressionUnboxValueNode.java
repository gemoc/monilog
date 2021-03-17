package org.gemoc.monilogger.nodes.expression;

import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;

@NodeChild(value = "value", type = SimpleExpressionNode.class)
public abstract class SimpleExpressionUnboxValueNode extends SimpleExpressionNode {

	protected long doLong(long value) {
		return value;
	}

	protected double doLong(double value) {
		return value;
	}

	protected boolean doLong(boolean value) {
		return value;
	}

	protected String doString(String value) {
		return value;
	}
	
	@Specialization(guards = {"value.isNumber()", "value.fitsInLong()"})
	protected long unboxLong(Value value) {
		return value.asLong();
	}

	@Specialization(guards = {"value.isNumber()"})
	protected double unboxDouble(Value value) {
		return value.asDouble();
	}
	
	@Specialization(guards = "value.isBoolean()")
	protected boolean unboxBoolean(Value value) {
		return value.asBoolean();
	}

	@Specialization(guards = "value.isString()")
	protected String unboxString(Value value) {
		return value.asString();
	}

	@Specialization(guards = "value.isHostObject()")
	protected Object unboxObject(Value value) {
		return value.asHostObject();
	}
	
	@Fallback
	protected Object doDefault(Object value) {
		return value;
	}
}
