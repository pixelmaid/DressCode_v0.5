package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;

import java.util.List;

public class InNode extends DCNode {

    private DCNode lhs;
    private DCNode rhs;

    public InNode(DCNode lhs, DCNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public VarType evaluate() {

        VarType a = lhs.evaluate();
        VarType b = rhs.evaluate();

        if(!rhs.evaluate().isList()) {
            throw new RuntimeException("illegal expression: " + this);
        }

        List<VarType> list = b.asList();

        for(VarType val : list) {
            if(val.equals(a)) {
                return new VarType(true);
            }
        }

        return new VarType(false);
    }

    @Override
    public String toString() {
        return String.format("(%s in %s)", lhs, rhs);
    }
}
