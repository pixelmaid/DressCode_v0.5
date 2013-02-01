package com.pixelmaid.dresscode.antlr.types.tree.functions;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import java.io.PrintStream;

public class PrintlnNode implements DCNode {

  private DCNode expression;
  private PrintStream out;

  public PrintlnNode(DCNode e) {
    this(e, System.out);
  }

  public PrintlnNode(DCNode e, PrintStream o) {
    expression = e;
    out = o;
  }

  @Override
  public VarType evaluate() {
    VarType value = expression.evaluate();
    out.println(value);
    return VarType.VOID;
  }
}

