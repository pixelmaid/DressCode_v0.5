package com.pixelmaid.dresscode.app;

/*manages the code entry interface, and intializes and runs the antlr lexer and parser classes
to update the canvas */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

import javax.swing.text.AttributeSet;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import javax.swing.text.Element;
import javax.swing.text.PlainDocument;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Curve;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Line;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;

class Filter extends DocumentFilter {
	  private int promptPosition =0;
	  
		public void setPrompt(int p){
			promptPosition =p;
		}
		public void insertString(final FilterBypass fb, final int offset, final String string, final AttributeSet attr)
	            throws BadLocationException {
	        if (offset >= promptPosition) {
	            super.insertString(fb, offset, string, attr);
	        }
	    }

	    public void remove(final FilterBypass fb, final int offset, final int length) throws BadLocationException {
	        if (offset >= promptPosition) {
	            super.remove(fb, offset, length);
	        }
	    }

	    public void replace(final FilterBypass fb, final int offset, final int length, final String text, final AttributeSet attrs)
	            throws BadLocationException {
	        if (offset >= promptPosition) {
	            super.replace(fb, offset, length, text, attrs);
	        }
	    }
	}

public class CodeField extends JEditorPane implements DocumentListener, KeyListener{
	private static final long serialVersionUID = 1L;
	private Document editorPaneDocument;
	protected UndoHandler undoHandler = new UndoHandler();
	protected UndoManager undoManager = new UndoManager();
	protected UndoAction undoAction = null;
	protected RedoAction redoAction = null;
    private Filter filter;
    private boolean unsavedChanges= false;
	
	public CodeField() {
        super();
    }
    
    public void init(int size){
    	 this.setEditable(true);
    	this.setPreferredSize(new Dimension(550,500));
		this.setContentType("text/java");
		this.setText("");
		Document doc = this.getDocument();
		if (doc instanceof PlainDocument) {
		    doc.putProperty(PlainDocument.tabSizeAttribute, 2);
		}
		this.setBorder(new EmptyBorder(10,10,10,10));
		this.setFont(new Font("Courier", 0, size));
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
		filter = new Filter(); // filter for Stamp editor
		this.addKeyListener(this);
		
		
    }
 
    public void startFilter(int filterLength){
    	filter.setPrompt(filterLength);
    	((AbstractDocument)this.getDocument()).setDocumentFilter(filter);
    }
    
    public void stopFilter(){
    	((AbstractDocument)this.getDocument()).setDocumentFilter(null);
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
		unsavedChanges = true;
		removeHighlights();
		
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
	
	
	public void addText(String t){
		String text = this.getText();
		text +=t;
		this.setText(text);
		this.setCaretPosition(this.getText().length());
	}
	
	public void removeText(int pos, int endPos) {
		String text = this.getText();
		text = text.substring(0,pos)+text.substring(endPos);
		this.setText(text);
		
	}

	public void insertMoveStatement(Drawable sD ) {
	
		String identifier = sD.getIdentifier();
		int lineNum = sD.getLine();
		int endPos = sD.getEndPos();
		double x = sD.getOrigin().getX();
		double y = sD.getOrigin().getY();
		boolean over = sD.getGModified();
		
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
		System.out.println("pos="+pos);
		System.out.println("endPos="+endPos);
		System.out.println("x and y on move= "+x+","+y);
		if(identifier!=null){
			String moveText = "\nmove("+identifier+","+String.format("%.1f", x)+","+String.format("%.1f", y)+");";

		if(!over){
			insertText(pos,moveText);
		
		}
		else{
			
			removeText(pos,endPos);
			insertText(pos,moveText);
		}
		sD.setEndPos(pos+moveText.length());
	}
		else{
			String moveText1 = "move(";
			String moveText2 = ","+String.format("%.1f", x)+","+String.format("%.1f", y)+");";
			if(!over){
				removeText(pos-1,pos); //remove semicolon
				insertText(pos-lines[lineNum-1].length(),moveText1);	
				insertText(pos-1+moveText1.length(),moveText2);
				sD.setEndPos(pos-1+moveText1.length()+moveText2.length());

			}
			else{
				
				//removeText(pos-lines[lineNum-1].length(),pos-lines[lineNum-1].length()+moveText1.length());
				String snip = this.getText().substring(pos-lines[lineNum-1].length(), pos);
				System.out.println("snip="+snip);
				int index = snip.lastIndexOf("),");
				System.out.println("index="+index);
				int toRemove = lines[lineNum-1].length()-index-1;
				removeText(pos-toRemove,pos);
				insertText(pos-toRemove,moveText2);
				sD.setEndPos(pos-toRemove+moveText2.length());


			}
				

		}
		sD.setGModified(true);

	}

	public void insertShapeStatement(Drawable created, String shape) {
		int point = this.getText().length();
		String rectStart;
		if(point==0){
			rectStart=shape+"(";
		}
		else{
			rectStart= "\n"+shape+"(";
		}
		String rectEnd =");";
		Point origin = created.getOrigin();
		String rectStatement = rectStart+roundNum(origin.getX())+","+roundNum(origin.getY())+","+roundNum(created.getWidth())+","+roundNum(created.getHeight())+rectEnd;
		
		
		
		insertText(point,rectStatement);
		
	}
	
	public void insertCurveStatement(Curve created) {
		int point = this.getText().length();
		Point start = created.getStart();
		Point end = created.getEnd();
		Point c1 = created.getControl1();
		Point c2 = created.getControl2();
		String startX = String.valueOf(roundNum(start.getX()));
		String startY = String.valueOf(roundNum(start.getY()));
		String endX = String.valueOf(roundNum(end.getX()));
		String endY = String.valueOf(roundNum(end.getY()));
		String c1X = String.valueOf(roundNum(c1.getX()));
		String c1Y = String.valueOf(roundNum(c1.getY()));
		String c2X = String.valueOf(roundNum(c2.getX()));
		String c2Y = String.valueOf(roundNum(c2.getY()));
		
		String lineStart = "curve(";
		String lineEnd = ");";
		String lineStatement = lineStart+startX+","+startY+","+c1X+","+c1Y+","+c2X+","+c2Y+","+endX+","+endY+lineEnd;
		insertText(point,lineStatement);

		
	}

	
	public void insertLineStatement(Line created) {
		int point = this.getText().length();
		Point start = created.getStart();
		Point end = created.getEnd();
		String startX = String.valueOf(roundNum(start.getX()));
		String startY = String.valueOf(roundNum(start.getY()));
		String endX = String.valueOf(roundNum(end.getX()));
		String endY = String.valueOf(roundNum(end.getY()));
		
		String lineStart = "line(";
		String lineEnd = ");";
		String lineStatement = lineStart+startX+","+startY+","+endX+","+endY+lineEnd;
		insertText(point,lineStatement);


	}
	
	public void insertPolyStatement(Polygon created, double rotation) {
		int point = this.getText().length();
		String rectStart;
		String rectEnd = ");";
		String rotationStatement="";
		if(rotation!=0){
			rectStart = "rotate(poly(";
			rotationStatement="),"+roundNum(rotation);
			
		}
		else{
			rectStart = "poly(";
		}
		if(point !=0){
			rectStart = "\n"+rectStart;
		}
	
		
		Point origin = created.getOrigin();
		String rectStatement = rectStart+roundNum(origin.getX())+","+roundNum(origin.getY())+","+roundNum(created.numSides())+","+roundNum(created.sideLength())+rotationStatement+rectEnd;
		
		
		insertText(point,rectStatement);
		
	}
	
	
	public void insertIrregularStatement(String polyStatement) {
		int point = this.getText().length();
		if(point !=0){
			polyStatement = "\n"+polyStatement;
		}
		insertText(point,polyStatement);
		
	}
	
	public void removeHighlights(){
		this.getHighlighter().removeAllHighlights();
	}
	
	//TODO: CLEAN THIS UP- seriously this is sad code. 
	public void highlightLine(int lineNumber) throws BadLocationException{
		this.getHighlighter().removeAllHighlights();
		int lineNum = lineNumber-1;
		System.out.println("lineNumber="+lineNumber);
	
		
		String text = this.getText();
		ArrayList<String> lines = new ArrayList<String>();
		final BufferedReader br = new BufferedReader(new StringReader(text));
		String line;
		
		try {
			while ((line = br.readLine()) != null) {
			  lines.add(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		int pos =0;
		for(int i=0;i<lineNum; i++){
			pos+=lines.get(i).length();
			if(i!=0){
				pos++;
			}
		}
	
		String chunk = text.substring(pos,text.length());
		
		if(chunk.startsWith("\n")){
			chunk = chunk.substring(1,chunk.length());
		}
	
		int endPos = chunk.indexOf("\n");
		if(endPos<1){
			endPos = text.length()-pos;
		}
		else{
			endPos++;
		}
		
		DefaultHighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.GREEN);
        this.getHighlighter().addHighlight(pos,pos+endPos, painter);
		

	}
	
	

	
	//returns a clean string from a rounded double
	private String roundNum(double n){
		return String.format("%.2f", n);
	}
	
	
	public boolean getUnsaved(){
		return this.unsavedChanges;
	}
	
	public void setUnsaved(boolean u){
		this.unsavedChanges=u;
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
