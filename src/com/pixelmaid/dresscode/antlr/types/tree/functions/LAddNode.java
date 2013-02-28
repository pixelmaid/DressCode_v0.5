package com.pixelmaid.dresscode.antlr.types.tree.functions;


import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;

public class LAddNode implements DCNode {

	protected List<DCNode> params;
	protected int line;


	public LAddNode(List<DCNode> ps, int l) {
		params= ps;
		line = l;

	}

	@Override
	public VarType evaluate() {
		if(params.size()>=2){

			VarType a = params.get(0).evaluate();
			VarType b = params.get(1).evaluate();

			// number + number
			if(params.size()==2){
				if(a.isDrawable() && b.isDrawable()) {
					return new VarType(a.asDrawable().addToGroup(b.asDrawable()));
				}

				// list + any
				if(a.isList()) {
					List<VarType> list = a.asList();
					list.add(b);
					return new VarType(list);
				}

				// string + any
				if(a.isString()&& b.isString()) {
					return new VarType(a.asString() + "" + b.toString());
				}

				
			}
			else if(params.size()==3&&params.get(2).evaluate().isNumber()){
				int index = params.get(2).evaluate().asDouble().intValue();
				if(a.isDrawable() && b.isDrawable()) {
					return new VarType(a.asDrawable().addToGroup(b.asDrawable(),index));
				}

				// list + any
				if(a.isList()) {
					List<VarType> list = a.asList();
					list.add(index,b);
					return new VarType(list);
				}

				// string + any
				if(a.isString()&&b.isString()) {
					
					return new VarType(a.asString().substring(0,index) + b.asString()+a.asString().substring(index,a.asString().length()));
				}

			
			}
		}

		throw new RuntimeException("illegal expression: " + this);
	}


}

