package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.Scope;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.app.Manager;
import com.pixelmaid.dresscode.app.Window;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

public class RepeatStatementNode implements DCNode {

    private String identifier;
    private DCNode startExpr;
    private DCNode stopExpr;
    private DCNode incrementExpr;
    private DCNode block;
    protected Scope scope;
    private DCNode returnStatement;
    private boolean lookup;


    public RepeatStatementNode(String id, DCNode start, DCNode stop, DCNode increment, DCNode bl, Scope s, boolean l) {
        identifier = id;
        startExpr = start;
        stopExpr = stop;
        incrementExpr=increment;
        block = bl;
        scope = s;
        lookup = l;
        System.out.println("lookup for repeat node ="+l);
    }
    
    public void addReturn(DCNode stat) {
        returnStatement = stat;
      }

    @Override
    public VarType evaluate() {
    	Drawable d = new Drawable();
    	boolean drawAdded=false;
        double start = startExpr.evaluate().asDouble().intValue();
        double stop = stopExpr.evaluate().asDouble().intValue();
        double increment = 1.0;
        if(incrementExpr!=null){
        	increment=startExpr.evaluate().asDouble();
        }
        for(double i = start; i <= stop; i+=increment) {
            scope.assign(identifier, new VarType(i));
            VarType returnValue = block.evaluate();
           
          if (returnValue.isDrawable()&&lookup){
            	 Drawable d2 = returnValue.asDrawable();
            	 d.addToGroup(d2);
            	 d2.removeFromCanvas();
            	 drawAdded=true;
            	 //System.out.println("added drawable in for loop at+"+i);
          	  
            }
            /*
            else if(returnValue != VarType.VOID ) {
                return returnValue;
                
            }*/
        }
     // return VOID or returnStatement.evaluate() if it's not null
   	 if(returnStatement ==null){
   		 if(drawAdded){
   			 //TODO: add actual line number instead of 0 here
   			Window.canvas.addDrawable("drawable",-1,d);
   			 return new VarType(d);
   		 }
   		 else{
   			 return VarType.VOID;
   		 }
   	 }
   	 else{
   		return returnStatement.evaluate();
   	 }

    }
}
