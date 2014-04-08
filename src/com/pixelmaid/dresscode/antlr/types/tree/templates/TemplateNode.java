package com.pixelmaid.dresscode.antlr.types.tree.templates;


import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.functions.DrawableNode;
import com.pixelmaid.dresscode.data.templates.Template;
import com.pixelmaid.dresscode.data.templates.TemplateManager;
import com.pixelmaid.dresscode.drawing.primitive2d.Rectangle;
import com.pixelmaid.dresscode.events.CustomEvent;


public class TemplateNode extends DrawableNode {

    public TemplateNode(List<DCNode> ps, int l, int c) {
    	 super(ps,l,c);
    	
    }

    @Override
    public VarType evaluate() {
		

		try{
			String name = params.get(0).evaluate().asString();
			Template e = new Template(name);
			if(params.size()>2){
			
					double width = params.get(1).evaluate().asDouble();
					double height = params.get(2).evaluate().asDouble();
					e.setWidth(width);
					e.setHeight(height);
			}
			if(params.size()>3){	
					double seam = params.get(3).evaluate().asDouble();
					e.setSeam(seam);

				}
			if(params.size()>4){	
				double rad = params.get(4).evaluate().asDouble();
				e.setRad(rad);

			}	
					

				
				
			
			
			TemplateManager.addTemplate(e);
			this.fireDrawableEvent(CustomEvent.TEMPLATE_CREATED, e);
			e.setLine(line);
			return new VarType(e);	
		}
		catch (ClassCastException err){
			//Window.output.setText("incorrect parameters for rectangle call at line:"+line);

			System.err.println("incorrect parameters for Template at line:"+line);
			return null;

		}
		
		//throw new RuntimeException("Illegal function call: " + this);
	}

   
}
