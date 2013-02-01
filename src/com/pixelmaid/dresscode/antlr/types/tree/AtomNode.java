package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;

public class AtomNode implements DCNode {

  private VarType value;

  public AtomNode(Object v) {
    value = (v == null) ? VarType.NULL : new VarType(v);
  }

  @Override
  public VarType evaluate() {
    return value;
  }

  @Override
  public String toString() {
    return value.toString();
  }
}

