package com.pixelmaid.dresscode.antlr.types.tree;


import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.drawing.math.PolyBoolean;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;

public class AddNode extends NodeEvent implements DCNode {

  private DCNode lhs;
  private DCNode rhs;
  //protected int line;


  public AddNode(DCNode lhs, DCNode rhs) {
    this.lhs = lhs;
    this.rhs = rhs;
   // line = l;
  }

  @Override
  public VarType evaluate() {

    VarType a = lhs.evaluate();
    VarType b = rhs.evaluate();

    // number + number
    if(a.isNumber() && b.isNumber()) {
      return new VarType(a.asDouble() + b.asDouble());
    }

    // list + any
    if(a.isList()) {
      List<VarType> list = a.asList();
      list.add(b);
      return new VarType(list);
    }

    // string + any
    if(a.isString()) {
      return new VarType(a.asString() + "" + b.toString());
    }

    // any + string
    if(b.isString()) {
      return new VarType(a.toString() + "" + b.asString());
    }
    
    if(a.isDrawable() && b.isDrawable()) {
    	Drawable aP = a.asDrawable();
    	Drawable bP = b.asDrawable();
    	this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, aP);
    	this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, bP);
    	
    	Drawable d = PolyBoolean.union(aP,bP);
    	
    	this.drawableEvent(CustomEvent.DRAWABLE_CREATED, d);
		//d.setLine(line);
    	return new VarType(d);
      }
    error = "illegal expression: " + this.toString();
    fireEvent(CustomEvent.PARSE_ERROR);
    
    throw new RuntimeException("illegal expression: " + this);
   
  }



}

