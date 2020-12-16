package org.gemoc.monilogger.nodes;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.frame.VirtualFrame;

public class MoniLoggerCallSourceNode extends MoniLoggerExecutableNode {

	private final Context context;
	private final Source source;
	private final Value ast;

	public MoniLoggerCallSourceNode(Context context, Source source) {
		this.context = context;
		this.source = source;
		this.ast = this.context.parse(this.source);
	}

	public Object execute(VirtualFrame frame) {
		return doExecute();
	}

	@TruffleBoundary
	private Object doExecute() {
		return ast.execute();
	}
}
