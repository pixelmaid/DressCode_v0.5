package com.pixelmaid.dresscode.antlr.types;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import com.pixelmaid.dresscode.antlr.PogoTreeWalker;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;

public class DrawableFunctionType {
	 private String id;
	  private List<String> identifiers;
	  private CommonTree code;
	  private Scope scope;
	 
	  
	public DrawableFunctionType() {
		
	}
	
	public VarType invoke(List<DCNode> params, Map<String, FunctionType> functions) {

		VarType v = null;
		
		
		System.out.println("called drawable");
		
		for(int i = 0; i < params.size(); i++) {
			System.out.println(params.get(i).evaluate());
		      //scope.assign(identifiers.get(i), params.get(i).evaluate());
		    }
		
		return v;
		
		  /*  if(params.size() != identifiers.size()) {
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
		      PogoTreeWalker walker = new  PogoTreeWalker(nodes, scope, functions);
		      return walker.walk().evaluate();
		    } catch (RecognitionException e) {
		      // do not recover from this
		      throw new RuntimeException("something went wrong, terminating", e);
		    }*/
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
