package com.pixelmaid.dresscode.antlr.types.tree.functions;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;

public class SizeNode implements DCNode {

    private DCNode expression;

    public SizeNode(DCNode e) {
        expression = e;
    }

    @Override
    public VarType evaluate() {
        VarType value = expression.evaluate();

        if(value.isString()) {
            return new VarType(value.asString().length());
        }

        if(value.isList()) {
            return new VarType(value.asList().size());
        }

        throw new RuntimeException("Illegal function call: " + this);
    }

    @Override
    public String toString() {
        return String.format("size(%s)", expression);
    }
}
