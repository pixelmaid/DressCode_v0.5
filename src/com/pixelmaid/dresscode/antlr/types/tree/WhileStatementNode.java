package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;

public class WhileStatementNode extends NodeEvent implements DCNode {

    private DCNode expression;
    private DCNode block;

    public WhileStatementNode(DCNode exp, DCNode bl) {
        expression = exp;
        block = bl;
    }

    @Override
    public VarType evaluate() {

        while(expression.evaluate().asBoolean()) {

            VarType returnValue = block.evaluate();

            if(returnValue != VarType.VOID) {
                return returnValue;
            }
        }

        return VarType.VOID;
    }
}
