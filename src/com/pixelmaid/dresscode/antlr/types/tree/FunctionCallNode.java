package com.pixelmaid.dresscode.antlr.types.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.pixelmaid.dresscode.antlr.types.FunctionType;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.data.DrawableManager;
import com.pixelmaid.dresscode.data.UserUIManager;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

public class FunctionCallNode  extends DCNode {

    private String identifier;
    private List<DCNode> params;
    private Map<String, FunctionType> functions;
    private double 	width,height;
    private int units;
    public FunctionCallNode(String id, List<DCNode> ps, Map<String, FunctionType> fs,double w, double h, int u, int l,int c) {
        identifier = id;
        params = ps == null ? new ArrayList<DCNode>() : ps;
        functions = fs;
        width=w;
        height=h;
        units = u;
        line = l;
        col=l;
    }

    @Override
    public VarType evaluate() {
    	
        FunctionType f = functions.get(identifier + params.size());
        if(f == null) {
        	
        		throw new RuntimeException("no function `" + identifier + "` with " + params.size() + " parameter(s)");
        
        }

        FunctionType function = new FunctionType(f);

        VarType result = function.invoke(params, functions,(DrawableManager) this.getListenerAt(0),(UserUIManager) this.getListenerAt(1),width,height,units);
        if(result.isDrawable()){
        	Drawable d = result.asDrawable();
        	d.setLine(line);
        	d.setIdentifier(null);
        	System.out.println("function call drawable recognized");
        }
        return result;
    }
}
