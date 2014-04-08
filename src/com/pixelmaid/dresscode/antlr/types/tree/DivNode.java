package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;

public class DivNode extends DCNode {

    private DCNode lhs;
    private DCNode rhs;

    public DivNode(DCNode lhs, DCNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public VarType evaluate() {

        VarType a = lhs.evaluate();
        VarType b = rhs.evaluate();

        // number / number
        if(a.isNumber() && b.isNumber()) {
            return new VarType(a.asDouble() / b.asDouble());
        }

        throw new RuntimeException("illegal expression: " + this);
    }

    @Override
    public String toString() {
        return String.format("(%s / %s)", lhs, rhs);
    }
}
