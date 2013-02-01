package com.pixelmaid.dresscode.antlr;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import com.pixelmaid.dresscode.antlr.types.SemanticManager;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;


public class Test {
	int[] foo,foo2 = new int[10];
	
	public static void main(String[] args) throws RecognitionException {
		CharStream charStream = new ANTLRStringStream("");
		
	    // create an instance of the lexer

		PogoLexer lexer = new PogoLexer(charStream);

		// wrap a token-stream around the lexer
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	        
	    // create the parser
	    PogoParser parser = new PogoParser(tokens);
	    
	    // walk the tree
	    CommonTree tree = (CommonTree)parser.parse().getTree();
	    CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
	    
	    // pass the reference to the Map of functions to the tree walker
	    PogoTreeWalker walker = new PogoTreeWalker(nodes, parser.functions);
	    
	    // get the returned node 
	    DCNode returned = walker.walk();
	    System.out.println(returned == null ? "null" : returned.evaluate());
		//test1();
	}
	
}
