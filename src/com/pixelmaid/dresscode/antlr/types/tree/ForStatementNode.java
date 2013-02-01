package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.Scope;
import com.pixelmaid.dresscode.antlr.types.VarType;

public class ForStatementNode implements DCNode {

    private String identifier;
    private DCNode startExpr;
    private DCNode stopExpr;
    private DCNode block;
    protected Scope scope;

    public ForStatementNode(String id, DCNode start, DCNode stop, DCNode bl, Scope s) {
        identifier = id;
        startExpr = start;
        stopExpr = stop;
        block = bl;
        scope = s;
    }

    @Override
    public VarType evaluate() {

        int start = startExpr.evaluate().asDouble().intValue();
        int stop = stopExpr.evaluate().asDouble().intValue();

        for(int i = start; i <= stop; i++) {
            scope.assign(identifier, new VarType(i));
            VarType returnValue = block.evaluate();
            if(returnValue != VarType.VOID) {
                return returnValue;
            }
        }

        return VarType.VOID;
    }
}
