package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;

public class OrNode implements DCNode {

    private DCNode lhs;
    private DCNode rhs;

    public OrNode(DCNode lhs, DCNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public VarType evaluate() {

        VarType a = lhs.evaluate();
        VarType b = rhs.evaluate();

        if(!a.isBoolean() || !b.isBoolean()) {
            throw new RuntimeException("illegal expression: " + this);
        }

        return new VarType(a.asBoolean() || b.asBoolean());
    }

    @Override
    public String toString() {
        return String.format("(%s || %s)", lhs, rhs);
    }
}
