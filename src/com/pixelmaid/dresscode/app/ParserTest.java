package com.pixelmaid.dresscode.app;


	import org.antlr.runtime.*;
	import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

import com.pixelmaid.dresscode.antlr.PyEsqueLexer;
import com.pixelmaid.dresscode.antlr.PyEsqueParser;

	public class ParserTest {
	  public static void main(String[] args) throws Exception {
		  String userCode = "\n" + 
		  		"a=1 b=2\n"+ 
		  		"if 2:\n" + 
		  		"  a=2\n" +
		  		"\n" +
		  		"\n" + 
		  		"";
		  
		  String uC2 = "\n" + 
		  		"AAA AAAAA\n" + 
		  		"  BBB BB B\n" + 
		  		"  BB BBBBB BB\n" + 
		  		"    CCCCCC C CC\n" + 
		  		"  BB BBBBBB\n" + 
		  		"    C CCC\n" + 
		  		"      DDD DD D\n" + 
		  		"      DDD D DDD\n" + 
		  		"\n" + 
		  		"";
	    	CharStream charStream = new ANTLRStringStream(userCode);

	    PyEsqueLexer lexer = new PyEsqueLexer(charStream);
	    PyEsqueParser parser = new PyEsqueParser(new CommonTokenStream(lexer));
	    CommonTree tree = (CommonTree)parser.parse().getTree();
	  
	    
		System.out.println(tree.toStringTree());
	    //DOTTreeGenerator gen = new DOTTreeGenerator();
	    //StringTemplate st = gen.toDOT(tree);
	    //System.out.println(st);
	  }
	}   