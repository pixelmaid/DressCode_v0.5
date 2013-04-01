package com.pixelmaid.dresscode.antlr.types.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.pixelmaid.dresscode.antlr.types.FunctionType;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.data.DrawableManager;

public class FunctionCallNode  extends NodeEvent implements DCNode {

    private String identifier;
    private List<DCNode> params;
    private Map<String, FunctionType> functions;
    private int width,height;

    public FunctionCallNode(String id, List<DCNode> ps, Map<String, FunctionType> fs, int w, int h) {
        identifier = id;
        params = ps == null ? new ArrayList<DCNode>() : ps;
        functions = fs;
        width=w;
        height=h;
    }

    @Override
    public VarType evaluate() {
    	
    	
        FunctionType f = functions.get(identifier + params.size());
        if(f == null) {
        	
        		throw new RuntimeException("no function `" + identifier + "` with " + params.size() + " parameter(s)");
        
        }

        FunctionType function = new FunctionType(f);

        return function.invoke(params, functions,(DrawableManager) this.getListenerAt(0),width,height);
    }
}
