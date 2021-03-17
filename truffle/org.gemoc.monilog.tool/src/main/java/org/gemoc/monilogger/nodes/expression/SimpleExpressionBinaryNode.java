package org.gemoc.monilogger.nodes.expression;

import com.oracle.truffle.api.dsl.NodeChild;

@NodeChild("leftNode")
@NodeChild("rightNode")
public abstract class SimpleExpressionBinaryNode extends SimpleExpressionNode {
}
