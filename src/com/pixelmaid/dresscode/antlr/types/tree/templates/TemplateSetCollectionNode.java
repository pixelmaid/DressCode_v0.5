package com.pixelmaid.dresscode.antlr.types.tree.templates;


import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.functions.DrawableNode;
import com.pixelmaid.dresscode.data.templates.Template;
import com.pixelmaid.dresscode.data.templates.TemplateManager;
import com.pixelmaid.dresscode.drawing.primitive2d.Rectangle;
import com.pixelmaid.dresscode.events.CustomEvent;


public class TemplateSetCollectionNode extends DrawableNode{

    public TemplateSetCollectionNode(List<DCNode> ps, int l, int c) {
    	 super(ps,l,c);
    	
    }

    @Override
    public VarType evaluate() {
		

		try{
			
			if(params.size()==1){
			
				String n = params.get(0).evaluate().asString();

				TemplateManager.setName(n);
				return new VarType(n);	
				
			}
			else{
				System.err.println("incorrect parameters for Template Set Collection at line:"+line);
				return null;

			}
			
		}
		catch (ClassCastException err){
			//Window.output.setText("incorrect parameters for rectangle call at line:"+line);

			System.err.println("incorrect parameters for Template Set Collection at line:"+line);
			return null;

		}
		
		//throw new RuntimeException("Illegal function call: " + this);
	}

   
}
