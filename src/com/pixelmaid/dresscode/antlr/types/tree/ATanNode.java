package com.pixelmaid.dresscode.antlr.types.tree;



import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;

public class ATanNode  extends NodeEvent implements DCNode {

	protected List<DCNode> params;

    protected int line;


  public ATanNode(List<DCNode> ps, int l) {
      params = ps;
      line = l;
     
  }

  @Override
  public VarType evaluate() {
  	
  	try{
  		
  	double d= Math.atan2(params.get(0).evaluate().asDouble(),params.get(1).evaluate().asDouble());
  	
  	return new VarType(Math.toDegrees(d));
  	}
  	catch (ClassCastException e){
  		throw new RuntimeException("Illegal atan function call at line:"+ line+" : " + this);
  	}
  }

}

