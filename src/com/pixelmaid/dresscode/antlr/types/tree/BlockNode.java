package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.functions.DrawableNode;
import com.pixelmaid.dresscode.antlr.types.tree.functions.RectangleNode;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.CustomEventListener;

import java.util.ArrayList;
import java.util.List;

public class BlockNode extends DCNode {

  protected List<DCNode> statements;
  protected DCNode returnStatement;

  public BlockNode() {
    statements = new ArrayList<DCNode>();
    returnStatement = null;
  }

  public DCNode getStatementAt(int i){
	  return statements.get(i);
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
      //System.out.println("statement at line="+statements.get(i).getLine());
      //System.out.println("statement is ="+statements.get(i));

      if(value != VarType.VOID) {
        // return early from this block if value is a return statement
        //return value;
      }
      
      //if value is drawable then add it to master drawable and remove it from the canvas
      if (value.isDrawable()){
    	 d = value.asDrawable();
    	 
    	  drawAdded=true;
      }
    }
	
 // return VOID or returnStatement.evaluate() if it's not null
	 if(returnStatement ==null){
		 if(drawAdded){
			 //TODO: add actual line number instead of 0 here
			
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
  
  public int getNumStatements(){
	  return statements.size();
  }
}

