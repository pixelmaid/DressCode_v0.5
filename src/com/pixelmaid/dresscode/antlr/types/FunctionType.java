package com.pixelmaid.dresscode.antlr.types;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import com.pixelmaid.dresscode.antlr.PogoTreeWalker;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.data.DrawableManager;

public class FunctionType {  //data object to store function declarations
	private String id;
	  private List<String> identifiers;
	  private CommonTree code;
	  private Scope scope;
	 

	  public FunctionType(String i, CommonTree ids, CommonTree block) {
	    id = i;
	    identifiers = toList(ids);
	    code = block;
	    scope = new Scope();
	   
	  }

	  public FunctionType(FunctionType original) {
	    // Used for recursively calling functions
	    id = original.id;
	    identifiers = original.identifiers;
	    code = original.code;
	    scope = original.scope.copy();
	  }

	  public VarType invoke(List<DCNode> params, Map<String, FunctionType> functions ,DrawableManager dm, double w, double h, int u) {
		  System.out.println("function drawable manager 2 ="+dm);

		  
	    if(params.size() != identifiers.size()) {
	      throw new RuntimeException("illegal function call: " + identifiers.size() +
	          " parameters expected for function `" + id + "`");
	    }

	    // Assign all expression parameters to this function's identifiers
	    for(int i = 0; i < identifiers.size(); i++) {
	      scope.assign(identifiers.get(i), params.get(i).evaluate());
	    }

	    try {
	      // Create a tree walker to evaluate this function's code block
	      CommonTreeNodeStream nodes = new CommonTreeNodeStream(code);
	      PogoTreeWalker walker = new  PogoTreeWalker(nodes, scope, functions, dm, w, h, u);
	      return walker.walk().evaluate();
	    } catch (RecognitionException e) {
	      // do not recover from this
	      throw new RuntimeException("something went wrong, terminating", e);
	    }
	  }

	  private List<String> toList(CommonTree tree) {
	    List<String> ids = new ArrayList<String>();
	    
	    // convert the tree to a List of Strings
	    for(int i = 0; i < tree.getChildCount(); i++) {
	      CommonTree child = (CommonTree)tree.getChild(i);
	      ids.add(child.getText());
	    }
	    return ids;
	  }
	}

