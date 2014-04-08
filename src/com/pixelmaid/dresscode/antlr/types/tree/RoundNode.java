package com.pixelmaid.dresscode.antlr.types.tree;



import com.pixelmaid.dresscode.antlr.types.VarType;

public class RoundNode  extends DCNode {

	protected DCNode param;



  public RoundNode(DCNode p, int l, int c) {
      param = p;
      line = l;
      col=c;
     
  }

  @Override
  public VarType evaluate() {
  	
  	try{
  		
  	double d= Math.round(param.evaluate().asDouble());
  	
  	return new VarType(d);
  	}
  	catch (ClassCastException e){
  		throw new RuntimeException("Illegal cosine function call at line:"+ line+" : " + this);
  	}
  }

}

