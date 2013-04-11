package com.pixelmaid.dresscode.antlr.types.tree;



import java.util.List;
import java.util.Random;

import com.pixelmaid.dresscode.antlr.types.VarType;

public class RandomNode  extends NodeEvent implements DCNode {
	protected List<DCNode> params;
    protected int line;

    public RandomNode(List<DCNode> ps, int l) {
        params = ps;
        line = l;
        //System.out.println("created new drawable node at line:"+line);
    }

  @Override
  public VarType evaluate() {
  	
  	try{
  		
  	double n1= params.get(0).evaluate().asDouble();
  	double n2= params.get(1).evaluate().asDouble();
  	Random r = new Random();

  	double num = n1 + (n2 -n1) *r.nextDouble();
  	
  	return new VarType(num);
  	}
  	catch (ClassCastException e){
  		throw new RuntimeException("Illegal cosine function call at line:"+ line+" : " + this);
  	}
  }

}

