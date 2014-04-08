package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.Scope;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

public class RepeatStatementNode extends DCNode {

    private String identifier;
    private DCNode startExpr;
    private DCNode stopExpr;
    private DCNode incrementExpr;
    private DCNode block;
    protected Scope scope;

    private boolean lookup;


    public RepeatStatementNode(String id, DCNode start, DCNode stop, DCNode increment, DCNode bl, Scope s, int l, int c) {
        identifier = id;
        startExpr = start;
        stopExpr = stop;
        incrementExpr=increment;
        block = bl;
        scope = s;
        line = l;
	    col=c;
        
        //System.out.println("lookup for repeat node ="+l);
    }
    
 

    @Override
    public VarType evaluate() {
    	Drawable d = new Drawable();
        double start = startExpr.evaluate().asDouble().intValue();
        double stop = stopExpr.evaluate().asDouble().intValue();
        double increment = 1.0;
        if(incrementExpr!=null){
        	increment=incrementExpr.evaluate().asDouble();
        }
        for(double i = start; i < stop; i+=increment) {
            scope.assign(identifier, new VarType(i));
            VarType returnValue = block.evaluate();
           
          if (returnValue.isDrawable()&&lookup){
            	 Drawable d2 = returnValue.asDrawable();
            	 d.addToGroup(d2);
            	 d2.removeFromCanvas();
            	 //System.out.println("added drawable in for loop at+"+i);
          	  
            }
            /*
            else if(returnValue != VarType.VOID ) {
                return returnValue;
                
            }*/
        }
   
   			 return VarType.VOID;
    }

}
