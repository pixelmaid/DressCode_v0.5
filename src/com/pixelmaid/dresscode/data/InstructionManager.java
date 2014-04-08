package com.pixelmaid.dresscode.data;

import java.util.EventObject;
import java.util.Iterator;
import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import antlr.Parser;

//import com.pixelmaid.dresscode.antlr.PogoLexer;
//import com.pixelmaid.dresscode.antlr.PogoParser;
//import com.pixelmaid.dresscode.antlr.PogoTreeWalker;
import com.pixelmaid.dresscode.antlr.PyEsqueLexer;
import com.pixelmaid.dresscode.antlr.PyEsqueParser;
import com.pixelmaid.dresscode.antlr.PyEsqueParser.block_return;
import com.pixelmaid.dresscode.antlr.PyEsqueTreeWalker;
import com.pixelmaid.dresscode.antlr.types.tree.BlockNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.CustomEventListener;

//manages the programs generated by the user and runs the parsing and lexing actions on the raw program text
public class InstructionManager extends NodeEvent{
	private PyEsqueLexer lexer;
	private CommonTokenStream tokens;
	private PyEsqueParser parser;
	private CommonTree tree;
	private String error = "";
	private DrawableManager drawableManager;
	private UserUIManager uiManager;

	private double widthParam,heightParam;
	private int unitParam;
	
	
	public InstructionManager(DrawableManager dm, UserUIManager ui, double w, double h) {
		lexer = new PyEsqueLexer();
		drawableManager = dm;
		uiManager = ui;
		widthParam = w;
		heightParam = h;
		
	}
	
	public void setDimensionParams(double width, double height, int units){
		widthParam = width;
		heightParam = height;
		unitParam = units;
	}
		
	
	  public void parseText(String userCode, int unitParam){

	    	//TODO: more efficient method of clearing canvas / parsing code. Right now it just deletes everything and re-interprets/ redraws entire thing
	    	//canvas.clearAllDrawables(); //clear the canvas
	    //	output.setText(""); //clear the output console

	    	
	    	CharStream charStream = new ANTLRStringStream("\n"+userCode+ "\n" + "");
	    	try {
	    	// create an instance of the lexer
	    	lexer = new PyEsqueLexer();
	    	lexer.setCharStream(charStream);
	    	// wrap a token-stream around the lexer
	    	tokens = new CommonTokenStream(lexer);
	    	// create the parser
	    	
	    		parser = new PyEsqueParser(tokens);
	    	}
	    	catch(Exception e) {
	    		System.out.println("lexer error");
	    		e.printStackTrace();
	    		error = e.getMessage();
	    		
	    		//registers a parse error event
	    		this.fireEvent(CustomEvent.PARSE_ERROR);
	    		//output.setText("error at" + error);

	    	}

	    	//System.out.println("running");
	    	// walk the tree
	    	
	    	try {
	    		block_return result = parser.block();
	    		tree = (CommonTree)result.getTree();
	    		
	    		CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
	    		System.out.println(tree.toStringTree());
	    		
	    		// pass the reference to the Map of functions to the tree walker
	    		PyEsqueTreeWalker walker = new PyEsqueTreeWalker(nodes,parser.functions,drawableManager,uiManager,widthParam, heightParam, unitParam);
	    		// get the returned node 
	    		BlockNode returned = walker.walk();
	    		System.out.println("num of statements="+returned.getNumStatements());
	    		returned.evaluate();
	    		//registers a completed parse event
	    		List<String> errors = walker.getErrors();
	    		System.out.println("errors="+errors);
	    		if(errors.size()!=0){
	    			error = "";
	    			for(int i=0;i<errors.size();i++){
	    				error = error+errors.get(i)+"\n";
	    			}
	    			this.fireEvent(CustomEvent.PARSE_ERROR);
	    		}
	    		this.fireEvent(CustomEvent.PARSE_COMPLETE);

	    	} catch (Exception e) {
	    		e.printStackTrace();
	    		error = e.getMessage();
	    		
	    		//registers a parse error event
	    		this.fireEvent(CustomEvent.PARSE_ERROR);
	    		//output.setText("error at" + error);

	    	}


	    }
	  
	  //gets the current error text;
	  public String getError(){
		  return this.error;
	  }




	  
	
}
