package com.pixelmaid.dresscode.antlr;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import com.pixelmaid.dresscode.antlr.JogoLexer;
import com.pixelmaid.dresscode.antlr.JogoParser;
import com.pixelmaid.dresscode.antlr.JogoTree;
import com.pixelmaid.dresscode.antlr.JogoParser.program_return;


public class Test {
	int[] foo,foo2 = new int[10];
	
	public static void main(String[] args) throws RecognitionException {
		CharStream charStream = new ANTLRStringStream("program Test\n" + 
				"var int x=5;\n" + 
				"if x==2 then\n" + 
				"	x=1;\n" + 
				"	x=2;\n" + 
				"end if\n" + 
				"end Test");
		JogoLexer lexer = new JogoLexer(charStream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		JogoParser parser = new JogoParser(tokenStream);
		program_return program = parser.program();
		//System.out.println(program.tree.toString());
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(program.tree);
		JogoTree walker = new JogoTree(nodeStream);
		int result = walker.program();
		//System.out.println("ok + result="+result);
		//test1();
	}
	
	public static void test1(){
		Integer x=5;
		Float xf = x.floatValue();
		Float y= 5f;
		System.out.println(true&&false);
	}
	
	
}
