package com.pixelmaid.dresscode.antlr.types;

import java.util.HashMap;
import java.util.Map;

public class Scope {

  private Scope parent;
  private Map<String, VarType> variables;

  public Scope() {
    // only for the global scope, the parent is null
    this(null);
  }

  public Scope(Scope p) {
    parent = p;
    variables = new HashMap<String, VarType>();
  }

  public void assign(String var, VarType value) {
    if(resolve(var) != null) {
      // There is already such a variable, re-assign it
      this.reAssign(var, value);
      
    }
    else {
      // A newly declared variable
      variables.put(var, value);
    }
  }

  public Scope copy() {
    // Create a shallow copy of this scope. Used in case functions are
    // are recursively called. If we wouldn't create a copy in such cases,
    // changing the variables would result in changes to the Maps from
    // other "recursive scopes".
    Scope s = new Scope();
    s.variables = new HashMap<String, VarType>(this.variables);
    return s;
  }

  public boolean isGlobalScope() {
    return parent == null;
  }

  public Scope parent() {
    return parent;
  }

  private void reAssign(String identifier, VarType value) {
    if(variables.containsKey(identifier)) {
      // The variable is declared in this scope
      variables.put(identifier, value);
    }
    else if(parent != null) {
      // The variable was not declared in this scope, so let
      // the parent scope re-assign it
      parent.reAssign(identifier, value);
    }
  }

  public VarType resolve(String var) {
	  VarType value = variables.get(var);
    if(value != null) {
      // The variable resides in this scope
    	 //System.out.println("local variable");
      return value;
    }
    else if(!isGlobalScope()) {
      // Let the parent scope look for the variable
    	// System.out.println("global variable");
      return parent.resolve(var);
    }
    else {
      // Unknown variable
    //System.out.println("unknown variable");
      return null;
    }
  }

public void setParent(Scope s) {
	this.parent=s;
	
}
}
