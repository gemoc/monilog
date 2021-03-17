package org.gemoc.monilogger.nodes.expression;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;

@NodeInfo(shortName = "const")
public final class SimpleExpressionBooleanLiteralNode extends SimpleExpressionNode {

    private final boolean value;

    public SimpleExpressionBooleanLiteralNode(boolean value) {
        this.value = value;
    }

    @Override
    public boolean executeBoolean(VirtualFrame frame) throws UnexpectedResultException {
        return value;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        return value;
    }
}
