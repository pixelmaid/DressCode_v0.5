package com.pixelmaid.dresscode.antlr.types.tree;



import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.drawing.math.UnitManager;

public class ConversionNode extends NodeEvent implements DCNode {

	protected DCNode param;

    protected int line;
    private String type;
    private int unitParam;

	
  public ConversionNode(DCNode p, String t, int u, int l) {
      param = p;
      line = l;
      type = t;
     unitParam = u;
  }

  @Override
  public VarType evaluate() {
  	//System.out.println(unitParam);

  	try{
  		
  		
  	double v= param.evaluate().asDouble();
  	double d = 0;
  	if(type=="inch"){
  		d = UnitManager.toPixels(v, UnitManager.STANDARD);
  		
  	}
  	else if(type=="mm"){
  		d = UnitManager.toPixels(v, UnitManager.METRIC);

  	}
  	
	else if(type=="cm"){
		d = UnitManager.toPixels(v*10, UnitManager.METRIC);

  	}
	else if(type=="units"){
		d = UnitManager.toPixels(v, unitParam);

	}
  	
  	return new VarType(d);
  	}
  	catch (ClassCastException e){
  		throw new RuntimeException("Illegal cosine function call at line:"+ line+" : " + this);
  	}
  }

}

