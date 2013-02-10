package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.app.Manager;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

import java.util.ArrayList;
import java.util.List;

public class BlockNode implements DCNode {

  private List<DCNode> statements;
  private DCNode returnStatement;

  public BlockNode() {
    statements = new ArrayList<DCNode>();
    returnStatement = null;
  }

  public void addReturn(DCNode stat) {
    returnStatement = stat;
  }

  public void addStatement(DCNode stat) {
	
    statements.add(stat);
    //System.out.println("added statement, size="+statements.size());
  }


 @Override  
  public VarType evaluate(){
    Drawable d = new Drawable();
	boolean drawAdded=false;
	 for(int i=0;i<statements.size(); i++){
      VarType value = statements.get(i).evaluate();
      
      if(value != VarType.VOID) {
        // return early from this block if value is a return statement
        //return value;
      }
      
      //if value is drawable then add it to master drawable and remove it from the canvas
      if (value.isDrawable()){
    	  Drawable d2 = value.asDrawable();
    	  d.add(d2);
    	  d2.removeFromCanvas();
    	  d2.setParent(d);
    	  drawAdded=true;
      }
    }
	
 // return VOID or returnStatement.evaluate() if it's not null
	 if(returnStatement ==null){
		 if(drawAdded){
			 //TODO: add actual line number instead of 0 here
			 Manager.canvas.addDrawable("drawable",-1,d);
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

  @Override
  public String toString() {
    StringBuilder b = new StringBuilder();
    for(DCNode stat : statements) {
      b.append(stat).append("\n");
    }
    if(returnStatement != null) {
      b.append("return ").append(returnStatement).append("\n");
    }
    return b.toString();
  }
}

