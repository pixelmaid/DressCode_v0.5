package com.pixelmaid.dresscode.antlr.types.tree;



import com.pixelmaid.dresscode.antlr.types.VarType;

public class TanNode  extends NodeEvent implements DCNode {

	protected DCNode param;

    protected int line;


  public TanNode(DCNode p, int l) {
      param = p;
      line = l;
     
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

