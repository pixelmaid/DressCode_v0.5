package com.pixelmaid.dresscode.antlr.types.tree.functions;


import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

public class LAddNode extends NodeEvent implements DCNode {

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
					Drawable d1 = a.asDrawable();
					Drawable d2 = b.asDrawable();
					d1.addToGroup(d2);
					d1.setLine(line);
					return new VarType(d1);
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
					Drawable d1 = a.asDrawable();
					Drawable d2 = b.asDrawable();
					d1.addToGroup(d2,index);
					d1.setLine(line);
					return new VarType(d1);
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

