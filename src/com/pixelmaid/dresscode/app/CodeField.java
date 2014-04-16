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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import javax.swing.text.Element;
import javax.swing.text.PlainDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.TabSet;
import javax.swing.text.TabStop;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

import com.pixelmaid.dresscode.antlr.types.tree.functions.transforms.TransformTypes;
import com.pixelmaid.dresscode.app.ui.tools.BoolTool;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.PolyBoolean;
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

public class CodeField extends JTextPane implements DocumentListener, KeyListener{
	private static final long serialVersionUID = 1L;
	private Document editorPaneDocument;
	protected UndoHandler undoHandler = new UndoHandler();
	protected UndoManager undoManager = new UndoManager();
	protected UndoAction undoAction = null;
	protected RedoAction redoAction = null;
	//protected TabAction tabAction = null;
    private Filter filter;
    private String id="";
    private boolean unsavedChanges= false;
    private Pattern p = Pattern.compile("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)");
    final StyleContext cont = StyleContext.getDefaultStyleContext();
    final AttributeSet attr = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.GRAY);
    final AttributeSet attrBlack = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLACK);
    private DefaultStyledDocument doc;
    public CodeField(String id) {
        super();
        this.id=id;
    }
    
    
    public String getId(){
    	return id;
    }
    public void init(int size){
    	 this.setEditable(true);
    	this.setPreferredSize(new Dimension(550,500));
		this.setContentType("text/java");
		Document doc = this.getDocument();
		
		this.setText("");
		
		doc = new DefaultStyledDocument();
		/* {
            public void insertString (int offset, String str, AttributeSet a) throws BadLocationException {
                super.insertString(offset, str, a);

                String text = getText(0, getLength());
                int before = findLastNonWordChar(text, offset);
                if (before < 0) before = 0;
                int after = findFirstNonWordChar(text, offset + str.length());
                int wordL = before;
                int wordR = before;

                while (wordR <= after) {
                    if (wordR == after || String.valueOf(text.charAt(wordR)).matches("\\W")) {
                        if (text.substring(wordL, wordR).matches("(\\W)*(private|public|protected)"))
                            setCharacterAttributes(wordL, wordR - wordL, attr, false);
                        else
                            setCharacterAttributes(wordL, wordR - wordL, attrBlack, false);
                        wordL = wordR;
                    }
                    wordR++;
                }
            }

            public void remove (int offs, int len) throws BadLocationException {
                super.remove(offs, len);

                String text = getText(0, getLength());
                int before = findLastNonWordChar(text, offs);
                if (before < 0) before = 0;
                int after = findFirstNonWordChar(text, offs);

                if (text.substring(before, after).matches("(\\W)*(private|public|protected)")) {
                    setCharacterAttributes(before, after - before, attr, false);
                } else {
                    setCharacterAttributes(before, after - before, attrBlack, false);
                }
            }
        };*/
		
		
		this.setDocument(doc);
		
		StyleContext sc = StyleContext.getDefaultStyleContext();
		TabSet tabs = new TabSet(new TabStop[] { new TabStop(20),new TabStop(40),new TabStop(60),new TabStop(80),new TabStop(100),new TabStop(120),new TabStop(140),new TabStop(160),new TabStop(180) });
		AttributeSet paraSet = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.TabSet, tabs);
		this.setParagraphAttributes(paraSet, false);
		
		this.setBorder(new EmptyBorder(10,10,10,10));
		this.setFont(new Font("Courier", 0, size));
		editorPaneDocument = this.getDocument();
		editorPaneDocument.addUndoableEditListener(undoHandler);
		KeyStroke undoKeystroke = KeyStroke.getKeyStroke(KeyEvent.VK_Z, Event.META_MASK);
		KeyStroke redoKeystroke = KeyStroke.getKeyStroke(KeyEvent.VK_Y, Event.META_MASK);
		KeyStroke tabKeystroke = KeyStroke.getKeyStroke(KeyEvent.VK_TAB, Event.META_MASK);

		undoAction = new UndoAction();
		this.getInputMap().put(undoKeystroke, "undoKeystroke");
		this.getActionMap().put("undoKeystroke", undoAction);
		redoAction = new RedoAction();
		this.getInputMap().put(redoKeystroke, "redoKeystroke");
		this.getActionMap().put("redoKeystroke", redoAction);
		
		//tabAction = new TabAction();
		//this.getInputMap().put(tabKeystroke, "tabKeystroke");
		//this.getActionMap().put("tabKeystroke", tabAction);
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
    
    public void checkForComments(){
    	//this.setText(this.getText().replaceAll("\u0009","\u2192"));
    	String txt = this.getCode();
    	if(txt.length()!=0){
    	//String [] nonComments = getCode().split("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)");
        //ArrayList<String> comments = new ArrayList<String>();
        Matcher m = p.matcher(getCode());
    	((DefaultStyledDocument)this.getDocument()).setCharacterAttributes(0,txt.length(), attrBlack, false);
        while (m.find()) {
        	int start = m.start();
        	int end = m.start()+m.group().length();
        	((DefaultStyledDocument)this.getDocument()).setCharacterAttributes(start,end, attr, false);
        	((DefaultStyledDocument)this.getDocument()).setCharacterAttributes(end,txt.length(), attrBlack, false);       
        	}
        
        }
       
       
    }
  
   

    //adds a line of code to import in a shape;
    public void insertPath(File f) throws BadLocationException{
    	 String fileString = "import(\""+f.getAbsolutePath()+"\")";
    	 this.insertGesturalStatement(fileString);
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
		//checkForComments();
		
	}

	public void loadFile(String filetxt) {
		System.out.println("load file="+filetxt);
		this.setText(filetxt);
		checkForComments();
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
		//checkForComments();
	}
	
	
	public void addText(String t){
		String text = this.getText();
		text +=t;
		this.setText(text);
		//checkForComments();
		this.setCaretPosition(this.getText().length());
	}
	
	public void removeText(int pos, int endPos) {
		String text = this.getText();
		text = text.substring(0,pos)+text.substring(endPos);
		this.setText(text);
		//checkForComments();
		
	}
	
	public void updateVariable(String replaceText, int line, int c){
		
		String text = this.getText();
		String[] lines = text.split("\r\n|\r|\n");
		System.out.print("length="+lines.length);
		System.out.print("replace line="+lines[line-2]);
		lines[line-2]=replaceText;
		String newText = "";
		for(int i=0;i<lines.length;i++){
			newText +=lines[i];
			if(i!=lines.length-1){
				newText+="\n";
			}
		}
		this.setText(newText);
		/*String[] lines = text.split("\r\n|\r|\n");
		line= line-1;
		int lineLength = lines[line].length();
		System.out.println("line number="+line);
		int pos =0;
		for(int i=0;i<line; i++){
			pos+=lines[i].length();
			if(i!=0){
				pos++;
			}
			
			System.out.println("line "+i+"="+lines[i].length());
		}
		System.out.println("pos="+pos);
		System.out.println("endPos="+pos+lineLength);

		this.removeText(pos, pos+lineLength);
		this.insertText(pos, updateTxt);*/
	}

	
	public boolean insertHideStatement(Drawable sD, boolean hide ) {
		int[] lastTransforms = sD.getLastTransform();
		int tLine = lastTransforms[1]-2;
		int tLast = lastTransforms[0];
		int tCol = lastTransforms[2];
		int startArg = lastTransforms[3];
		int endArg = lastTransforms[4];
		
		switch(tLast){
			case TransformTypes.HIDE:
				modifyExistingHide(sD,tLine,tCol,startArg,endArg, hide);
			break;
			case TransformTypes.NONE:
				System.out.println("no hide");
				return insertNewHide(sD,sD.getLine()-2,tCol);
				
			default:
				System.out.println("non move transformation");
				return insertNewHide(sD,tLine,tCol);
			
		}
		return false;
	}
	
	public void modifyExistingHide(Drawable sD, int line,int col,int startArg,int endArg,boolean hide){
		String text = this.getText();
		
		String[] lines = text.split("\r\n|\r|\n");
		String replaceLine = lines[line];
		System.out.println("line to replace="+replaceLine);
		String start = replaceLine.substring(0,startArg);
		
			String statement = replaceLine.substring(startArg,startArg+5);
			String middle = replaceLine.substring(startArg+5,endArg);
			String endP =  replaceLine.substring(endArg,endArg+1);
			String last = replaceLine.substring(endArg+1,replaceLine.length());
			System.out.println("start="+start+" statement="+statement+" middle="+middle+" endP="+endP+" last="+last);
		if(sD.getIdentifier()==null){
			lines[line]= start+middle+last;
		}
		else{
			lines[line]="";
			
		}
		
		String newText = "";
		for(int i=0;i<lines.length;i++){
			newText +=lines[i];
			if(i!=lines.length-1||lines[i]!=""){
				newText+="\n";
			}
		}
		this.setText(newText);
		sD.removeLastTransform();
	}
	
	public boolean insertNewHide(Drawable sD, int line, int col){
		boolean run = false;
		String identifier = sD.getIdentifier();
		
		String text = this.getText();
		String[] lines = text.split("\r\n|\r|\n");
		String replaceLine = lines[line];
		String moveText ="";
		if(identifier!=null){
			moveText = replaceLine+"\nhide("+identifier+")";
			int startArg =("hide("+identifier).length();
			int endArg = startArg+1;
			System.out.println("startArg="+startArg+" endArg="+endArg);
			sD.setLastTransform(TransformTypes.HIDE,line+3,col,startArg,endArg);
			run = true;

		}
		else{
			moveText = "hide("+replaceLine+")";
			int startArg =("hide("+replaceLine).length();
			int endArg = startArg+1;
			System.out.println("startArg="+startArg+" endArg="+endArg);
			sD.setLastTransform(TransformTypes.HIDE,line+2,col,startArg,endArg);
		}
		lines[line]=moveText;
		String newText = "";
		for(int i=0;i<lines.length;i++){
			newText +=lines[i];
			if(i!=lines.length-1){
				newText+="\n";
			}
		}
		this.setText(newText);
		return run;
		
	}
	
	public boolean insertMoveStatement(Drawable sD ) {
		int[] lastTransforms = sD.getLastTransform();
		int tLine = lastTransforms[1]-2;
		int tLast = lastTransforms[0];
		int tCol = lastTransforms[2];
		int startArg = lastTransforms[3];
		int endArg = lastTransforms[4];
		System.out.println("last transform for attemptedMove="+tLast+","+tLine+","+tCol);
		System.out.println("drawable init line="+sD.getLine());
		switch(tLast){
			case TransformTypes.MOVETO:
				modifyExistingMove(sD,tLine,tCol,startArg,endArg);
			break;
			case TransformTypes.NONE:
				System.out.println("no transformation");
				return insertNewMove(sD,sD.getLine()-2,tCol);
				
			default:
				System.out.println("non move transformation");
				return insertNewMove(sD,tLine,tCol);
			
		}
		return false;
	}
	
	public void modifyExistingMove(Drawable sD, int line,int col,int startArg,int endArg){
		String text = this.getText();
		double x = sD.getOrigin().getX();
		double y = sD.getOrigin().getY();
		
		String[] lines = text.split("\r\n|\r|\n");
		String replaceLine = lines[line];
		
		String start = replaceLine.substring(0,startArg+1);
	
	    String middle = replaceLine.substring(startArg+1,endArg);
	    String end =  replaceLine.substring(endArg,replaceLine.length());
		System.out.println("start="+start+"\nmiddle="+middle+"\nend="+end);
		
		lines[line]= start+String.format("%.0f", x)+","+String.format("%.0f", y)+end;
		String newText = "";
		for(int i=0;i<lines.length;i++){
			newText +=lines[i];
			if(i!=lines.length-1){
				newText+="\n";
			}
		}
		this.setText(newText);
		int stringLength = (String.format("%.0f", x)+","+String.format("%.0f", y)).length();
		System.out.println("startArg="+startArg+" endArg="+(startArg+stringLength+1)+ "line="+line+2);
		sD.setLastTransform(TransformTypes.MOVETO,line+2,col,startArg,startArg+stringLength+1);
	}
	
	public boolean insertNewMove(Drawable sD, int line, int col){
		boolean run = false;
		String identifier = sD.getIdentifier();
		double x = sD.getOrigin().getX();
		double y = sD.getOrigin().getY();
		String text = this.getText();
		String[] lines = text.split("\r\n|\r|\n");
		String replaceLine = lines[line];
		String moveText ="";
		if(identifier!=null){
			moveText = replaceLine+"\nmoveTo("+identifier+","+String.format("%.0f", x)+","+String.format("%.0f", y)+")";
			int startArg =("moveTo("+identifier).length();
			int endArg = startArg+(String.format("%.0f", x)+","+String.format("%.0f", y)+")").length();
			System.out.println("startArg="+startArg+" endArg="+endArg);
			sD.setLastTransform(TransformTypes.MOVETO,line+3,col,startArg,endArg);
			run = true;

		}
		else{
			moveText = "moveTo("+replaceLine+","+String.format("%.0f", x)+","+String.format("%.0f", y)+")";
			int startArg =("moveTo("+replaceLine).length();
			int endArg = startArg+(String.format("%.0f", x)+","+String.format("%.0f", y)+")").length();
			System.out.println("startArg="+startArg+" endArg="+endArg);
			sD.setLastTransform(TransformTypes.MOVETO,line+2,col,startArg,endArg);
		}
		lines[line]=moveText;
		String newText = "";
		for(int i=0;i<lines.length;i++){
			newText +=lines[i];
			if(i!=lines.length-1){
				newText+="\n";
			}
		}
		this.setText(newText);
		return run;
		
	}
	
	
	public void insertShapeStatement(Drawable created, String shape) {
		int point = this.getText().length()-2;
		System.out.println("Point ="+point);
		//int point = 0;
		String rectStart;
		if(point==0){
			rectStart=shape+"(";
		}
		else{
			rectStart= "\n"+shape+"(";
		}
		String rectEnd =")";
		Point origin = created.getOrigin();
		String rectStatement = rectStart+roundNum(origin.getX())+","+roundNum(origin.getY())+","+roundNum(created.getWidth())+","+roundNum(created.getHeight())+rectEnd;
		
		
		
		insertText(point,rectStatement);
		
	}
	
	public void insertCurveStatement(Curve created) {
		int point = this.getText().length()-2;
				//int point = 0;
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
		String lineEnd = ")";
		String lineStatement = lineStart+startX+","+startY+","+c1X+","+c1Y+","+c2X+","+c2Y+","+endX+","+endY+lineEnd;
		insertText(point,lineStatement);

		
	}

	
	public void insertLineStatement(Line created) {
		int point = this.getText().length()-2;
		//		int point = 0;
		Point start = created.getStart();
		Point end = created.getEnd();
		String startX = String.valueOf(roundNum(start.getX()));
		String startY = String.valueOf(roundNum(start.getY()));
		String endX = String.valueOf(roundNum(end.getX()));
		String endY = String.valueOf(roundNum(end.getY()));
		
		String lineStart = "line(";
		String lineEnd = ")";
		String lineStatement = lineStart+startX+","+startY+","+endX+","+endY+lineEnd;
		insertText(point,lineStatement);


	}
	
	
	
	
	
	public void insertGesturalStatement(String polyStatement) {
		int point = this.getText().length();
		//		int point = 0;
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


	public void insertStampStatement(String functionCall) {
		String text = this.getText();
		String[] lines = text.split("\r\n|\r|\n");
		if(text.length()<1){
			 addText(functionCall);
		}
		else{
			addText("\n"+functionCall);
		}
		
	}


	public void deleteSelectedText() {
		int start = this.getSelectionStart();
		int end = this.getSelectionEnd();
		String startText = this.getText().substring(0,start);
		String endText = this.getText().substring(end,this.getText().length());
		this.setText(startText+endText);
		
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
	if(!e.getEdit().getPresentationName().contentEquals("style change")){
		undoManager.addEdit(e.getEdit());
		undoAction.update();
		redoAction.update();
	}
}
}

/*class TabAction extends AbstractAction
{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		tabIncrement++
		
	}
	
}*/

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
