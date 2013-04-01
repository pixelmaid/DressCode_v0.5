package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;

public class NegateNode extends NodeEvent implements DCNode {

    private DCNode exp;

    public NegateNode(DCNode e) {
        exp = e;
    }

    @Override
    public VarType evaluate() {

        VarType v = exp.evaluate();

        if(!v.isBoolean()) {
            throw new RuntimeException("illegal expression: " + this);
        }

        return new VarType(!v.asBoolean());
    }

    @Override
    public String toString() {
        return String.format("(!%s)", exp);
    }
}
