package com.pixelmaid.dresscode.antlr.types.tree.UI;

import java.util.List;

import com.pixelmaid.dresscode.antlr.types.Scope;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.IdentifierNode;
import com.pixelmaid.dresscode.antlr.types.tree.LookupNode;
import com.pixelmaid.dresscode.app.ui.usercreated.Slider;
import com.pixelmaid.dresscode.drawing.primitive2d.DrawablePoint;
import com.pixelmaid.dresscode.drawing.primitive2d.Ellipse;
import com.pixelmaid.dresscode.events.CustomEvent;

public class SliderNode extends UINode {
	public SliderNode(List<DCNode> n, Scope s) {
		super(n,s);

	}

	@Override
	public VarType evaluate() {
		Slider s = new Slider();
		IdentifierNode l = (IdentifierNode)params.get(0);
		s.setId(l.getId());
		s.setLine(l.evaluate().getLine());
		double minT = params.get(1).evaluate().asDouble();
		double maxT = params.get(2).evaluate().asDouble();
		if(params.size()<4){
			s.init(0, 0, 150, 20, l.evaluate().asDouble().floatValue(), minT, maxT, s.getId(), "");
		}
		else{
			String name = params.get(3).evaluate().asString();
			s.init(0, 0, 150, 20, l.evaluate().asDouble().floatValue(), minT, maxT, name, "");

		}
		System.out.println("slider id="+s.getId());
		
		System.out.println("evaluating slider");
		System.out.println("slider value="+s.getSliderValue());
		this.fireUIEvent(CustomEvent.UI_CREATED, s);
		return new VarType(s);	
		//throw new RuntimeException("Illegal function call: " + this);
	}


}
