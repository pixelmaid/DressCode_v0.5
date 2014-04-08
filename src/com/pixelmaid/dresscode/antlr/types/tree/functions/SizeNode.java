package com.pixelmaid.dresscode.antlr.types.tree.functions;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;

public class SizeNode extends DCNode {

    private DCNode expression;

    public SizeNode(DCNode e, int l, int c) {
        expression = e;
        line = l;
        col=c;
    }

    @Override
    public VarType evaluate() {
        VarType value = expression.evaluate();

        if(value.isString()) {
            return new VarType(value.asString().length());
        }

        if(value.isList()) {
            return new VarType(value.asList().size());
        }
        
        if(value.isDrawable()){
        	return new VarType(value.asDrawable().numChildren());
    	}
        throw new RuntimeException("Illegal function call: " + this);
    }

    @Override
    public String toString() {
        return String.format("size(%s)", expression);
    }
}
