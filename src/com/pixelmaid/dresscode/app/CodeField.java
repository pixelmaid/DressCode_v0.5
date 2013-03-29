package com.pixelmaid.dresscode.app;

/*manages the code entry interface, and intializes and runs the antlr lexer and parser classes
to update the canvas */

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import com.pixelmaid.dresscode.antlr.PogoLexer;
import com.pixelmaid.dresscode.antlr.PogoParser;
import com.pixelmaid.dresscode.antlr.PogoTreeWalker;
import com.pixelmaid.dresscode.antlr.types.tree.BlockNode;


public class CodeField extends JEditorPane implements DocumentListener, KeyListener{
	private static final long serialVersionUID = 1L;
 
    public CodeField() {
        super();
    }
    
    public void init(){
    	 this.setEditable(true);
    	this.setPreferredSize(new Dimension(550,500));
		this.setContentType("text/java");
		this.setText("");
		 
    }
 
    
    public String getCode(){
    	return this.getText()+"\n";
    }
    
  

    //adds a line of code to import in a shape;
    public void insertPath(File f) throws BadLocationException{
    	 String fileString = "import(\""+f.getAbsolutePath()+"\");";
    	 int caretPos = this.getCaretPosition();
    	 this.getDocument().insertString(caretPos, fileString, null);
    }

	//clears out the code window and all stored variables
    //TODO: code that clears out stored variables
    public void clear(){
    	this.setText("");
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
		/*if(e.getKeyCode()==10){
			updateCanvas();
		}*/
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
		//updateCanvas();
		
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
