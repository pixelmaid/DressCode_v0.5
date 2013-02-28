package com.pixelmaid.dresscode.antlr.types.tree.functions;


import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;

public class LRemoveNode implements DCNode {

	protected List<DCNode> params;
	protected int line;


	public LRemoveNode(List<DCNode> ps, int l) {
		params= ps;
		line = l;

	}

	@Override
	public VarType evaluate() {
		if(params.size()==2){

			VarType a = params.get(0).evaluate();
			VarType b = params.get(1).evaluate();

			// number + number
			
				if(a.isDrawable() && b.isDrawable()) {
					return new VarType(a.asDrawable().removeFromGroup(b.asDrawable()));
				}
				if(a.isDrawable() && b.isNumber()) {
					return new VarType(a.asDrawable().removeFromGroup(b.asDouble().intValue()));
				}

				// list + any
				if(a.isList()) {
					List<VarType> list = a.asList();
					list.remove(b);
					return new VarType(list);
				}

				// string + any
				if(a.isString()&& b.isString()) {
					String newStr = a.asString().replaceAll(b.asString(),"");
					return new VarType(newStr);
				}

			
			
		}

		throw new RuntimeException("illegal expression: " + this);
	}


}

