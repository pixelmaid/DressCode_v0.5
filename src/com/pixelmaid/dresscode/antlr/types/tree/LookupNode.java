package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

import java.util.ArrayList;
import java.util.List;

public class LookupNode extends DCNode {

  private DCNode expression;
  private List<DCNode> indexes;
  private int line;

  public LookupNode(DCNode e, List<DCNode> i,int l) {
    expression = e;
    indexes = i;
    line = l;
  }

  @Override
  public VarType evaluate() {

   VarType value = expression.evaluate();

    List<VarType> indexValues = new ArrayList<VarType>();

    for (DCNode indexNode : indexes) {
      indexValues.add(indexNode.evaluate());
    }

    for(VarType index : indexValues) {

      if(!index.isNumber() || !(value.isList() || value.isString()|| value.isDrawable())) {
        throw new RuntimeException("illegal expression: " + expression + "[" + index + "]");
      }

      int idx = index.asLong().intValue();

      if(value.isList()) {
        value = value.asList().get(idx);
      }
      else if(value.isString()) {
        value = new VarType(String.valueOf(value.asString().charAt(idx)));
      }
      else if(value.isDrawable()){
    	  Drawable d = value.asDrawable();
    	  d.setLine(line);
    	  if(d.numChildren()==0){
    		  value =  new VarType(value.asPolygon().pointAt(idx).toDrawable());
    	  }
    	  else{
    		  value =  new VarType(d.childAt(idx));
    	  }
      }
    }

    return value;
  }
}

