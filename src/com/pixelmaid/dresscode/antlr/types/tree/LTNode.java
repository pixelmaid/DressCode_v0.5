package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;;

public class LTNode extends DCNode {

  private DCNode lhs;
  private DCNode rhs;

  public LTNode(DCNode lhs, DCNode rhs) {
    this.lhs = lhs;
    this.rhs = rhs;
  }

  @Override
  public VarType evaluate() {

	  VarType a = lhs.evaluate();
	  VarType b = rhs.evaluate();

    if(a.isNumber() && b.isNumber()) {
      return new VarType(a.asDouble() < b.asDouble());
    }

    if(a.isString() && b.isString()) {
      return new VarType(a.asString().compareTo(b.asString()) < -1);
    }

    throw new RuntimeException("illegal expression: " + this);
  }

  @Override
  public String toString() {
    return String.format("(%s < %s)", lhs, rhs);
  }
}

