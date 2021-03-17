package org.gemoc.monilogger.nodes.expression;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;

@NodeInfo(shortName = "const")
public final class SimpleExpressionDoubleLiteralNode extends SimpleExpressionNode {

    private final double value;

    public SimpleExpressionDoubleLiteralNode(double value) {
        this.value = value;
    }

    @Override
    public double executeDouble(VirtualFrame frame) throws UnexpectedResultException {
        return value;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        return value;
    }
}
