package org.gemoc.monilogger.nodes.expression;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "const")
public final class SimpleExpressionStringLiteralNode extends SimpleExpressionNode {

    private final String value;

    public SimpleExpressionStringLiteralNode(String value) {
        this.value = value;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        return value;
    }
}
