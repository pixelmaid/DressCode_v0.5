package com.pixelmaid.dresscode.antlr.types.tree;


import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;

public class AddNode implements DCNode {

  private DCNode lhs;
  private DCNode rhs;

  public AddNode(DCNode lhs, DCNode rhs) {
    this.lhs = lhs;
    this.rhs = rhs;
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

    throw new RuntimeException("illegal expression: " + this);
  }

  @Override
  public String toString() {
    return String.format("(%s + %s)", lhs, rhs);
  }
}

