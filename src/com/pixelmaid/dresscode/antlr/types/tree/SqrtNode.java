package com.pixelmaid.dresscode.antlr.types.tree;



import com.pixelmaid.dresscode.antlr.types.VarType;

public class SqrtNode extends DCNode {

	protected DCNode param;

    protected int line;


  public SqrtNode(DCNode p, int l, int c) {
      param = p;
      line = l;
      col=c;
     
  }

  @Override
  public VarType evaluate() {
  	
  	try{
		double d= Math.sqrt(param.evaluate().asDouble());
	  	
	  	return new VarType(d);
  	}
  	catch (ClassCastException e){
  		throw new RuntimeException("Illegal square root function call at line:"+ line+" : " + this);
  	}
  }

}

