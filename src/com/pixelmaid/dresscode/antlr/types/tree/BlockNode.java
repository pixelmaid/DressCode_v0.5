package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;

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
    System.out.println("added statement, size="+statements.size());
  }


  public  VarType evaluate(String message) {
	  System.out.println("message="+message);
	  System.out.println(statements.size());
	  VarType value = evaluate();
	  return value;
  }
 @Override  
  public VarType evaluate(){
    for(int i=0;i<statements.size(); i++){
      VarType value = statements.get(i).evaluate();
      System.out.println(i);
      if(value != VarType.VOID) {
        // return early from this block if value is a return statement
        //return value;
      }
    }

    // return VOID or returnStatement.evaluate() if it's not null
    return returnStatement == null ? VarType.VOID : returnStatement.evaluate();
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

