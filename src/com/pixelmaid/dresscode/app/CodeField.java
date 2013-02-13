package com.pixelmaid.dresscode.app;


import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.BufferedTreeNodeStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import com.pixelmaid.dresscode.antlr.PogoLexer;
import com.pixelmaid.dresscode.antlr.PogoParser;
import com.pixelmaid.dresscode.antlr.PogoTreeWalker;
import com.pixelmaid.dresscode.antlr.types.tree.BlockNode;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;

public class CodeField extends JEditorPane implements DocumentListener, KeyListener{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
    public CodeField() {
        super();
        this.setEditable(true);
        this.getDocument().addDocumentListener(this);
        JScrollPane scrollPane = new JScrollPane(this);
        this.addKeyListener(this);
        
       /* int condition = JComponent.WHEN_FOCUSED;
        InputMap iMap = this.getInputMap(condition);
        ActionMap aMap = this.getActionMap();
        String enter = "enter";
        iMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), enter);
        aMap.put(enter, new AbstractAction() {

           @Override
           public void actionPerformed(ActionEvent arg0) {*/
        	
        
 
    }
    
    private void updateCanvas(){
    	
		   Manager.canvas.clearAllDrawables();
        
          String txt = 	this.getText()+"\n";
        /* while(txt.charAt(0)=='\n'){
        	 txt=txt.substring(1);
        	 if(txt.length()<1){
        		 break;
        	 }
         }*/
          
          System.out.println("txt="+txt);
          CharStream charStream = new ANTLRStringStream(txt);
  		
  	    // create an instance of the lexer

  		PogoLexer lexer = new PogoLexer(charStream);

  		// wrap a token-stream around the lexer
  	    CommonTokenStream tokens = new CommonTokenStream(lexer);
  	        
  	    // create the parser
  	    PogoParser parser = new PogoParser(tokens);
  	    
  	    // walk the tree
  	    CommonTree tree;
			try {
				tree = (CommonTree)parser.parse().getTree();
			
  	    CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
  	    
  	    // pass the reference to the Map of functions to the tree walker
  	    PogoTreeWalker walker = new PogoTreeWalker(nodes, parser.functions);
  	    
  	    // get the returned node 
  	    BlockNode returned = walker.walk();
  	    
  	    returned.evaluate();
  	    Manager.canvas.draw();
  	    Manager.canvas.init();
  	  //System.out.println("updated canvas");
  	   

  	    
			} catch (RecognitionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        
    
    }
    
    

	@Override
	public void changedUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("changedUpdate");
	
		
	}

	@Override
	public void insertUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
		//System.out.println("insertUpdate");
		//System.out.println(this.getText());
		
		
	}

	@Override
	public void removeUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("removeUpdate");
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==10){
			updateCanvas();
		}
		//this.getParent().dispatchEvent(e);
	}
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//this.getParent().dispatchEvent(e);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//this.getParent().dispatchEvent(e);
		
	}

	public void loadFile(String filetxt) {
		System.out.println("load file="+filetxt);
		this.setText(filetxt);
		updateCanvas();
		
	}
 
  /*  public void actionPerformed(ActionEvent evt) {
        String text = textField.getText();
        textArea.append(text + newline);
        textField.selectAll();
 
        //Make sure the new text is visible, even if there
        //was a selection in the text area.
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }*/
 
}
