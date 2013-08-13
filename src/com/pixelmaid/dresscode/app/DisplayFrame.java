package com.pixelmaid.dresscode.app;

import java.awt.Color;
import java.awt.Cursor;

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
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



import com.pixelmaid.dresscode.app.ui.tools.*;

import com.pixelmaid.dresscode.data.DCProject;
import com.pixelmaid.dresscode.data.DrawableManager;
import com.pixelmaid.dresscode.data.InstructionManager;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.PerlinNoise;
import com.pixelmaid.dresscode.drawing.math.UnitManager;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.LShape;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.CustomEventListener;


public class DisplayFrame extends javax.swing.JFrame implements CustomEventListener, KeyListener, ActionListener, WindowListener, WindowFocusListener,ComponentListener{

	private static final long serialVersionUID = 1L;
	
	//sizing defaults for UI
	private int defaultDrawingPaneWidth = 2000;
	private int defaultDrawingPaneHeight = 1000;
	private final int DEFAULT_BUTTON_WIDTH= 24;
	private final int DEFAULT_BUTTON_HEIGHT= 24;
	private final int CLEAR_BUTTON_WIDTH = 36;
	private final int CLEAR_BUTTON_HEIGHT = 19;
	private final int DEFAULT_TOOLBAR_HEIGHT = 30;
	
	//color constants
	private final Color BROWN = new Color(90,68,60);
	private final Color DARK_BROWN = new Color(61,40,35);
	private final Color PINK = new Color(217,65,78);
	private final Color GREY = new Color(140,130,129);	
	private final Color LIGHT_GREY = new Color(191,184,184);
	private final Color OFF_WHITE = new Color(242,242,242);
	private final Color WHITE= new Color(255,255,255);

	//font size for text in code field
	//TODO: add in method for adjusting font size
	private int fontSize = 12;
	
	//UI components for Coding
	private CodingFrame codingFrame;
	private  CodeField codeField;
	private  CodeField hiddenCodeField; //secondary code field (depreciated) //TODO: get rid of hiddenCodeField
	private TreeManager	treeManager; //declarative view UI component
	private  Console console; //output console
	private CodeToolbar codingToolbar;
	private ImageButton openButton, saveButton, runButton, stopButton, newButton, importButton; //coding panel buttons
		
	//UI components for Drawing
	private DrawingFrame drawingFrame;
	private DrawingToolbar drawingToolbar; 
	private  Canvas canvas; //drawing canvas
	public static DimensionDialog dimensionDialog; //dialog component for adjusting dimensions of canvas
	//drawing panel buttons
	private ImageButton selectButton, targetButton, printButton, zoomButton, panButton, penButton, gridButton, dimensionButton,rectButton, ellipseButton,polyButton,lineButton,curveButton,clearButton;

	private JSplitPane splitFrame; //split frame that holds drawing frame and coding frame

	
	private ArrayList<ImageButton> buttonList =  new ArrayList<ImageButton>(); //array that holds buttons
	
	//menu items
	public static JMenuItem newAction, openAction,saveAction ,exitAction ,exportAction, importAction, copyAction ,pasteAction ,cutAction, saveAsAction;
	
	private DCProject currentProject; //data structure that manages project data
	
	//drawing tools
	private PenTool penTool;
	private TargetTool targetTool;
	private SelectTool selectTool;
	private PanTool panTool;
	private RectTool rectTool;
	private EllipseTool ellipseTool;
	private Tool defaultTool;
	private Tool currentTool;
	
	private static InstructionManager instructionManager; //data manager for program data
	private static DrawableManager drawableManager; //data manager for drawing data

	//keyboard booleans
	private boolean altKey = false;
	private boolean ctrlKey = false;
	
	public static Random mainRandom; //random component for code
	public static PerlinNoise noise; //PGraphics for accessing noise for all code
	
	public DisplayFrame(){
		
	}

	
	 //=================setup methods=======================//

	public void initLook(int width, int height){
		
		//setup window dimensions and appearance
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

		this.defaultDrawingPaneWidth = width/2; //drawing pane width is half of screen
		this.defaultDrawingPaneHeight = height+40;
		
		//initialize children panes
		//initialize drawing side
		canvas = new Canvas();
		canvas.setId(1);
		canvas.setDimensions(defaultDrawingPaneWidth,defaultDrawingPaneHeight);
			
		drawingToolbar = new DrawingToolbar();
		
		//setup drawing buttons
		selectButton = new ImageButton("select","arrow", "selection tool", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);
		panButton = new ImageButton("pan","pan", "hand tool", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT );
		zoomButton = new ImageButton("zoom","zoom", "zoom", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT );
		targetButton = new ImageButton("target","target", "get the coordinates from a given location", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);	
		gridButton = new ImageButton("grid","grid", "toggle grid", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);
		dimensionButton = new ImageButton("dimension","dimensions", "change dimensions", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);
		rectButton = new ImageButton("rect","rect","rectangle tool",DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);
		ellipseButton = new ImageButton("ellipse","ellipse","ellipse tool",DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);
		polyButton = new ImageButton("poly","poly","polygon tool",DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);
		lineButton = new ImageButton("line","line","line tool",DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);
		curveButton = new ImageButton("curve","curve","curve tool",DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);
		importButton = new ImageButton("import","import", "import an svg into your script", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);
		penButton = new ImageButton("pen","pen","pen tool",DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);	
		printButton = new ImageButton("print","print", "export your design to pdf", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);

		//add drawing buttons to button list
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

		//add drawing buttons to drawing toolbar section 1
		drawingToolbar.addButtonTo1(selectButton);
		drawingToolbar.addButtonTo1(panButton);
		drawingToolbar.addButtonTo1(zoomButton);
		drawingToolbar.addButtonTo1(targetButton);
		drawingToolbar.addButtonTo1(gridButton);
		drawingToolbar.addButtonTo1(dimensionButton);
		//add drawing buttons to drawing toolbar section 2
		drawingToolbar.addButtonTo2(rectButton);
		drawingToolbar.addButtonTo2(ellipseButton);
		drawingToolbar.addButtonTo2(polyButton);
		drawingToolbar.addButtonTo2(lineButton);
		drawingToolbar.addButtonTo2(curveButton);
		drawingToolbar.addButtonTo2(importButton);
		drawingToolbar.addButtonTo2(penButton);
		//add drawing buttons to drawing toolbar section 3
		drawingToolbar.addButtonTo3(printButton);
		
		//initialize drawing toolbar
		drawingToolbar.init(DEFAULT_TOOLBAR_HEIGHT,defaultDrawingPaneWidth,BROWN);
		
		//setup drawing frame
		drawingFrame = new DrawingFrame();
		drawingFrame.init(defaultDrawingPaneWidth,defaultDrawingPaneHeight,canvas,drawingToolbar);
		drawingFrame.addComponentListener(this);
	
		
		//setup coding side of UI
		codeField= new CodeField();
		codeField.init(fontSize);
		
		hiddenCodeField= new CodeField();
		hiddenCodeField.init(fontSize);
		
		console = new Console();
		console.addKeyListener(this);		
		console.init(LIGHT_GREY,DARK_BROWN,fontSize);
		clearButton = new ImageButton("clear","clear", "clear the console", CLEAR_BUTTON_WIDTH,CLEAR_BUTTON_HEIGHT);

		codingToolbar = new CodeToolbar();
       
		//setup coding buttons
		runButton = new ImageButton("run","run", "run your script", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);
		stopButton = new ImageButton("stop","stop", "stop your script", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);
		newButton = new ImageButton("new","new", "create a new script", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);
		saveButton = new ImageButton("save","save", "save your script", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);
		openButton = new ImageButton("open","open", "open an existing script", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);
		
		//add buttons to coding toolbar
		codingToolbar.addButton(runButton);
		codingToolbar.addButton(stopButton);
		codingToolbar.addButton(newButton);
		codingToolbar.addButton(saveButton);
		codingToolbar.addButton(openButton);
		
		//add coding buttons to button list
		buttonList.add(runButton);
		buttonList.add(stopButton);
		buttonList.add(newButton);
		buttonList.add(saveButton);
		buttonList.add(openButton);

		codingToolbar.init(defaultDrawingPaneWidth,DEFAULT_TOOLBAR_HEIGHT,BROWN);
		
		//setup treeManager for declarative view
		treeManager = new TreeManager(OFF_WHITE);
		treeManager.getTree().addKeyListener(this);
		
		//setup coding frame
		codingFrame = new CodingFrame();
		codingFrame.init(defaultDrawingPaneWidth,defaultDrawingPaneHeight, codeField, hiddenCodeField, console, codingToolbar, treeManager.getTree(),BROWN,GREY,PINK,clearButton);

		//setup split frame
		splitFrame = new JSplitPane();
		splitFrame.setOrientation(JSplitPane.HORIZONTAL_SPLIT );
		splitFrame.setDividerLocation(width/2); 
		splitFrame.setRightComponent(drawingFrame);
		splitFrame.setLeftComponent(codingFrame);
		splitFrame.setBorder(null);
		splitFrame.setDividerSize(5);
		splitFrame.setBackground(GREY);
		splitFrame.addComponentListener(this);
	
		this.getContentPane().add(splitFrame);
	
		
		createMenu();
		
		
	}
	
	
	public void initData(){
		//setup data managers
		currentProject = new DCProject();
	   	drawableManager = new DrawableManager(); 
		instructionManager = new InstructionManager(drawableManager,currentProject.getWidth(),currentProject.getHeight());
	
		//set dimensions
     	currentProject.setDimensions(UnitManager.DEFAULT_WIDTH,UnitManager.DEFAULT_HEIGHT, UnitManager.STANDARD, canvas, instructionManager);

		//setup canvas
		canvas.parent = this;
		canvas.backgroundColor = LIGHT_GREY;
		canvas.frame = this;
		canvas.console=console;//for debug purposes only
     	canvas.setDrawingBoardDimensions(currentProject.getWidth(), currentProject.getHeight(),currentProject.getUnits());
	
		//setup tools
		penTool = new PenTool();
		penTool.setImage("pen_t");
		targetTool = new TargetTool();
		targetTool.setImage("target_t");
		selectTool = new SelectTool();
		panTool = new PanTool();
		panTool.setImage("pan_t");
		rectTool = new RectTool();
		rectTool.setImage("cross_t");
		ellipseTool = new EllipseTool();
		ellipseTool.setImage("cross_t");
		defaultTool = new Tool();
		
		currentTool= defaultTool;
		
		//setup event listeners
		instructionManager.addEventListener(this);
		drawableManager.addEventListener(this);
		canvas.addEventListener(this);
		penTool.addEventListener(this);
		targetTool.addEventListener(this);
		selectTool.addEventListener(this);
		panTool.addEventListener(this);
		rectTool.addEventListener(this);
		ellipseTool.addEventListener(this);
		
		//setup action listeners
		selectButton.addActionListener(this);
		panButton.addActionListener(this);
		zoomButton.addActionListener(this);
		targetButton.addActionListener(this);
		dimensionButton.addActionListener(this);
		gridButton.addActionListener(this);	
		penButton.addActionListener(this);
		rectButton.addActionListener(this);
		ellipseButton.addActionListener(this);
		polyButton.addActionListener(this);
		lineButton.addActionListener(this);
		curveButton.addActionListener(this);
		penButton.addActionListener(this);
		importButton.addActionListener(this);
		printButton.addActionListener(this);
		clearButton.addActionListener(this);
		runButton.addActionListener(this);
		stopButton.addActionListener(this);
		newButton.addActionListener(this);
		saveButton.addActionListener(this);
		openButton.addActionListener(this);
		newAction.addActionListener(this);
	    openAction.addActionListener(this);
	    saveAction.addActionListener(this);
	    saveAsAction.addActionListener(this);
	    exitAction.addActionListener(this);
	    exportAction.addActionListener(this);
	    importAction.addActionListener(this);  

		//setup key listeners
		drawingToolbar.addKeyListener(this);
		codeField.addKeyListener(this);
		codingToolbar.addKeyListener(this);
		canvas.addKeyListener(this);
		
		for(int i=0;i<buttonList.size();i++){
			buttonList.get(i).addKeyListener(this);
		}
		
		//setup master listeners
		this.addWindowListener(this);
		this.addComponentListener(this);
		
		//setup random and noise generators
		mainRandom = new Random();
		noise = new PerlinNoise();
		
		//run window
		canvas.init();
		this.getContentPane().doLayout();
		this.pack();
		this.setResizable(true);
		this.setVisible(true);
		
	}
	
	//creates main menu
	 public void createMenu() {    
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
	        editMenu.add(codeField.getUndoMenu());
	        editMenu.add(codeField.getRedoMenu());
	    }
	 //=================End setup methods=======================//

	 //=================Event response methods=======================//
	 
	 /*called when parse is successful, 
	 *gets drawables from the drawable manager 
	 *and passes them to canvas to be drawn
	 */
	 private void drawIntoCanvas(){
		 treeManager.getNodes(drawableManager.getDrawables());
		 canvas.setDrawables(drawableManager.getDrawables());
	 }
	 
	 /*sets code parse in motion*/
	 private void run(){
		 	//UI changes
		 	runButton.setActive(); //toggles run button to active visual state
			this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR)); //sets cursor to wait
			console.clearText();

			//removes existing drawables
			//TODO: EVENTUALLY PARSE ONLY MODIFIED CODE
			drawableManager.clearAllDrawables();
			
			//runs code from current project
			currentProject.run(codeField.getCode(),instructionManager);	
			
			/*if(currentProject.hiddenCode()){	
				currentProject.run(codeField.getCode(),hiddenCodeField.getCode(),instructionManager);
			}
			else{
				currentProject.run(codeField.getCode(),instructionManager);	
			}*/
	 }
	 
	 //reports errors that occurred in parse
	//TODO: IMPROVE ERROR REPORTING
	 private void reportErrors(String errorTxt){
		 console.reportErrors("error="+errorTxt);
	 }
	 
	//resets buttons to non-active states
		private void resetButtons(){
			for(int i=0;i<buttonList.size();i++){
				buttonList.get(i).setInactive();
			}
		}
		
		//activates dialog to change dimensions of drawing board
			private void setDimensions(){
				
				 dimensionDialog = new DimensionDialog(this, true,currentProject.getUnitWidth(),currentProject.getUnitHeight(), currentProject.getUnits());
		     
		         if(dimensionDialog.getAnswer()) {
		        	 double widthVal = dimensionDialog.getCanvasWidth();
		        	 double heightVal = dimensionDialog.getCanvasHeight();
		        	 int unitsVal=dimensionDialog.getUnits();
		         	
		        	 currentProject.setDimensions(widthVal,heightVal, unitsVal, canvas, instructionManager);
		    	
		         }
		         else {
		             System.err.println("dimensions unchanged");
		         }

			}

	 
	//=================End Event response methods=======================//
	 
	 //================ CUSTOM event listener methods====================//
	//handles custom events from Dress Code classes
		@Override
		public void handleCustomInstructionEvent(Object source, int eventType) {
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
		public void handleCustomDrawableEvent(Object source, int event, Drawable d1, Drawable d2) {	
		}
		

		@Override
		public void handleCustomToolEvent(Object source, int eventType) {
			switch (eventType){
				case CustomEvent.CANVAS_MOUSE_PRESSED:	
					currentTool.mousePressed(canvas.relativeMouseX(), canvas.relativeMouseY());
				break;
			
				case CustomEvent.CANVAS_MOUSE_RELEASED:
					currentTool.mouseReleased(canvas.relativeMouseX(), canvas.relativeMouseY());
					
					break;
				case CustomEvent.CANVAS_MOUSE_DRAGGED:
					currentTool.mouseDragged(canvas.relativeMouseX(), canvas.relativeMouseY());
				break;
				case CustomEvent.TARGET_SELECTED:
					Point p = targetTool.getTarget();
					this.codeField.insertCoordinate(p.getX(), p.getY());
				break;
				case CustomEvent.DRAWABLE_MOVED:
					Drawable d = selectTool.getSelected();
					this.codeField.insertMoveStatement(d);
					selectTool.reset();
				break;
				case CustomEvent.PAN_ACTIVE:
					canvas.pan();
					canvas.redraw();
				break;
				case CustomEvent.DRAWABLE_CREATED:
					Drawable r = currentTool.getCreated();
					drawableManager.addDrawable(r);
					System.out.println(drawableManager.getDrawables().size());
					canvas.redraw();
					break;
				case CustomEvent.RECT_ADDED:
					codeField.insertShapeStatement(currentTool.getCreated(),"rect");
					break;
				case CustomEvent.ELLIPSE_ADDED:
					codeField.insertShapeStatement(currentTool.getCreated(),"ellipse");
					break;	
				case CustomEvent.REDRAW_REQUEST:
					System.out.println("redraw recieved");
					System.out.println(drawableManager.getDrawables().size());
					 canvas.setDrawables(drawableManager.getDrawables());

					canvas.redraw();
					
					
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
			this.console.setText(this.console.getText()+value);
			
		}
		
	//================ End CUSTOM event listener methods====================//

	//================= DEFAULT Action listener methods =======================//

	@Override
	public void windowActivated(WindowEvent arg0) {
		System.out.println("window activated");
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
	
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
	
	}

	@Override
	public void windowIconified(WindowEvent arg0) {

	}
	
	@Override
	public void windowOpened(WindowEvent arg0) {
		
	}

	@Override
	public void windowGainedFocus(WindowEvent arg0) {
		
	}

	@Override
	public void windowLostFocus(WindowEvent arg0) {
		
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {

	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
	

	}

	@Override
	public void componentResized(ComponentEvent arg0) {
		/*this code is needed for maintaining correct coordinates*/
		canvas.setDimensions(drawingFrame.getWidth()-5,drawingFrame.getHeight()-(DEFAULT_BUTTON_HEIGHT));
		canvas.setDrawingBoardDimensions(currentProject.getWidth(), currentProject.getHeight(),currentProject.getUnits());
		
		//redraw canvas when window is resized
		canvas.redraw();
	}

	@Override
	public void componentShown(ComponentEvent arg0) {

	}

	//keyboard actions
	@Override
	public void keyPressed(KeyEvent e) {
		//zoom in when ctrl + is pressed
		if(e.getKeyCode()==61 && ctrlKey ==true){
			canvas.zoomIn();
			canvas.redraw();
		}
		//zoom out when ctrl - is pressed
		if(e.getKeyCode()==45 && ctrlKey==true){
			canvas.zoomOut();
			canvas.redraw();
		}
		//toggle for alt key
		if(e.getKeyCode()==18){
			altKey=true;
		}
		//toggle for ctrl key
		if(e.getKeyCode()==17){
			ctrlKey=true;
		}
		//toggle pan when space bar is pressed
		if(e.getKeyCode() ==32){
			canvas.panMode();
			panButton.setActive();
			currentTool=panTool;
			canvas.changeCursor(panTool.getImage());
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==18){
			altKey=false;
		}
		
		if(e.getKeyCode()==17){
			ctrlKey=false;
		}
		if(e.getKeyCode() ==32){
			if(panButton.isActive()){
				canvas.clearMode();
				panButton.setInactive();
				currentTool=defaultTool;
				canvas.changeCursor(null);
			}
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	//action handlers for buttons and menu
	@Override
	public void actionPerformed(ActionEvent e) {
		
		canvas.clearMode();
		resetButtons();
		currentTool = defaultTool;
		canvas.changeCursor(null);
		if (e.getSource() == runButton ) {
			run();	
		}
		
		else if (e.getSource() == gridButton ) {
			canvas.setGrid();
		}
		
		else if (e.getSource()==targetButton){
			currentTool = targetTool;
			targetButton.setActive();
			canvas.changeCursor(targetTool.getImage());
		}
		
		else if (e.getSource()==panButton){
			//canvas.panMode();
			panButton.setActive();
			currentTool=panTool;
			canvas.changeCursor(panTool.getImage());

		}
		
		else if (e.getSource() == zoomButton){
			if(altKey==false ) {
				canvas.zoomIn();
			}
			else{
				canvas.zoomOut();
			}
			zoomButton.setActive();
		}
		
		else if (e.getSource()==selectButton){
			selectButton.setActive();
			canvas.showOrigins();
			currentTool = selectTool;
			selectTool.setDrawables(drawableManager.getDrawables());
			
			
		}
		
		else if (e.getSource()==rectButton){
			currentTool = rectTool;
			rectButton.setActive();
			canvas.changeCursor(rectTool.getImage());
		}
		else if (e.getSource()==ellipseButton){
			currentTool = ellipseTool;
			ellipseButton.setActive();
			canvas.changeCursor(ellipseTool.getImage());
		}
		else if (e.getSource()==penButton){
			currentTool = penTool;
			penButton.setActive();
			canvas.changeCursor(penTool.getImage());
		}
		
		else if (e.getSource() == openButton || e.getSource() == openAction) {
			currentProject.openFile(this,codingFrame,canvas,instructionManager);
		}
		
		else if (e.getSource() == saveButton || e.getSource() == saveAction ) {
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
			
		}
		
		else if (e.getSource() == importButton || e.getSource() == importAction ) {
			currentProject.importFile(this,codeField);
		}
		
		else if (e.getSource() == exitAction) {
			System.exit(DISPOSE_ON_CLOSE);

		}
		
		canvas.redraw();

	}
	
	//================= END DEFAULT Action Listeners =======================//

	
	
}
