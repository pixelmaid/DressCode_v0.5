package com.pixelmaid.dresscode.antlr.types.tree;



import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.app.DisplayFrame;

public class NoiseNode  extends DCNode {
	protected List<DCNode> params;

    public NoiseNode(List<DCNode> ps, int l, int c) {
        params = ps;
        line = l;
        col=c;
        //System.out.println("created new drawable node at line:"+line);
    }

  @Override
  public VarType evaluate() {
  	
  	try{
  		double num =0;
  		double x=0;
  		double y=0;
  		double z = 0;
  		if(params.size()==1){
  			x= params.get(0).evaluate().asDouble();
  			num = DisplayFrame.noise.noise(x);
  		}
  		else if(params.size()==2){
  			x= params.get(0).evaluate().asDouble();
  			y = params.get(1).evaluate().asDouble();
  			num = DisplayFrame.noise.noise(x,y);
  			
  		}
  		else if(params.size()==3){
  			x= params.get(0).evaluate().asDouble();
  			y = params.get(1).evaluate().asDouble();
  			y = params.get(2).evaluate().asDouble();
  			num = DisplayFrame.noise.noise(x,y,z);
  			
  		}
  	
  	return new VarType(num);
  	}
  	catch (ClassCastException e){
  		throw new RuntimeException("Illegal noise function call at line:"+ line+" : " + this);
  	}
  }

}

