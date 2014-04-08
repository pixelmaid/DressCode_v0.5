package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;


import java.util.ArrayList;
import java.util.List;

public class MulNode extends DCNode {

    private DCNode lhs;
    private DCNode rhs;

    public MulNode(DCNode lhs, DCNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public VarType evaluate() {

        VarType a = lhs.evaluate();
        VarType b = rhs.evaluate();

        // number * number
        if(a.isNumber() && b.isNumber()) {
            return new VarType(a.asDouble() * b.asDouble());
        }

        // string * number
        if(a.isString() && b.isNumber()) {
            StringBuilder str = new StringBuilder();
            int stop = b.asDouble().intValue();
            for(int i = 0; i < stop; i++) {
                str.append(a.asString());
            }
            return new VarType(str.toString());
        }

        // list * number
        if(a.isList() && b.isNumber()) {
            List<VarType> total = new ArrayList<VarType>();
            int stop = b.asDouble().intValue();
            for(int i = 0; i < stop; i++) {
                total.addAll(a.asList());
            }
            return new VarType(total);
        }

        throw new RuntimeException("illegal expression: " + this);
    }

    @Override
    public String toString() {
        return String.format("(%s * %s)", lhs, rhs);
    }
}
