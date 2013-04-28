package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;



import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

public class NoFillNode extends NodeEvent implements DCNode {

	protected DCNode param;

    protected int line;


    
    public NoFillNode(DCNode p, int l) {
        param = p;
        line = l;
       
    }

    @Override
    public VarType evaluate() {
    	Drawable d;
    	
    	try{
    		
    	d= (param.evaluate().asDrawable());
    	d.setLine(line);

    	d.doFill(false);
    	return new VarType(d);
    	}
    	catch (ClassCastException e){
    		throw new RuntimeException("Illegal noStroke function call at line:"+ line+" : " + this);
    	}
    }

   
}
