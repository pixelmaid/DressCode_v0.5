package com.pixelmaid.dresscode.antlr.types.tree;



import com.pixelmaid.dresscode.antlr.types.VarType;

public class DegreeNode extends NodeEvent implements DCNode {

	protected DCNode param;

    protected int line;


  public DegreeNode(DCNode p, int l) {
      param = p;
      line = l;
     
  }

  @Override
  public VarType evaluate() {
  	
  	try{
  		
  	double d= Math.toRadians((param.evaluate().asDouble()));
  	
  	return new VarType(d);
  	}
  	catch (ClassCastException e){
  		throw new RuntimeException("Illegal toRadians function call at line:"+ line+" : " + this);
  	}
  }

}

