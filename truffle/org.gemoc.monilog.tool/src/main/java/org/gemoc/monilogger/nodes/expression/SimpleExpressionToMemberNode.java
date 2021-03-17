package org.gemoc.monilogger.nodes.expression;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
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
public abstract class SimpleExpressionToMemberNode extends Node {

    static final int LIMIT = 5;

    public abstract String execute(Object value) throws UnknownIdentifierException;

    @Specialization
    protected static String fromString(String value) {
        return value;
    }

    @Specialization
    protected static String fromBoolean(boolean value) {
        return String.valueOf(value);
    }

    @Specialization
    @TruffleBoundary
    protected static String fromLong(long value) {
        return String.valueOf(value);
    }

    @Specialization
    @TruffleBoundary
    protected static String fromDouble(double value) {
        return String.valueOf(value);
    }

    @Specialization(limit = "LIMIT")
    protected static String fromInterop(Object value, @CachedLibrary("value") InteropLibrary interop) throws UnknownIdentifierException {
        try {
            if (interop.fitsInLong(value)) {
                return longToString(interop.asLong(value));
            } else if (interop.fitsInDouble(value)) {
                return doubleToString(interop.asDouble(value));
            } else if (interop.isString(value)) {
                return interop.asString(value);
            } else {
                throw error(value);
            }
        } catch (UnsupportedMessageException e) {
            CompilerDirectives.transferToInterpreter();
            throw new AssertionError();
        }
    }

    @TruffleBoundary
    private static UnknownIdentifierException error(Object value) {
        return UnknownIdentifierException.create(value.toString());
    }

    @TruffleBoundary
    private static String doubleToString(double doubleValue) {
        return String.valueOf(doubleValue);
    }

    @TruffleBoundary
    private static String longToString(long longValue) {
        return String.valueOf(longValue);
    }

}
