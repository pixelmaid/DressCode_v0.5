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

public class CodeField extends JTextPane implements DocumentListener{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
    public CodeField() {
        super();

        
		
		
		
		
        
        
        this.setEditable(true);
        this.getDocument().addDocumentListener(this);
        JScrollPane scrollPane = new JScrollPane(this);
        
        
        int condition = JComponent.WHEN_FOCUSED;
        InputMap iMap = this.getInputMap(condition);
        ActionMap aMap = this.getActionMap();
        String tab = "tab";
        iMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_TAB, 0), tab);
        aMap.put(tab, new AbstractAction() {

           @Override
           public void actionPerformed(ActionEvent arg0) {
        	   Container.canvas.clearAllDrawables();
              //System.out.println("tab pressed");
             String txt = ((CodeField) arg0.getSource()).getText();
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
     	    System.out.println(returned == null ? "null" : returned.evaluate("hello"));
			} catch (RecognitionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           }
        });
        
        //Add Components to this panel.
       /* GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
 
        c.fill = GridBagConstraints.HORIZONTAL;
       
 
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;*/
       
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
 
  /*  public void actionPerformed(ActionEvent evt) {
        String text = textField.getText();
        textArea.append(text + newline);
        textField.selectAll();
 
        //Make sure the new text is visible, even if there
        //was a selection in the text area.
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }*/
 
}
