package org.gemoc.monilogger.nodes.expression;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.exception.AbstractTruffleException;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.source.SourceSection;

public class SimpleExpressionException extends AbstractTruffleException {

	private static final long serialVersionUID = -6799734410727348507L;

	@TruffleBoundary
	public SimpleExpressionException(String message, Node location) {
		super(message, location);
	}

	@TruffleBoundary
	public static SimpleExpressionException typeError(Node operation, Object... values) {
		StringBuilder result = new StringBuilder();
		result.append("Type error");

		if (operation != null) {
			SourceSection ss = operation.getEncapsulatingSourceSection();
			if (ss != null && ss.isAvailable()) {
				result.append(" at ").append(ss.getSource().getName()).append(" line ").append(ss.getStartLine())
						.append(" col ").append(ss.getStartColumn());
			}
		}

		return new SimpleExpressionException(result.toString(), operation);
	}

}
