package com.pixelmaid.dresscode.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Insets;
import java.awt.LayoutManager;

import com.pixelmaid.dresscode.app.ui.CodeToolbar;
import com.pixelmaid.dresscode.app.ui.DrawingToolbar;
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
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.pixelmaid.dresscode.app.ui.Toolbar;
import com.pixelmaid.dresscode.app.ui.tools.PenTool;
import com.pixelmaid.dresscode.data.DCProject;
import com.pixelmaid.dresscode.data.DrawableManager;
import com.pixelmaid.dresscode.data.InstructionManager;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.UnitManager;
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
	//private DXFExport dxfExport;
	private DrawingToolbar drawingToolbar;

	
	private int defaultDrawingPaneWidth = 2000;
	private int defaultDrawingPaneHeight = 1000;
	private int defaultButtonWidth = 24;
	private int defaultButtonHeight = 24;
	private int clearButtonWidth = 36;
	private int clearButtonHeight = 19;
	
	private int defaultToolbarHeight = 30;
	
	
	private CodingFrame codingFrame;
	private  CodeField codeField;
	private  CodeField hiddenCodeField;
	private TreeManager	treeManager;

	private  Console output;
	private CodeToolbar codingToolbar;
	
	private DCProject currentProject;
	//coding panel buttons
	private ImageButton openButton, saveButton, runButton, stopButton, newButton, importButton;
	public static DimensionDialog dimensionDialog;

	private JProgressBar progressBar;
	private Color brown = new Color(90,68,60);
	private Color darkBrown = new Color(61,40,35);

	private Color pink = new Color(217,65,78);
	private Color grey = new Color(140,130,129);
	
	private Color lightGrey = new Color(191,184,184);

	private Color offWhite= new Color(242,242,242);
	private Color white= new Color(255,255,255);

	private int fontSize = 12;
	private boolean altKey = false; //boolean for detecting alt key press

	//drawing panel buttons
	private ImageButton selectButton, targetButton, printButton, zoomButton, panButton, penButton, gridButton, dimensionButton,rectButton, ellipseButton,polyButton,lineButton,curveButton,clearButton;
	
	//drawing tools
	private PenTool penTool;
	
	
	public static JMenuItem newAction, openAction,saveAction ,exitAction ,exportAction, importAction, copyAction ,pasteAction ,cutAction, saveAsAction;
	//private ArrayList<ImageButton> drawingButtons;
	//private ArrayList<ImageButton> codingButtons;
	private static InstructionManager instructionManager;
	private static DrawableManager drawableManager;
	
	private ArrayList<ImageButton> buttonList =  new ArrayList<ImageButton>();

	
	public EventSource eventSource;
	private JSplitPane splitFrame;
	

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
		
		
		this.setPreferredSize(new Dimension(width,height	));
		this.setSize(new Dimension(1500,200));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.defaultDrawingPaneWidth = width/2;
		this.defaultDrawingPaneHeight = height+40;
		
		
		splitFrame = new JSplitPane();
		
		//initialize children panes
		//init drawing side
		canvas = new Embedded();
		canvas.setId(1);
		canvas.addEventListener(this);
		
		canvas.setDimensions(defaultDrawingPaneWidth,defaultDrawingPaneHeight);
		canvas.setDrawingBoardDimensions(currentProject.getWidth(), currentProject.getHeight(),currentProject.getUnits());
		
		//dxfExport = new DXFExport();
		//dxfExport.setDimensions(defaultDrawingPaneWidth,defaultDrawingPaneHeight);
	
		
		
		drawableManager = new DrawableManager();
		instructionManager = new InstructionManager(drawableManager,currentProject.getWidth(),currentProject.getHeight());
		
		instructionManager.addEventListener(this);
		drawableManager.addEventListener(this);
		
		//setup tools
		penTool = new PenTool();
		penTool.addEventListener(drawableManager);
		canvas.setTools(penTool);
		
		
		drawingToolbar = new DrawingToolbar();
		selectButton = new ImageButton("select","arrow", "selection tool", defaultButtonWidth,defaultButtonHeight);
		panButton = new ImageButton("pan","pan", "hand tool", defaultButtonWidth,defaultButtonHeight );
		zoomButton = new ImageButton("zoom","zoom", "zoom", defaultButtonWidth,defaultButtonHeight );
		targetButton = new ImageButton("target","target", "get the coordinates from a given location", defaultButtonWidth,defaultButtonHeight);	
		gridButton = new ImageButton("grid","grid", "toggle grid", defaultButtonWidth,defaultButtonHeight);
		dimensionButton = new ImageButton("dimension","dimensions", "change dimensions", defaultButtonWidth,defaultButtonHeight);

		rectButton = new ImageButton("rect","rect","rectangle tool",defaultButtonWidth,defaultButtonHeight);
		ellipseButton = new ImageButton("ellipse","ellipse","ellipse tool",defaultButtonWidth,defaultButtonHeight);
		polyButton = new ImageButton("poly","poly","polygon tool",defaultButtonWidth,defaultButtonHeight);
		lineButton = new ImageButton("line","line","line tool",defaultButtonWidth,defaultButtonHeight);
		curveButton = new ImageButton("curve","curve","curve tool",defaultButtonWidth,defaultButtonHeight);
		importButton = new ImageButton("import","import", "import an svg into your script", defaultButtonWidth,defaultButtonHeight);
		penButton = new ImageButton("pen","pen","pen tool",defaultButtonWidth,defaultButtonHeight);
		
		printButton = new ImageButton("print","print", "export your design to pdf", defaultButtonWidth,defaultButtonHeight);

		buttonList.add(selectButton);
		buttonList.add(panButton);
		buttonList.add(zoomButton);
		buttonList.add(printButton);
		buttonList.add(targetButton);
		buttonList.add(gridButton);
		buttonList.add(importButton);
		buttonList.add(dimensionButton);
		buttonList.add(rectButton);
		buttonList.add(ellipseButton);
		buttonList.add(polyButton);
		buttonList.add(lineButton);
		buttonList.add(curveButton);
		buttonList.add(importButton);
		buttonList.add(penButton);


	
		
		
		drawingToolbar.addButtonTo1(selectButton);
		selectButton.addActionListener(this);
		selectButton.setEnabled(true);

		
		drawingToolbar.addButtonTo1(panButton);
		panButton.addActionListener(this);
		
		drawingToolbar.addButtonTo1(zoomButton);
		zoomButton.addActionListener(this);
		
		drawingToolbar.addButtonTo1(targetButton);
		targetButton.addActionListener(this);
		
		drawingToolbar.addButtonTo1(gridButton);
		gridButton.addActionListener(this);
		
		drawingToolbar.addButtonTo1(dimensionButton);
		dimensionButton.addActionListener(this);

		
		drawingToolbar.addButtonTo2(rectButton);
		penButton.addActionListener(this);
		
		drawingToolbar.addButtonTo2(ellipseButton);
		penButton.addActionListener(this);
		
		drawingToolbar.addButtonTo2(polyButton);
		penButton.addActionListener(this);
		
		drawingToolbar.addButtonTo2(lineButton);
		penButton.addActionListener(this);
		
		drawingToolbar.addButtonTo2(curveButton);
		penButton.addActionListener(this);
		
		drawingToolbar.addButtonTo2(importButton);
		importButton.addActionListener(this);
		
		drawingToolbar.addButtonTo2(penButton);
		penButton.addActionListener(this);
		
		
		drawingToolbar.addButtonTo3(printButton);
		printButton.addActionListener(this);
		
	

		
		drawingToolbar.init(defaultToolbarHeight,defaultDrawingPaneWidth,brown);
		
		
		drawingFrame = new DrawingFrame();
		drawingFrame.init(defaultDrawingPaneWidth,defaultDrawingPaneHeight,canvas,drawingToolbar);
		drawingFrame.addComponentListener(this);
		
		splitFrame.setOrientation(JSplitPane.HORIZONTAL_SPLIT );
		splitFrame.setDividerLocation(width/2); 
		this.getContentPane().add(splitFrame);
		splitFrame.setRightComponent(drawingFrame);
		
		//init code side
		codeField= new CodeField();
		codeField.init(fontSize);
		
		hiddenCodeField= new CodeField();
		hiddenCodeField.init(fontSize);
		
		output = new Console();
		clearButton = new ImageButton("clear","clear", "clear the console", clearButtonWidth,clearButtonHeight);
		clearButton.addActionListener(this);
		
		output.init(lightGrey,darkBrown,fontSize);
		
		
		codingToolbar = new CodeToolbar();
       
		runButton = new ImageButton("run","run", "run your script", defaultButtonWidth,defaultButtonHeight);
		runButton.addActionListener(this);
		stopButton = new ImageButton("stop","stop", "stop your script", defaultButtonWidth,defaultButtonHeight);
		stopButton.addActionListener(this);
		newButton = new ImageButton("new","new", "create a new script", defaultButtonWidth,defaultButtonHeight);
		newButton.addActionListener(this);
		saveButton = new ImageButton("save","save", "save your script", defaultButtonWidth,defaultButtonHeight);
		saveButton.addActionListener(this);
		openButton = new ImageButton("open","open", "open an existing script", defaultButtonWidth,defaultButtonHeight);
		openButton.addActionListener(this);
		
		buttonList.add(runButton);
		buttonList.add(stopButton);
		buttonList.add(newButton);
		buttonList.add(saveButton);
		buttonList.add(openButton);

		
		
		//progressBar = new JProgressBar(0,100);
		//progressBar.setStringPainted(true);
		
		codingToolbar.addButton(runButton);
		codingToolbar.addButton(stopButton);
		codingToolbar.addButton(newButton);
		codingToolbar.addButton(saveButton);
		codingToolbar.addButton(openButton);
		
		//codingToolbar.addProgressBar(progressBar);

		codingToolbar.init(defaultDrawingPaneWidth,defaultToolbarHeight,brown);
		//codingToolbar.setBorder(border);
		treeManager = new TreeManager(offWhite);
		
	
		codingFrame = new CodingFrame();
		
		codingFrame.init(defaultDrawingPaneWidth,defaultDrawingPaneHeight, codeField, hiddenCodeField, output, codingToolbar, treeManager.getTree(),brown,grey,pink,clearButton);

		
		//this.getContentPane().add(codingFrame,BorderLayout.LINE_END);
		splitFrame.setLeftComponent(codingFrame);
		splitFrame.setBorder(null);
		splitFrame.setDividerSize(5);
		splitFrame.setBackground(grey);
		splitFrame.addComponentListener(this);
		//splitFrame.doLayout();
		this.getContentPane().doLayout();

		this.pack();
		this.setVisible(true);
		this.addWindowListener(this);
		this.addComponentListener(this);

		this.setResizable(true);
		createMenu();
		//dxfExport.init();
		//dxfExport.redraw();
		canvas.parent = this;
		canvas.backgroundColor = lightGrey;
		canvas.init();
     	currentProject.setDimensions(UnitManager.DEFAULT_WIDTH,UnitManager.DEFAULT_HEIGHT, UnitManager.STANDARD, canvas, instructionManager);

		canvas.frame = this;
		canvas.console=output;//for debug purposes only
		System.out.println("setting size");
		
		
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
		treeManager.getNodes(drawableManager.getDrawables());
		canvas.setDrawables(drawableManager.getDrawables());
		
		//progressBar.setValue(100);
		//progressBar.setIndeterminate(false);
		System.out.println("drawn");
		
		// canvas.showDrawables(drawableManager.getDrawables());
	 }
	 
	 private void run(){
		 
		//progressBar.setIndeterminate(false);
			//progressBar.setValue(0);
			//progressBar.setIndeterminate(true);
			this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			runButton.setActive();

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
	canvas.setDimensions(drawingFrame.getWidth()-5,drawingFrame.getHeight()-(defaultButtonHeight));
	canvas.setDrawingBoardDimensions(currentProject.getWidth(), currentProject.getHeight(),currentProject.getUnits());
	this.doLayout();
	
	canvas.redraw();
	//Insets insets =canvas.frame.getInsets();
		//canvas.frame.setSize(400 + (insets.left + insets.right), 400 + (insets.top + insets.bottom));
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
		System.out.println(e.getKeyCode());
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
		resetButtons();
		if (e.getSource() == runButton ) {

			run();
			
		}
		
		else if (e.getSource() == gridButton ) {
			canvas.setGrid();
			//gridButton.setActive();
			

		}
		else if (e.getSource()==targetButton){
			canvas.targetMode();
			targetButton.setActive();
			
			
		}
		
		else if (e.getSource()==panButton){
			canvas.panMode();
			panButton.setActive();
			
		}
		else if (		e.getSource() == zoomButton ) {
			canvas.zoomIn();
			zoomButton.setActive();
			

		}
		else if (e.getSource() == zoomButton && altKey==true) {
			canvas.zoomOut();
			zoomButton.setActive();

			

		}
		else if (e.getSource()==selectButton){
			canvas.selectMode();
			selectButton.setActive();
		}
		
		else if (e.getSource()==penButton){
			canvas.penMode();
			penButton.setActive();
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
			//dimensionButton.setActive();
			
		}else if (e.getSource() == importButton || e.getSource() == importAction ) {
			currentProject.importFile(this,codeField);
			//importButton.setActive();

		}
		else if (e.getSource() == exitAction) {
			System.exit(DISPOSE_ON_CLOSE);

		}
		canvas.redraw();
		
	

	}
	
	//resets buttons to non-active states
	private void resetButtons(){
		for(int i=0;i<buttonList.size();i++){
			buttonList.get(i).setInactive();
		}
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
		runButton.setInactive();

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
			
			this.run();
			
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
