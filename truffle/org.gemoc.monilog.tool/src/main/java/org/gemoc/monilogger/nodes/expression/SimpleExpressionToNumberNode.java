package org.gemoc.monilogger.nodes.expression;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.dsl.GenerateUncached;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.dsl.TypeSystemReference;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.UnknownIdentifierException;
import com.oracle.truffle.api.interop.UnsupportedMessageException;
import com.oracle.truffle.api.library.CachedLibrary;
import com.oracle.truffle.api.nodes.Node;

@TypeSystemReference(SimpleExpressionTypes.class)
@GenerateUncached
public abstract class SimpleExpressionToNumberNode extends Node {

	static final int LIMIT = 5;

	public abstract Object execute(Object value) throws UnknownIdentifierException;

	@Specialization
	protected static double fromDouble(double value) {
		return value;
	}

	@Specialization
	protected static long fromLong(long value) {
		return value;
	}

	@Specialization(guards = { "interop.fitsInDouble(value)" }, limit = "LIMIT")
	protected static double fromInteropDouble(Object value, @CachedLibrary("value") InteropLibrary interop) {
		try {
			return interop.asDouble(value);
		} catch (UnsupportedMessageException e) {
			CompilerDirectives.transferToInterpreter();
			throw new AssertionError();
		}
	}

	@Specialization(guards = { "interop.fitsInLong(value)" }, limit = "LIMIT")
	protected static long fromInteropLong(Object value, @CachedLibrary("value") InteropLibrary interop) {
		try {
			return interop.asLong(value);
		} catch (UnsupportedMessageException e) {
			CompilerDirectives.transferToInterpreter();
			throw new AssertionError();
		}
	}
}
