package org.gemoc.monilogger.nodes;

import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;

@NodeChild(value = "value", type = MoniLoggerExecutableNode.class)
public abstract class MoniLoggerUnboxNode extends MoniLoggerExecutableNode {

//	@Specialization(guards = {"values.isNumber(value)", "values.fitsInInt(value)"}, limit = "3")
//	protected int doInt(VirtualFrame frame, Object value,
//			@CachedLibrary("value") InteropLibrary values) {
//		try {
//			return values.asInt(value);
//		} catch (UnsupportedMessageException e) {
//			e.printStackTrace();
//		}
//		return 0;
//	}
//
//	@Specialization(guards = {"values.isNumber(value)", "values.fitsInDouble(value)"}, limit = "3")
//	protected double doDouble(VirtualFrame frame, Object value,
//			@CachedLibrary("value") InteropLibrary values) {
//		try {
//			return values.asDouble(value);
//		} catch (UnsupportedMessageException e) {
//			e.printStackTrace();
//		}
//		return 0;
//	}
//
//	@Specialization(guards = {"values.isString(value)"}, limit = "3")
//	protected String doString(VirtualFrame frame, Object value,
//			@CachedLibrary("value") InteropLibrary values) {
//		try {
//			return values.asString(value);
//		} catch (UnsupportedMessageException e) {
//			e.printStackTrace();
//		}
//		return "";
//	}

	@Specialization(guards = {"value.isNumber()", "value.fitsInInt()"})
	protected int doInt(VirtualFrame frame, Value value) {
		try {
			return value.asInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Specialization(guards = {"value.isNumber()", "value.fitsInDouble()"})
	protected double doDouble(VirtualFrame frame, Value value) {
		try {
			return value.asDouble();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Specialization(guards = {"value.isString()"})
	protected String doString(VirtualFrame frame, Value value) {
		try {
			return value.asString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
}
