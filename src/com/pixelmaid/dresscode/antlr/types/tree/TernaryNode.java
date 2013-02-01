package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;

public class TernaryNode implements DCNode {

    private DCNode condition;
    private DCNode ifTrue;
    private DCNode ifFalse;

    public TernaryNode(DCNode c, DCNode t, DCNode f) {
        condition = c;
        ifTrue = t;
        ifFalse = f;
    }

    @Override
    public VarType evaluate() {

        VarType a = condition.evaluate();

        if(!a.isBoolean()) {
            throw new RuntimeException("not a boolean expression: " + condition + ", in: " + this);
        }

        return a.asBoolean() ? ifTrue.evaluate() : ifFalse.evaluate();
    }

    @Override
    public String toString() {
        return String.format("(%s ? %s : %s)", condition, ifTrue, ifFalse);
    }
}
