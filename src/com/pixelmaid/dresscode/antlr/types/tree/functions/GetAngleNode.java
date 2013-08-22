package com.pixelmaid.dresscode.antlr.types.tree.functions;



import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.math.Geom;

public class GetAngleNode  extends NodeEvent implements DCNode {

	protected List<DCNode> params;

    protected int line;


  public GetAngleNode(List<DCNode> ps) {
      params = ps;
  
     
  }

  @Override
  public VarType evaluate() {
  	
  	try{
  		
  	double d=Geom.cartToPolar(params.get(0).evaluate().asDouble(),params.get(1).evaluate().asDouble())[1];
  	
  	return new VarType(d);
  	}
  	catch (ClassCastException e){
  		throw new RuntimeException("Illegal getAngle function call at line:"+ line+" : " + this);
  	}
  }

}

