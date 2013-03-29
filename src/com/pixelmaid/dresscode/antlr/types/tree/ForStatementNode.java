package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.Scope;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.app.Manager;
import com.pixelmaid.dresscode.app.Window;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

public class ForStatementNode implements DCNode {

    private String identifier;
    private DCNode startExpr;
    private DCNode stopExpr;
    private DCNode block;
    protected Scope scope;
    private DCNode returnStatement;

    public ForStatementNode(String id, DCNode start, DCNode stop, DCNode bl, Scope s) {
        identifier = id;
        startExpr = start;
        stopExpr = stop;
        block = bl;
        scope = s;
    }
    
    public void addReturn(DCNode stat) {
        returnStatement = stat;
      }

    @Override
    public VarType evaluate() {
    	Drawable d = new Drawable();
    	boolean drawAdded=false;
        int start = startExpr.evaluate().asDouble().intValue();
        int stop = stopExpr.evaluate().asDouble().intValue();

        for(int i = start; i <= stop; i++) {
            scope.assign(identifier, new VarType(i));
            VarType returnValue = block.evaluate();
            if(returnValue != VarType.VOID && !returnValue.isDrawable()) {
                return returnValue;
                
            }
            else if (returnValue.isDrawable()){
            	  Drawable d2 = returnValue.asDrawable();
            	  d.addToGroup(d2);
            	  d2.removeFromCanvas();
            	  drawAdded=true;
            	  System.out.println("added drawable in for loop at+"+i);
          	  
            }
        }
    
   			 return VarType.VOID;
   	
    }
}
