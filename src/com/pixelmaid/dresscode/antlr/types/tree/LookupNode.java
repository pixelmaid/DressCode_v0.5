package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;
import java.util.ArrayList;
import java.util.List;

public class LookupNode implements DCNode {

  private DCNode expression;
  private List<DCNode> indexes;

  public LookupNode(DCNode e, List<DCNode> i) {
    expression = e;
    indexes = i;
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
    	  value =  new VarType(value.asDrawable().childAt(idx));
      }
    }

    return value;
  }
}

