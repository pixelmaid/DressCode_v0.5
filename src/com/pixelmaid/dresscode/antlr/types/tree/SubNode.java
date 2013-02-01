package com.pixelmaid.dresscode.antlr.types.tree;



import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;

public class SubNode implements DCNode {

    private DCNode lhs;
    private DCNode rhs;

    public SubNode(DCNode lhs, DCNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public VarType evaluate() {

        VarType a = lhs.evaluate();
        VarType b = rhs.evaluate();

        // number - number
        if(a.isNumber() && b.isNumber()) {
            return new VarType(a.asDouble() - b.asDouble());
        }

        // list - any
        if(a.isList()) {
            List<VarType> list = a.asList();
            list.remove(b);
            return new VarType(list);
        }

        throw new RuntimeException("illegal expression: " + this);
    }

    @Override
    public String toString() {
        return String.format("(%s - %s)", lhs, rhs);
    }
}
