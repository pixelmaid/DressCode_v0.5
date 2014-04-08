package com.pixelmaid.dresscode.antlr.types.tree;



import java.util.List;
import java.util.Random;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.app.DisplayFrame;

public class RandomNode  extends DCNode {
	protected List<DCNode> params;

    public RandomNode(List<DCNode> ps, int l, int c) {
        params = ps;
        line = l;
        col=c;
        //System.out.println("created new drawable node at line:"+line);
    }

  @Override
  public VarType evaluate() {
  	
  	try{
  		
  	double n1= params.get(0).evaluate().asDouble();
  	double n2= params.get(1).evaluate().asDouble();
  	Random r = DisplayFrame.mainRandom;

  	double num = n1 + (n2 -n1) *r.nextDouble();
  	
  	return new VarType(num);
  	}
  	catch (ClassCastException e){
  		throw new RuntimeException("Illegal random function call at line:"+ line+" : " + this);
  	}
  }

}

