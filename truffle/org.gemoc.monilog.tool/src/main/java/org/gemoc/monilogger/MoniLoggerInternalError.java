package org.gemoc.monilogger;

import com.oracle.truffle.api.CompilerAsserts;
import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.TruffleException;
import com.oracle.truffle.api.nodes.Node;

public final class MoniLoggerInternalError  extends Error implements TruffleException {

    private static final long serialVersionUID = 80698622974155216L;

    private final String verboseStackTrace;

    public MoniLoggerInternalError(String message, Object... args) {
        super(String.format(message, args));
        verboseStackTrace = createVerboseStackTrace();
    }

    public MoniLoggerInternalError(Throwable cause, String message, Object... args) {
        super(String.format(message, args), cause);
        CompilerAsserts.neverPartOfCompilation();
        verboseStackTrace = createVerboseStackTrace();
    }

    /**
     * Constructor that does not use {@code String.format} so that the message may contain
     * formatting instructions.
     */
    public MoniLoggerInternalError(Throwable cause, String message) {
        super(message, cause);
        CompilerAsserts.neverPartOfCompilation();
        verboseStackTrace = createVerboseStackTrace();
    }

    public String getVerboseStackTrace() {
        return verboseStackTrace;
    }

    public static void guarantee(boolean condition, String message) {
        if (!condition) {
            CompilerDirectives.transferToInterpreter();
            throw shouldNotReachHere("failed guarantee: " + message);
        }
    }

    public static void guarantee(boolean condition) {
        if (!condition) {
            CompilerDirectives.transferToInterpreter();
            throw shouldNotReachHere("failed guarantee");
        }
    }

    public static <T> T guaranteeNonNull(T value) {
        if (value == null) {
            CompilerDirectives.transferToInterpreter();
            throw shouldNotReachHere("should not be null");
        }
        return value;
    }

    public static RuntimeException unimplemented() {
        CompilerDirectives.transferToInterpreter();
        throw new MoniLoggerInternalError("not implemented");
    }

    public static RuntimeException unimplemented(String message) {
        CompilerDirectives.transferToInterpreter();
        throw new MoniLoggerInternalError("not implemented: %s", message);
    }

    public static RuntimeException unimplemented(String format, Object... args) {
        CompilerDirectives.transferToInterpreter();
        throw new MoniLoggerInternalError("not implemented: %s", String.format(format, args));
    }

    public static RuntimeException shouldNotReachHere() {
        CompilerDirectives.transferToInterpreter();
        throw new MoniLoggerInternalError("should not reach here");
    }

    public static RuntimeException shouldNotReachHere(Throwable cause) {
        CompilerDirectives.transferToInterpreter();
        throw new MoniLoggerInternalError(cause, "should not reach here");
    }

    public static RuntimeException shouldNotReachHere(String message) {
        CompilerDirectives.transferToInterpreter();
        throw new MoniLoggerInternalError("should not reach here: %s", message);
    }

    public static RuntimeException shouldNotReachHere(Throwable cause, String message) {
        CompilerDirectives.transferToInterpreter();
        throw new MoniLoggerInternalError(cause, "should not reach here: %s", message);
    }

    static String createVerboseStackTrace() {
        return "";
    }

    @Override
    public Node getLocation() {
        return null;
    }

    @Override
    public boolean isInternalError() {
        return true;
    }
}