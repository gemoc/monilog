package org.gemoc.monilogger.nodes.expression;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;

@NodeInfo(shortName = "const")
public final class SimpleExpressionLongLiteralNode extends SimpleExpressionNode {

    private final long value;

    public SimpleExpressionLongLiteralNode(long value) {
        this.value = value;
    }

    @Override
    public long executeLong(VirtualFrame frame) throws UnexpectedResultException {
        return value;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        return value;
    }
}
