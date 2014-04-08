package com.pixelmaid.dresscode.antlr.types.tree.functions;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;

public class AssertNode extends DCNode {

    private DCNode expression;

    public AssertNode(DCNode e, int l, int c) {
        expression = e;
        line = l;
        col=c;
    }

    @Override
    public VarType evaluate() {

        VarType value = expression.evaluate();

        if(!value.isBoolean()) {
            throw new RuntimeException("assert(...) only takes boolean expressions");
        }

        if(!value.asBoolean()) {
            throw new AssertionError(expression.toString());
        }

        return VarType.VOID;
    }
}
