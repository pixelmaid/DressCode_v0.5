package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

import java.util.ArrayList;
import java.util.List;

public class DotPropertyNode implements DCNode {

  private DCNode expression;
  private List<PropertyNode> properties;

  public DotPropertyNode(DCNode e, List<PropertyNode> i) {
    expression = e;
    properties = i;
  }

  @Override
  public VarType evaluate() {

   VarType value = expression.evaluate();


   
    for(PropertyNode property : properties) {

      if(!(value.isDrawable()||value.isPoint())) {
        throw new RuntimeException("illegal property access: " + expression + "." + property.toString());
      }

    
    
      property.setParam(value);
      value = property.evaluate();
      
    }

    return value;
  }
}

