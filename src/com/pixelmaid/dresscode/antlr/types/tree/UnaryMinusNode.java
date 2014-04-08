package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;

public class UnaryMinusNode extends DCNode {

    private DCNode exp;

    public UnaryMinusNode(DCNode e) {
        exp = e;
    }

    @Override
    public VarType evaluate() {

        VarType v = exp.evaluate();

        if(!v.isNumber()) {
            throw new RuntimeException("illegal expression: " + this);
        }

        return new VarType(-v.asDouble());
    }

    @Override
    public String toString() {
        return String.format("(-%s)", exp);
    }
}
