package com.pixelmaid.dresscode.antlr.types.tree.templates;


import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.functions.DrawableNode;
import com.pixelmaid.dresscode.data.templates.Template;
import com.pixelmaid.dresscode.data.templates.TemplateManager;
import com.pixelmaid.dresscode.drawing.primitive2d.Rectangle;
import com.pixelmaid.dresscode.events.CustomEvent;


public class TemplateNode extends DrawableNode implements DCNode {

    public TemplateNode(List<DCNode> ps, int l) {
       super(ps,l);
    	
    }

    @Override
    public VarType evaluate() {
		Template e = new Template();

		try{
			if(params.get(0).evaluate().isNumber()&&params.get(1).evaluate().isNumber()){
				double width = params.get(0).evaluate().asDouble();
				double height = params.get(1).evaluate().asDouble();
				if(params.size()>1){
					e.setWidth(width);
					e.setHeight(height);

				}
				if(params.size()>2){
					double seam = params.get(2).evaluate().asDouble();
					e.setSeam(seam);

				}
				if(params.size()>3){
					String name = params.get(3).evaluate().asString();
					e.setName(name);

				}
				else{
					//Window.output.setText("incorrect parameters for rectangle call at line:"+line);

					System.err.println("inccorect call for Template at "+line);
				}
			}
			else{
				//Window.output.setText("incorrect parameters for rectangle call at line:"+line);

				System.err.println("inccorect call for Template at "+line);
			}

			TemplateManager.addTemplate(e);
			this.fireDrawableEvent(CustomEvent.TEMPLATE_CREATED, e);
		}
		catch (ClassCastException err){
			//Window.output.setText("incorrect parameters for rectangle call at line:"+line);

			System.err.println("incorrect parameters for Template at line:"+line);

		}
		e.setLine(line);
		return new VarType(e);	
		//throw new RuntimeException("Illegal function call: " + this);
	}

   
}
