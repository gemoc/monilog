package org.gemoc.monilogger.nodes.expression;

import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;

public class MoniLoggerCallSourceNode extends SimpleExpressionNode {

	private final Context context;
	private final Source source;
	private final Value ast;
	@Children
	private MoniLoggerExecutableNode[] args;
	
	public MoniLoggerCallSourceNode(Context context, Source source) {
		this.context = context;
		this.source = source;
		this.ast = this.context.parse(this.source);
		this.args = new MoniLoggerExecutableNode[0];
	}
	
	public MoniLoggerCallSourceNode(Context context, Source source, Value ast, MoniLoggerExecutableNode[] args) {
		this.context = context;
		this.source = source;
		this.ast = ast;
		this.args = args;
	}
	
	@ExplodeLoop
	public Object execute(VirtualFrame frame) {
		if (args.length == 0) {
			return ast.execute();
		} else if (args.length == 1) {
			return ast.execute(args[0].execute(frame));
		} else {
			final Object[] effectiveArgs = new Object[args.length];
			for (int i = 0; i < args.length; i++) {
				effectiveArgs[i] = args[i].execute(frame);
			}
			return ast.execute(effectiveArgs);
		}
	}
}
