package com.pixelmaid.dresscode.antlr.types.tree;



import com.pixelmaid.dresscode.antlr.types.VarType;

public class TanNode  extends DCNode {

	protected DCNode param;



  public TanNode(DCNode p, int l, int c) {
      param = p;
      line = l;
      col=c;
     
  }

  @Override
  public VarType evaluate() {
  	
  	try{
  		
  	double d= Math.tan(Math.toRadians((param.evaluate().asDouble())));
  	
  	return new VarType(d);
  	}
  	catch (ClassCastException e){
  		throw new RuntimeException("Illegal cosine function call at line:"+ line+" : " + this);
  	}
  }

}

