package com.pixelmaid.dresscode.antlr.types.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.pixelmaid.dresscode.antlr.types.DrawableFunctionType;
import com.pixelmaid.dresscode.antlr.types.FunctionType;
import com.pixelmaid.dresscode.antlr.types.VarType;

public class FunctionCallNode implements DCNode {

    private String identifier;
    private List<DCNode> params;
    private Map<String, FunctionType> functions;

    public FunctionCallNode(String id, List<DCNode> ps, Map<String, FunctionType> fs) {
        identifier = id;
        params = ps == null ? new ArrayList<DCNode>() : ps;
        functions = fs;
    }

    @Override
    public VarType evaluate() {
    	
    	//System.out.println("calling function:"+identifier.toString());
        FunctionType f = functions.get(identifier + params.size());
        if(f == null) {
        	/*if(identifier.equals("ellipse")){
            	System.out.println("ellipse found");

        		DrawableFunctionType function = new DrawableFunctionType();
        		return function.invoke(params, functions);
        	}
        	else{
        		System.out.println("ellipse not found");*/
        		throw new RuntimeException("no function `" + identifier + "` with " + params.size() + " parameter(s)");
        	//}
        }

        FunctionType function = new FunctionType(f);

        return function.invoke(params, functions);
    }
}
