package com.pixelmaid.dresscode.antlr.types.tree;



import com.pixelmaid.dresscode.antlr.types.VarType;

public class SqNode extends NodeEvent implements DCNode {

	protected DCNode param;

    protected int line;


  public SqNode(DCNode p, int l) {
      param = p;
      line = l;
     
  }

  @Override
  public VarType evaluate() {
  	
  	try{
  		
 		double d1=param.evaluate().asDouble();
  	double d= d1*d1;
  	
  	return new VarType(d);
  
  	}
  	catch (ClassCastException e){
  		throw new RuntimeException("Illegal square function call at line:"+ line+" : " + this);
  	}
  }

}

