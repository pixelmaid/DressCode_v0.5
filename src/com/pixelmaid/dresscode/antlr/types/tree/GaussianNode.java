package com.pixelmaid.dresscode.antlr.types.tree;



import java.util.List;
import java.util.Random;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.app.DisplayFrame;

public class GaussianNode  extends DCNode {
	protected List<DCNode> params;
    protected int line;

    public GaussianNode(List<DCNode> ps, int l, int c) {
        params = ps;
        line = l;
        col=c;
        System.out.println("created new gaussian node at line:"+line);
    }

  @Override
  public VarType evaluate() {
      System.out.println("attempting to evaluate gaussian");

  	try{
  		
  	double mean=  params.get(0).evaluate().asDouble();
  	double sd = params.get(1).evaluate().asDouble();
  	Random r = DisplayFrame.mainRandom;

  	double num = sd *r.nextGaussian()+mean;
  	
  	return new VarType(num);
  	}
  	catch (ClassCastException e){
  		throw new RuntimeException("Illegal random function call at line:"+ line+" : " + this);
  	}
  }

}

