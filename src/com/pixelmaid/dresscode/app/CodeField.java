package com.pixelmaid.dresscode.app;

/*manages the code entry interface, and intializes and runs the antlr lexer and parser classes
to update the canvas */

import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;



public class CodeField extends JEditorPane implements DocumentListener, KeyListener{
	private static final long serialVersionUID = 1L;
	private Document editorPaneDocument;
	protected UndoHandler undoHandler = new UndoHandler();
	protected UndoManager undoManager = new UndoManager();
	protected UndoAction undoAction = null;
	protected RedoAction redoAction = null;
    
	
	public CodeField() {
        super();
    }
    
    public void init(){
    	 this.setEditable(true);
    	this.setPreferredSize(new Dimension(550,500));
		this.setContentType("text/java");
		this.setText("");
		
		this.setFont(new Font("Courier", 0, 12));
		editorPaneDocument = this.getDocument();
		editorPaneDocument.addUndoableEditListener(undoHandler);
		KeyStroke undoKeystroke = KeyStroke.getKeyStroke(KeyEvent.VK_Z, Event.META_MASK);
		KeyStroke redoKeystroke = KeyStroke.getKeyStroke(KeyEvent.VK_Y, Event.META_MASK);

		undoAction = new UndoAction();
		this.getInputMap().put(undoKeystroke, "undoKeystroke");
		this.getActionMap().put("undoKeystroke", undoAction);
		redoAction = new RedoAction();
		this.getInputMap().put(redoKeystroke, "redoKeystroke");
		this.getActionMap().put("redoKeystroke", redoAction);
		undoAction.setActions(undoManager,redoAction);
		redoAction.setActions(undoManager,undoAction);
		undoHandler.setActions(undoManager, undoAction, redoAction);
    }
 
    
    public JMenuItem getRedoMenu(){
    	
    	JMenuItem redoMenuItem = new JMenuItem(redoAction);
    	redoMenuItem.setText("Redo");
    	return redoMenuItem;
    }
    
public JMenuItem getUndoMenu(){
    	
    	JMenuItem undoMenuItem = new JMenuItem(undoAction);
    	undoMenuItem.setText("Undo");
    	return undoMenuItem;
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

	public void insertCoordinate(double x, double y) {
		String coordString =String.format("%.2f", x)+","+String.format("%.2f", y);
		insertText(this.getCaretPosition(),coordString);
		
	}
	
	public void insertText(int pos, String newText) {
		String text = this.getText();
		text = text.substring(0,pos)+ newText  +text.substring(pos);
		this.setText(text);
		
	}

	public void insertMoveStatement(String identifier, int lineNum,Drawable selectedObject, double x, double y) {
		
		
		
		
		System.out.println("identifer="+identifier);
		System.out.println("lineNum="+lineNum);
		String text = this.getText();
		String[] lines = text.split("\r\n|\r|\n");
		System.out.println("num of lines="+lines.length);
		System.out.println("lineNum="+lineNum);
		int pos =0;
		for(int i=0;i<lineNum; i++){
			pos+=lines[i].length();
			if(i!=0){
				pos++;
			}
			
			//System.out.println("line "+i+"="+lines[i]);
		}
		
		
		insertText(pos,"\nmove("+identifier+","+x+","+y+");");
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

//java undo and redo action classes

class UndoHandler implements UndoableEditListener
{
UndoManager undoManager;
UndoAction undoAction;
RedoAction	redoAction;
/**
 *
* Messaged when the Document has created an edit, the edit is added to
* <code>undoManager</code>, an instance of UndoManager.
*/

public void setActions(UndoManager uM, UndoAction uA, RedoAction rA){
	 this.undoManager=uM;
	 this.undoAction = uA;
	 this.redoAction = rA;
	 
}

public void undoableEditHappened(UndoableEditEvent e)
{
 undoManager.addEdit(e.getEdit());
 undoAction.update();
 redoAction.update();
}
}

class UndoAction extends AbstractAction
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UndoManager undoManager;
	RedoAction	redoAction;

	public UndoAction()
	{
	 super("Undo");
	
	 setEnabled(false);
	}
	
	public void setActions(UndoManager uM, RedoAction rA){
		 this.undoManager=uM;
		 this.redoAction = rA;
		 
	}

public void actionPerformed(ActionEvent e)
{
 try
 {
   undoManager.undo();
 }
 catch (CannotUndoException ex)
 {
   // TODO deal with this
   //ex.printStackTrace();
 }
 update();
 redoAction.update();
}

protected void update()
{
 if (undoManager.canUndo())
 {
   setEnabled(true);
   putValue(Action.NAME, undoManager.getUndoPresentationName());
 }
 else
 {
   setEnabled(false);
   putValue(Action.NAME, "Undo");
 }
}
}

class RedoAction extends AbstractAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UndoManager undoManager;
	UndoAction undoAction;
	
public RedoAction()
{
 super("Redo");
 setEnabled(false);
}

public void setActions(UndoManager uM, UndoAction uA){
	 this.undoManager=uM;
	 this.undoAction = uA;
	 
}

public void actionPerformed(ActionEvent e)
{
 try
 {
   undoManager.redo();
 }
 catch (CannotRedoException ex)
 {
   // TODO deal with this
   ex.printStackTrace();
 }
 update();
 undoAction.update();
}

protected void update()
{
 if (undoManager.canRedo())
 {
   setEnabled(true);
   putValue(Action.NAME, undoManager.getRedoPresentationName());
 }
 else
 {
   setEnabled(false);
   putValue(Action.NAME, "Redo");
 }
}
}
