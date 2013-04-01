package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;

import java.util.ArrayList;
import java.util.List;

public class IfNode extends NodeEvent implements DCNode {

  private List<Choice> choices;

  public IfNode() {
    choices = new ArrayList<Choice>();
  }

  public void addChoice(DCNode e, DCNode b) {
    choices.add(new Choice(e, b));
  }

  @Override
  public VarType evaluate() {

    for(Choice ch : choices) {
     VarType value = ch.expression.evaluate();

      if(!value.isBoolean()) {
        throw new RuntimeException("illegal boolean expression " + 
            "inside if-statement: " + ch.expression);
      }

      if(value.asBoolean()) {
        return ch.block.evaluate();
      }
    }

    return VarType.VOID;
  }

  private class Choice {

    DCNode expression;
    DCNode block;

    Choice(DCNode e, DCNode b) {
      expression = e;
      block = b;
    }
  }
}

