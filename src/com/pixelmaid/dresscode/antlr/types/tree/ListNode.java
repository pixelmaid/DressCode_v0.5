package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;


import java.util.ArrayList;
import java.util.List;

public class ListNode extends NodeEvent implements DCNode {

    private List<DCNode> expressionNodes;

    public ListNode(List<DCNode> nodes) {
        expressionNodes = (nodes == null) ? new ArrayList<DCNode>() : nodes;
    }

    @Override
    public VarType evaluate() {
        List<VarType> evaluated = new ArrayList<VarType>();
        for(DCNode node : expressionNodes) {
            evaluated.add(node.evaluate());
        }
        return new VarType(evaluated);
    }

    @Override
    public String toString() {
        return expressionNodes.toString();
    }
}
