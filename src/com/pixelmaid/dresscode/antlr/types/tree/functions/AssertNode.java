package com.pixelmaid.dresscode.antlr.types.tree.functions;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;

public class AssertNode implements DCNode {

    private DCNode expression;

    public AssertNode(DCNode e) {
        expression = e;
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
