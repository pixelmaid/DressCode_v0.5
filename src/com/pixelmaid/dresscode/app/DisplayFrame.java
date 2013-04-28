package com.pixelmaid.dresscode.app;

import java.awt.BorderLayout;
import java.awt.Cursor;

import com.pixelmaid.dresscode.app.ui.ImageButton;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.pixelmaid.dresscode.app.ui.Toolbar;
import com.pixelmaid.dresscode.data.DCProject;
import com.pixelmaid.dresscode.data.DrawableManager;
import com.pixelmaid.dresscode.data.InstructionManager;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.LShape;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.CustomEventListener;
import com.pixelmaid.dresscode.events.EventSource;



public class DisplayFrame extends javax.swing.JFrame implements CustomEventListener, KeyListener, ActionListener, WindowListener, WindowFocusListener,ComponentListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private DrawingFrame drawingFrame;
	private  Embedded canvas;
	private Toolbar drawingToolbar;

	
	private int defaultDrawingPaneWidth = 2000;
	private int defaultDrawingPaneHeight = 1000;
	private int defaultButtonWidth = 50;
	private int defaultButtonHeight = 50;
	
	
	
	private CodingFrame codingFrame;
	private  CodeField codeField;
	private  CodeField hiddenCodeField;

	private  Console output;
	private Toolbar codingToolbar;
	
	private DCProject currentProject;
	//coding panel buttons
	private ImageButton openButton, saveButton, runButton, stopButton, newButton, importButton;
	public static DimensionDialog dimensionDialog;

	private JProgressBar progressBar;
	
	
	//drawing panel buttons
	private ImageButton selectButton, targetButton, printButton, zoomInButton, zoomOutButton, panButton, penButton, gridButton, dimensionButton;
	
	public static JMenuItem newAction, openAction,saveAction ,exitAction ,exportAction, importAction, copyAction ,pasteAction ,cutAction, saveAsAction;
	//private ArrayList<ImageButton> drawingButtons;
	//private ArrayList<ImageButton> codingButtons;
	private static InstructionManager instructionManager;
	private static DrawableManager drawableManager;
	
	
	public EventSource eventSource;
	

	public DisplayFrame(){
		
		//drawingButtons = new ArrayList<ImageButton>();
		//codingButtons = new ArrayList<ImageButton>();
		//create data managers
		
	
		

		//setup custom events
		currentProject = new DCProject();
		eventSource = new EventSource();
		
	}

	public void init(int width, int height){
	

		try {
			 System.setProperty("apple.laf.useScreenMenuBar", "true");
			 
            System.setProperty("com.apple.mrj.application.apple.menu.about.name", "DressCode	");
            System.setProperty("apple.awt.graphics.UseQuartz","true");
            System.setProperty("apple.awt.graphics.EnableDeferredUpdates","true");

			 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());    
	        } catch (UnsupportedLookAndFeelException ex) {
	            ex.printStackTrace();
	        } catch (IllegalAccessException ex) {
	            ex.printStackTrace();
	        } catch (InstantiationException ex) {
	            ex.printStackTrace();
	        } catch (ClassNotFoundException ex) {
	            ex.printStackTrace();
	        }
		
		
		this.setPreferredSize(new Dimension(width,height));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.defaultDrawingPaneWidth = width/2;
		this.defaultDrawingPaneHeight = height;
		
		
		//initialize children panes
		//init drawing side
		canvas = new Embedded();
		canvas.setId(1);
		canvas.addEventListener(this);
		
		canvas.setDimensions(defaultDrawingPaneWidth-5,defaultDrawingPaneHeight-(defaultButtonHeight*2));
		canvas.setDrawingBoardDimensions(currentProject.getWidth(), currentProject.getHeight(),currentProject.getUnits());
		
		drawableManager = new DrawableManager();
		instructionManager = new InstructionManager(drawableManager,currentProject.getWidth(),currentProject.getHeight());
		
		instructionManager.addEventListener(this);
		drawableManager.addEventListener(this);
		
		drawingToolbar = new Toolbar();
		selectButton = new ImageButton("select","arrow.png", "selection tool", defaultButtonWidth,defaultButtonHeight);
		panButton = new ImageButton("pan","pan.png", "hand tool", defaultButtonWidth,defaultButtonHeight );
		zoomInButton = new ImageButton("zoom in","zoomin.png", "zoom in", defaultButtonWidth,defaultButtonHeight );
		zoomOutButton = new ImageButton("zoom out","zoomout.png", "zoom out", defaultButtonWidth,defaultButtonHeight );

		penButton = new ImageButton("pen","pen.png","pen tool",defaultButtonWidth,defaultButtonHeight);
		printButton = new ImageButton("print","print.png", "export your design to pdf", defaultButtonWidth,defaultButtonHeight);
		targetButton = new ImageButton("target","target.png", "get the coordinates from a given location", defaultButtonWidth,defaultButtonHeight);
		gridButton = new ImageButton("grid","grid.png", "toggle grid", defaultButtonWidth,defaultButtonHeight);
		
		dimensionButton = new ImageButton("dimension","dimensions.png", "change dimensions", defaultButtonWidth,defaultButtonHeight);

		
		
		drawingToolbar.addButton(selectButton);
		selectButton.addActionListener(this);
		selectButton.setEnabled(true);

		
		drawingToolbar.addButton(panButton);
		panButton.addActionListener(this);
		
		drawingToolbar.addButton(zoomInButton);
		zoomInButton.addActionListener(this);
		
		drawingToolbar.addButton(zoomOutButton);
		zoomOutButton.addActionListener(this);

		drawingToolbar.addButton(penButton);
		penButton.addActionListener(this);
		penButton.setEnabled(false);
		
		drawingToolbar.addButton(targetButton);
		//targetButton.setEnabled(false);
		targetButton.addActionListener(this);
		
		drawingToolbar.addButton(gridButton);
		gridButton.addActionListener(this);
		
		drawingToolbar.addButton(printButton);
		printButton.addActionListener(this);
		
		drawingToolbar.addButton(dimensionButton);
		dimensionButton.addActionListener(this);

		drawingToolbar.init(defaultDrawingPaneWidth,defaultButtonHeight);

		
		drawingFrame = new DrawingFrame();
		drawingFrame.init(defaultDrawingPaneWidth,defaultDrawingPaneHeight,canvas,drawingToolbar);
		drawingFrame.addComponentListener(this);
		this.getContentPane().add(drawingFrame);
		
		//init code side
		codeField= new CodeField();
		codeField.init();
		
		hiddenCodeField= new CodeField();
		hiddenCodeField.init();
		
		output = new Console();
		output.init();
		
		codingToolbar = new Toolbar();
       
		runButton = new ImageButton("run","run.png", "run your script", defaultButtonWidth,defaultButtonHeight);
		runButton.addActionListener(this);
		stopButton = new ImageButton("stop","stop.png", "stop your script", defaultButtonWidth,defaultButtonHeight);
		stopButton.addActionListener(this);
		newButton = new ImageButton("new","new.png", "create a new script", defaultButtonWidth,defaultButtonHeight);
		newButton.addActionListener(this);
		saveButton = new ImageButton("save","save.png", "save your script", defaultButtonWidth,defaultButtonHeight);
		saveButton.addActionListener(this);
		openButton = new ImageButton("open","open.png", "open an existing script", defaultButtonWidth,defaultButtonHeight);
		openButton.addActionListener(this);
		importButton = new ImageButton("import","import.png", "import an svg into your script", defaultButtonWidth,defaultButtonHeight);
		importButton.addActionListener(this);
		
		//progressBar = new JProgressBar(0,100);
		//progressBar.setStringPainted(true);
		
		codingToolbar.addButton(runButton);
		codingToolbar.addButton(stopButton);
		codingToolbar.addButton(newButton);
		codingToolbar.addButton(saveButton);
		codingToolbar.addButton(openButton);
		codingToolbar.addButton(importButton);
		//codingToolbar.addProgressBar(progressBar);

		codingToolbar.init(defaultDrawingPaneWidth,defaultButtonHeight);
	
		codingFrame = new CodingFrame();
		
		codingFrame.init(defaultDrawingPaneWidth,defaultDrawingPaneHeight, codeField, hiddenCodeField, output, codingToolbar);

		
		this.getContentPane().add(codingFrame,BorderLayout.LINE_END);
		this.getContentPane().doLayout();

		this.pack();
		this.setVisible(true);
		this.addWindowListener(this);
		this.addComponentListener(this);

		//this.setResizable(false);
		createMenu();
		canvas.init();
	}
	
	 public void createMenu() {
	        
	        //frame.setTitle("Menu Example");
	        //frame.setSize(150, 150);
	        
	        // Creates a menubar for a JFrame
	        JMenuBar menuBar = new JMenuBar();
	        
	        // Add the menubar to the frame
	        this.setJMenuBar(menuBar);
	        
	        // Define and add two drop down menu to the menubar
	        JMenu fileMenu = new JMenu("File");
	        JMenu editMenu = new JMenu("Edit");
	        JMenu exampleMenu = new JMenu("Examples");
	        //TODO:setup example menu
	      
	        menuBar.add(fileMenu);
	        menuBar.add(editMenu);
	        menuBar.add(exampleMenu);
	        
	        
	        // Create and add simple menu item to one of the drop down menu
	        newAction = new JMenuItem("New");
	        openAction = new JMenuItem("Open");
	        saveAction = new JMenuItem("Save");
	        saveAsAction = new JMenuItem("Save As");

	        exitAction = new JMenuItem("Exit");
	        exportAction = new JMenuItem("Export to PDF");
	        importAction = new JMenuItem("Import SVG");
	        copyAction = new JMenuItem("Copy");
	        pasteAction = new JMenuItem("Paste");
	        cutAction = new JMenuItem("Cut");
	        
	     
	        fileMenu.add(newAction);
	        fileMenu.add(openAction);
	        fileMenu.add(saveAction);
	        fileMenu.add(saveAsAction);
	        fileMenu.addSeparator();
	        fileMenu.add(exportAction);
	        fileMenu.add(importAction);
	        fileMenu.addSeparator();
	        fileMenu.add(exitAction);
	        
	        //editMenu.add(cutAction);
	        //editMenu.add(copyAction);
	        //editMenu.add(pasteAction);
	        editMenu.add(codeField.getUndoMenu());
	        editMenu.add(codeField.getRedoMenu());

	        
	        
	        //action listeners
	        newAction.addActionListener(this);
	        openAction.addActionListener(this);
	        saveAction.addActionListener(this);
	        saveAsAction.addActionListener(this);
	        exitAction.addActionListener(this);
	        exportAction.addActionListener(this);
	        importAction.addActionListener(this);

	       // copyAction.addActionListener(this);
	        //pasteAction.addActionListener(this);
	        //cutAction.addActionListener(this);
	        
	       
	        
	    }


	 //Event response methods
	 
	 //called when parse is succesful, gets drawables from the drawable manager and passes them to canvas to be drawn
	 private void drawIntoCanvas(){
		 System.out.println(drawableManager.getDrawables());
		 //canvas.init();
		
		canvas.setDrawables(drawableManager.getDrawables());
		
		//progressBar.setValue(100);
		//progressBar.setIndeterminate(false);
		System.out.println("drawn");
		// canvas.showDrawables(drawableManager.getDrawables());
	 }
	 
	 private void reportErrors(String errorTxt){
		 output.reportErrors(errorTxt);
	 }
	 
	 
	 
	//Event Listeners 

	@Override
	public void windowActivated(WindowEvent arg0) {
		System.out.println("window activated");


	}


	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}


	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}


	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}


	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}


	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}
	

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}


	@Override
	public void windowGainedFocus(WindowEvent arg0) {
		System.out.println("window gained focus");

	}


	@Override
	public void windowLostFocus(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}


	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub

	}


	@Override
	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub

	}


	@Override
	public void componentResized(ComponentEvent arg0) {
		//this.getContentPane().remove(drawingFrame);
		System.out.println("canvas resized");
		/*this.canvas.dispose();
		this.canvas = null;
		
		this.canvas= new Embedded();
		
		canvas.setId(2);
		canvas.addEventListener(this);
		canvas.setDimensions(defaultCanvasWidth,defaultCanvasHeight);
		
		drawingFrame.resetSize(this.canvas);
		/*drawingFrame.setVisible(true);
		this.getContentPane().add(drawingFrame);
		//this.getContentPane().doLayout();

		this.pack();*/
		
		/*this.getContentPane().remove(drawingPane);
		canvas = new Embedded();
		canvas.init(defaultCanvasWidth,defaultCanvasHeight);
		
		//drawingPane = new DrawingPane();
		drawingPane.init(defaultDrawingPaneWidth,defaultDrawingPaneHeight,canvas);
		
		this.getContentPane().add(drawingPane);*/
		//canvas.init();*/

	}


	@Override
	public void componentShown(ComponentEvent arg0) {



	}


	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("key pressed");	
		if(e.getKeyCode()==61){
			canvas.zoomIn();
		}

		if(e.getKeyCode()==45){
			canvas.zoomOut();

		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("key code ="+e.getKeyCode());


	}


	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("key typed");


	}


	@Override
	public void actionPerformed(ActionEvent e) {
		canvas.clearMode();
		if (e.getSource() == runButton ) {
			//progressBar.setIndeterminate(false);
			//progressBar.setValue(0);
			//progressBar.setIndeterminate(true);
			this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			drawableManager.clearAllDrawables();
			output.setText("");
			System.out.println("running");
			if(currentProject.hiddenCode()){
				
				currentProject.run(codeField.getCode(),hiddenCodeField.getCode(),instructionManager);
				
			}
			else{
				currentProject.run(codeField.getCode(),instructionManager);	
			}
			
		}
		
		else if (e.getSource() == gridButton ) {
			canvas.setGrid(!canvas.getGrid());
			

		}
		else if (e.getSource()==targetButton){
			canvas.targetMode();
			
			
		}
		
		else if (e.getSource()==panButton){
			canvas.panMode();
			
		}
		else if (		e.getSource() == zoomInButton ) {
			canvas.zoomIn();
			

		}
		else if (e.getSource() == zoomOutButton ) {
			canvas.zoomOut();
			

		}
		else if (e.getSource()==selectButton){
			canvas.selectMode();
		}
		if (e.getSource() == openButton || e.getSource() == openAction) {

			currentProject.openFile(this,codingFrame,canvas,instructionManager);
			//Handle save button action.
		} else if (e.getSource() == saveButton || e.getSource() == saveAction ) {
			
			currentProject.saveFile(this,codeField.getCode(),codingFrame);
		}
		else if (e.getSource() == saveButton || e.getSource() == saveAsAction ) {
			currentProject.setSaved(false);
			currentProject.saveFile(this,codeField.getCode(),codingFrame);
		}
		else if (e.getSource()==newButton ||e.getSource() == newAction){
			currentProject.newFile(codingFrame, codeField,canvas, drawableManager , instructionManager);
		}
		
		else if (e.getSource() == printButton|| e.getSource() == exportAction) {
			currentProject.printFile(this,canvas);

		}
		else if (e.getSource()==dimensionButton){
			setDimensions();
			
		}else if (e.getSource() == importButton || e.getSource() == importAction ) {
			currentProject.importFile(this,codeField);

		}
		else if (e.getSource() == exitAction) {
			System.exit(DISPOSE_ON_CLOSE);

		}
		canvas.redraw();
	

	}
	
	//changes dimensions of file
		private void setDimensions(){
			
			 dimensionDialog = new DimensionDialog(this, true,currentProject.getUnitWidth(),currentProject.getUnitHeight(), currentProject.getUnits());
	         System.err.println("After opening dialog.");
	         if(dimensionDialog.getAnswer()) {
	        	 double widthVal = dimensionDialog.getCanvasWidth();
	        	 double heightVal = dimensionDialog.getCanvasHeight();
	        	 int unitsVal=dimensionDialog.getUnits();
	             System.out.println("width ="+widthVal+" height="+ heightVal+" units="+ unitsVal);
	         	currentProject.setDimensions(widthVal,heightVal, unitsVal, canvas, instructionManager);
	    		
	    		
	    	
	    		
	         }
	         else {
	             System.err.println("The answer stored in CustomDialog is 'false' (i.e. user clicked no button.)");
	         }

		}


	//handles custom events from Dress Code classes
	@Override
	public void handleCustomEvent(Object source, int eventType) {
		System.out.println("parse run");
		switch (eventType){
		case CustomEvent.PARSE_COMPLETE:
			System.out.println("parse complete");
			drawIntoCanvas();
			break;
		case CustomEvent.PARSE_ERROR:
			System.out.println("parse error");
			reportErrors(instructionManager.getError());
			break;
		}
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	}

	@Override
	public void handleCustomDrawableEvent(Object source, int eventType, Drawable d) {
		switch (eventType){
			case CustomEvent.SHAPE_LOAD_REQUESTED:	
			((LShape)d).setCanvas(this.canvas);
			((LShape)d).loadShape();
			break;
		}
		
	}
	
	@Override
	public void handleCustomDrawableEvent(Object source, int event,
			Drawable d1, Drawable d2) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void handleCustomTargetEvent(Object source, int eventType, double x,double y) {
		switch (eventType){
		case CustomEvent.TARGET_SELECTED:	
			this.codeField.insertCoordinate(x,y);
		break;
	}
	}
		
	@Override
	public void handleCustomMoveEvent(Object source, int eventType,Drawable selectedObject) {
		switch (eventType){
		case CustomEvent.DRAWABLE_MOVED:	
			int lineNum  = selectedObject.getLine();
			
			Point origin = selectedObject.getOrigin();
			
			
			String identifier = selectedObject.getIdentifier();

			this.codeField.insertMoveStatement(identifier,lineNum,selectedObject,origin.getX(),origin.getY());
			
			
			
			break;
		}
			
	
		
	}

	@Override
	public void handleCustomRuntimeErrorEventDrawableEvent(Object source,
			int event, String message) {
		System.out.println("error event ="+message);
		
	}

	@Override
	public void handleCustomPrintEvent(Object source, int event, String value) {
		System.out.println("print event ="+value);
		this.output.setText(this.output.getText()+value);
		
	}

	

	
	
	
	
}
