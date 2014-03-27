package com.pixelmaid.dresscode.antlr.types.tree.templates;


import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.functions.DrawableNode;
import com.pixelmaid.dresscode.data.templates.Template;
import com.pixelmaid.dresscode.data.templates.TemplateManager;
import com.pixelmaid.dresscode.drawing.primitive2d.Rectangle;
import com.pixelmaid.dresscode.events.CustomEvent;


public class TemplateSetSeamNode extends DrawableNode implements DCNode {

    public TemplateSetSeamNode(List<DCNode> ps, int l, int c) {
       super(ps,l);
    	
    }

    @Override
    public VarType evaluate() {
		

		try{
			
			Template e = params.get(0).evaluate().asTemplate();
			if(params.size()==2){
			
					double seam = params.get(1).evaluate().asDouble();
					e.setSeam(seam);
				
			}
			return new VarType(e);	
		}
		catch (ClassCastException err){
			//Window.output.setText("incorrect parameters for rectangle call at line:"+line);

			System.err.println("incorrect parameters for Template Set Width at line:"+line);
			return null;

		}
		
		//throw new RuntimeException("Illegal function call: " + this);
	}

   
}