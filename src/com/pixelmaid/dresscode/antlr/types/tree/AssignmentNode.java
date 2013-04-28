package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.Scope;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;

import java.util.ArrayList;
import java.util.List;

public class AssignmentNode extends NodeEvent implements DCNode {

  protected String identifier;
  protected List<DCNode> indexNodes;
  protected DCNode rhs;
  protected Scope scope;

  public AssignmentNode(String i, List<DCNode> e, DCNode n, Scope s) {
    identifier = i;
    indexNodes = (e == null) ? new ArrayList<DCNode>() : e;
    rhs = n;
    scope = s;
  }

  @Override
  public VarType evaluate() {

    VarType value = rhs.evaluate();

    if (value == VarType.VOID) {
      throw new RuntimeException("can't assign VOID to " + identifier);
    }

    if (indexNodes.isEmpty()) { // a simple assignment
      scope.assign(identifier, value);
      if(value.isDrawable()){
    	  Drawable d = value.asDrawable();
    	d.setIdentifier(identifier);
      }
    }
    else { // a possible list-lookup and reassignment

      VarType list = scope.resolve(identifier);

      // iterate up to `foo[x][y]` in case of `foo[x][y][z] = 42;`
      for (int i = 0; i < indexNodes.size() - 1 && list != null; i++) {
        VarType index = indexNodes.get(i).evaluate();

        if (!index.isNumber() || !list.isList()) { // sanity checks
          throw new RuntimeException("illegal statement: " + this);
        }

        int idx = index.asLong().intValue();
        list = list.asList().get(idx);
      }
      // list is now pointing to `foo[x][y]` in case of `foo[x][y][z] = 42;`

      // get the value `z`: the last index, in `foo[x][y][z] = 42;`
      VarType lastIndex = indexNodes.get(indexNodes.size() - 1).evaluate();

      if (!lastIndex.isNumber() || !list.isList()) { // sanity checks
        throw new RuntimeException("illegal statement: " + this);
      }

      // re-assign `foo[x][y][z]`
      List<VarType> existing = list.asList();
      existing.set(lastIndex.asLong().intValue(), value);
    }

    return VarType.VOID;
  }

  @Override
  public String toString() {
    return String.format("(%s[%s] = %s)", identifier, indexNodes, rhs);
  }
}
