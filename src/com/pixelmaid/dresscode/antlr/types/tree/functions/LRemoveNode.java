package com.pixelmaid.dresscode.antlr.types.tree.functions;


import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

public class LRemoveNode extends NodeEvent implements DCNode {

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
					Drawable d1 = a.asDrawable();
					Drawable d2 = b.asDrawable();
					d1.removeFromGroup(d2);
					d1.setLine(line);
					return new VarType(d1);
				}
				if(a.isDrawable() && b.isNumber()) {
					Drawable d1 = a.asDrawable();
					int i = b.asDouble().intValue();
					d1.removeFromGroup(i);
					d1.setLine(line);
					return new VarType(d1);
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

