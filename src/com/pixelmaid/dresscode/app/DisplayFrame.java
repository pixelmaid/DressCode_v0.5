package com.pixelmaid.dresscode.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;

import com.pixelmaid.dresscode.app.ui.CodeToolbar;
import com.pixelmaid.dresscode.app.ui.DrawingToolbar;
import com.pixelmaid.dresscode.app.ui.ImageButton;
import com.pixelmaid.dresscode.app.ui.TreeToolbar;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.text.BadLocationException;



import com.pixelmaid.dresscode.app.ui.tools.*;

import com.pixelmaid.dresscode.data.DCProject;
import com.pixelmaid.dresscode.data.DrawableManager;
import com.pixelmaid.dresscode.data.InstructionManager;
import com.pixelmaid.dresscode.data.Stamp;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.PerlinNoise;
import com.pixelmaid.dresscode.drawing.math.UnitManager;
import com.pixelmaid.dresscode.drawing.primitive2d.Curve;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.LShape;
import com.pixelmaid.dresscode.drawing.primitive2d.Line;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.CustomEventListener;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;

public class DisplayFrame extends javax.swing.JFrame implements CustomEventListener, KeyListener, ActionListener, MouseListener, WindowListener, WindowFocusListener,ComponentListener,TreeSelectionListener{

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
	private StampManager stampManager; //stamp manager UI component
	private boolean fromMain = true; //boolean to manage stamp switching
	private String currentStamp = ""; //boolean to manage stamp switching

	private  Console console; //output console
	private CodeToolbar codingToolbar;
	private ImageButton openButton, saveButton, runButton, stopButton, newButton, importButton; //coding panel buttons
		
	//UI components for Drawing
	private DrawingFrame drawingFrame;
	private DrawingToolbar drawingToolbar; 
	private  Canvas canvas; //drawing canvas
	public static DimensionDialog dimensionDialog; //dialog component for adjusting dimensions of canvas
	public static StampDialog stampDialog; //dialog component for adjusting dimensions of canvas
	//drawing panel buttons
	private ImageButton selectButton, targetButton, printButton, zoomButton, panButton, penButton, gridButton, dimensionButton,rectButton, ellipseButton,polyButton,lineButton,curveButton,clearButton;

	private JSplitPane splitFrame; //split frame that holds drawing frame and coding frame
	private JSplitPane leftSplitFrame; //split frame that holds tree views for stamps and declarative view
	
	private ArrayList<ImageButton> buttonList =  new ArrayList<ImageButton>(); //array that holds buttons
	private LinkedHashMap<String, Stamp> stampMap = new LinkedHashMap<String, Stamp>(); //hashmap for storing created stamps
	private ArrayList<String> exampleList = new ArrayList<String>();
	
	//menu items
	public static JMenuItem newAction, openAction,saveAction ,exitAction ,exportAction, importAction, copyAction ,pasteAction ,cutAction, saveAsAction, stampAction;
	
	private DCProject currentProject; //data structure that manages project data
	
	//drawing tools
	private PenTool penTool;
	private TargetTool targetTool;
	private SelectTool selectTool;
	private PanTool panTool;
	private RectTool rectTool;
	private EllipseTool ellipseTool;
	private PolyTool polyTool;
	private int currentSides= 5; //number of sides for polyTool
	private LineTool lineTool;
	private CurveTool curveTool;
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
		treeManager = new TreeManager(OFF_WHITE,LIGHT_GREY);
		treeManager.getTree().addKeyListener(this);

		stampManager = new StampManager(OFF_WHITE,LIGHT_GREY);
		stampManager.getTree().addKeyListener(this);

		//setup coding frame
		codingFrame = new CodingFrame();
		
		JScrollPane stampView = new JScrollPane(stampManager.getTree());
		stampView.setBorder(null);
		
		JScrollPane treeView = new JScrollPane(treeManager.getTree());
		treeView.setBorder(null);
		
		

		JPanel stampContainer = new JPanel();
		stampContainer.setBorder(null);
		stampContainer.setBackground(OFF_WHITE);
		BorderLayout b = new BorderLayout();
		b.setVgap(10);
		stampContainer.setLayout(b);
		TreeToolbar stampToolbar = new TreeToolbar();
		stampToolbar.init(400,20, "Stamps", BROWN,OFF_WHITE, PINK);
		stampContainer.add(stampToolbar,BorderLayout.NORTH);
		stampContainer.add(stampView,BorderLayout.CENTER);
		
		JPanel treeContainer = new JPanel();
		treeContainer.setBorder(null);
		treeContainer.setBackground(OFF_WHITE);
		BorderLayout b2 = new BorderLayout();
		b2.setVgap(10);
		treeContainer.setLayout(b2);
		TreeToolbar treeToolbar = new TreeToolbar();
		treeToolbar.init(400,20, "Shapes", BROWN,OFF_WHITE, PINK);
		treeContainer.add(treeToolbar,BorderLayout.NORTH);
		treeContainer.add(treeView,BorderLayout.CENTER);
		
		leftSplitFrame = new JSplitPane();
		leftSplitFrame.setBorder(null);
		leftSplitFrame.setOrientation(JSplitPane.VERTICAL_SPLIT );
		leftSplitFrame.setDividerLocation(height/2); 
		leftSplitFrame.setTopComponent(stampContainer);
		leftSplitFrame.setBottomComponent(treeContainer);
		
	
		leftSplitFrame.setDividerSize(5);
		leftSplitFrame.setBackground(GREY);
		leftSplitFrame.addComponentListener(this);
		
		codingFrame.init(defaultDrawingPaneWidth,defaultDrawingPaneHeight, codeField, hiddenCodeField, console, codingToolbar, leftSplitFrame,BROWN,GREY,PINK,clearButton);
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
		
		//setup left split frame
		
		
	
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
		polyTool = new PolyTool();
		polyTool.setImage("cross_t");
		polyTool.setSideNum(currentSides);
		lineTool = new LineTool();
		lineTool.setImage("cross_t");
		curveTool = new CurveTool();
		curveTool.setImage("cross_t");
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
		polyTool.addEventListener(this);
		lineTool.addEventListener(this);
		curveTool.addEventListener(this);

		stampManager.addEventListener(this);
		treeManager.addEventListener(this);
		
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
		polyButton.addMouseListener(this);
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
	    stampAction.addActionListener(this);
	    stampManager.getTree().addTreeSelectionListener(this);

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
		currentProject.newFile(codingFrame, codeField,canvas, drawableManager , instructionManager);
		updateLabels();
		
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
	        setupExampleMenu(exampleMenu);
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
	        stampAction = new JMenuItem("Create stamp from selected objects");
	        
	     
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
	        editMenu.add(stampAction);
	        
			

	    }
	 
	 //loads the example menu with examples
	 private void setupExampleMenu(JMenu exampleMenu){
		String path = (ClassLoader.getSystemResource("com/pixelmaid/dresscode/resources/examples")).getPath();
		 File exampleFolder = new File(path);
			File[] files = exampleFolder.listFiles();
			for (File file : files) {
				if(file.isDirectory()){
				String name = file.getName().substring(0, file.getName().length());
				System.out.println("name="+name+"\n");
				exampleList.add(name);
				JMenuItem exampleAction = new ExampleItem(name);
				exampleMenu.add(exampleAction);
				exampleAction.addActionListener(this);
				}
			} 
	 }
	 
	 //opens an example according to string
	 private void openExample(String name){
		String path = (ClassLoader.getSystemResource("com/pixelmaid/dresscode/resources/examples/"+name+"/"+name+".dc")).getPath();
		File example = new File(path);
		openFile(example);
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
	 
	 /* called when create stamp is selected from menu
	  * creates a stamp out of the currently selected drawable
	  * add stamp to stamp palette
	  */
	 private void createStamp(){
		 Drawable selected = selectTool.getSelected();
		 if(selected!=null){
			 stampDialog = new StampDialog(this,true,stampMap);
			 if(stampDialog.getAnswer()){
				 Stamp stamp = new Stamp();
				 stamp.setDrawables(stampDialog.getName(),stampDialog.isStatic(),selected);
				 stampManager.addChild(stamp);
				 stampMap.put(stamp.getFunctionName(),stamp);
			 	
			 }
		 }
		 else{
			 System.out.println("no objected selected, cannot create stamp!");
		 }
	 }
	 
	 /*called when stamp is selected in stamp manager*/
	 private void selectStamp(){
		 this.codeField.stopFilter(); //remove the current document filter on the codefield

			if(fromMain){//if current code is main code, save into current project
				this.currentProject.setCode(this.codeField.getCode());
			}
			else{ //otherwise save current stamp code in correct stamp
				updateStampCode();
			}
			fromMain = false; //set from main to false (prevents incorrect saving of files)
			String stampName = stampManager.getSelectedNode(); //get new stamp name from stampManager
			currentStamp = stampName;
			codingToolbar.updateLabel(stampName); //update label of coding window

			Stamp stamp = stampMap.get(stampName); //locate new stamp based on name
			this.codeField.setText(stamp.getFunctionDef()); //set code field text to stamp function
			this.codeField.startFilter(stamp.getFunctionCall().length()+4); //filter code field to prevent editing of function name
	 }
	 
	 /*resets code field to main program*/
	 private void selectMain(){
		 this.codeField.stopFilter(); //remove the current document filter on the codefield
		if(currentStamp!=""){
			updateStampCode(); //save stamp modifications
		}

		currentStamp=""; //set current stamp to empty string
		fromMain = true; //set from main to true (prevents incorrect saving of files)
		 stampManager.selectMainNode();

		codingToolbar.updateLabel(this.currentProject.getName()); //set label back to main project name
		this.codeField.setText(this.currentProject.getCode());//set code field text back to main project code
	 }
	 
	 /*inserts stamp function call into program*/
	 private void insertStamp(){
		
		 String stampName = stampManager.getSelectedNode();
		 Stamp stamp = stampMap.get(stampName);
		 selectMain();	
		 codeField.addText("\n"+stamp.getFunctionCall());
		this.currentProject.setCode(this.codeField.getCode()); //update project code to include added statements
	
	 }
	 
	 /*updates the code of the current stamp with modifications made by user*/
	 private void updateStampCode(){
		 Stamp pStamp =  stampMap.get(currentStamp);
			pStamp.setFunctionDef(this.codeField.getCode());
	 }
	
	 /*adds in an irregular polygon statement to the code field*/
	 private void addPolyStatement(Polygon p){
			String polyStatement = Stamp.addPolyStatement(p, false);
			codeField.insertIrregularStatement(polyStatement);
			this.currentProject.setCode(this.codeField.getCode());
	 }
	 
	 /*sets code parse in motion*/
	 private void run(){
		 	//UI changes
		 	runButton.setActive(); //toggles run button to active visual state
			this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR)); //sets cursor to wait
			console.clearText();
			codeField.removeHighlights();
			//removes existing drawables
			//TODO: EVENTUALLY PARSE ONLY MODIFIED CODE
			drawableManager.clearAllDrawables();
			if(fromMain){
				currentProject.setCode(codeField.getCode());
			}
			else{
				updateStampCode();
			}
			//runs code from current project
			currentProject.run(currentProject.getCode(),stampMap,instructionManager);	
			
			/*if(currentProject.hiddenCode()){	
				currentProject.run(codeField.getCode(),hiddenCodeField.getCode(),instructionManager);
			}
			else{
				currentProject.run(codeField.getCode(),instructionManager);	
			}*/
	 }
	 
	 
	 //opens new file
	 
	 private void openFile(File file){
		 LinkedHashMap<String,Stamp> stmps = currentProject.openFile(file, this,codingFrame,canvas,instructionManager);
			if(stmps!=null){
				stampManager.clearChildren();
				stampMap.clear();
				stampMap = stmps;
				for (String key : stampMap.keySet())
				{
					stampManager.addChild(stampMap.get(key));
				}
			}
			codeField.setUnsaved(false);
			updateLabels();
	 }
	 
	 //creates new file
	 private void newFile(){
		 if(codeField.getUnsaved()){
			 NewSaveDialog sd = new NewSaveDialog(this,true);
			if(sd.getAnswer()==NewSaveDialog.CANCEL){
				System.out.println("new file canceled");
			}
			else{
			 if(sd.getAnswer()==NewSaveDialog.SAVED){
				 saveFile();
			}
			 selectMain();
			 codeField.setUnsaved(false);
			 stampMap.clear();
			 stampManager.clearChildren();
			currentProject.newFile(codingFrame, codeField,canvas, drawableManager , instructionManager);
			updateLabels();
			}
		 }
		 else{
			 selectMain();
			codeField.setUnsaved(false);
			 stampMap.clear();
			 stampManager.clearChildren();
			currentProject.newFile(codingFrame, codeField,canvas, drawableManager , instructionManager);
			updateLabels();
		 }
		
	 }
	 
	 //saves the file
	 private void saveFile(){
		 currentProject.saveFile(this,codeField.getCode(),this.stampMap,codingFrame);
		 codeField.setUnsaved(false);
		 updateLabels();
	 }
	 
	 //updates any identifying labels of the files
	 private void updateLabels(){
		if(fromMain){
		 this.codingToolbar.updateLabel(currentProject.getName());
		}
		 this.stampManager.updateLabel(currentProject.getName());
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
					selectMain();
					Point p = targetTool.getTarget();
					this.codeField.insertCoordinate(p.getX(), p.getY());
					this.currentProject.setCode(this.codeField.getCode());

				break;
				case CustomEvent.TREE_DRAWABLE_SELECTED:
					try{
						Drawable selected = treeManager.getSelectedDrawable();
						codeField.highlightLine(selected.getInitLine());

						canvas.redraw();
					}
					catch (BadLocationException e){
						System.out.println(e);
					}
					break;
				case CustomEvent.DRAWABLE_MOVED:
					selectMain();
					Drawable d = selectTool.getSelected();
					this.codeField.insertMoveStatement(d);
					this.currentProject.setCode(this.codeField.getCode());

				break;
				case CustomEvent.PAN_ACTIVE:
					canvas.pan();
					canvas.redraw();
				break;
				case CustomEvent.DRAWABLE_CREATED:
					selectMain();
					Drawable r = currentTool.getCreated();
					drawableManager.addDrawable(r);
					System.out.println(drawableManager.getDrawables().size());
					canvas.redraw();
					break;
				case CustomEvent.RECT_ADDED:
					selectMain();
					codeField.insertShapeStatement(currentTool.getCreated(),"rect");
					this.currentProject.setCode(this.codeField.getCode());
					run();	
					
					break;
				case CustomEvent.ELLIPSE_ADDED:
					selectMain();
					codeField.insertShapeStatement(currentTool.getCreated(),"ellipse");
					this.currentProject.setCode(this.codeField.getCode());
					run();	
					break;	
				case CustomEvent.POLY_ADDED:
					selectMain();
					codeField.insertPolyStatement((Polygon)currentTool.getCreated(),((PolyTool)currentTool).getRotation());
					this.currentProject.setCode(this.codeField.getCode());
					run();	
					break;
					
				case CustomEvent.IRREGULAR_POLY_ADDED:
					selectMain();
					addPolyStatement(((PenTool)currentTool).closePoly());
					run();	
					break;
				
				case CustomEvent.LINE_ADDED:
					selectMain();
					codeField.insertLineStatement((Line)currentTool.getCreated());
					this.currentProject.setCode(this.codeField.getCode());
					run();	
					break;
				case CustomEvent.CURVE_ADDED:
					selectMain();
					codeField.insertCurveStatement((Curve)currentTool.getCreated());
					this.currentProject.setCode(this.codeField.getCode());
					run();	
					break;
				case CustomEvent.REDRAW_REQUEST:
					 canvas.setDrawables(drawableManager.getDrawables());

					canvas.redraw();
					break;
				case CustomEvent.DESELECT_ALL:
					
					drawableManager.deselectAll();
					canvas.redraw();
					break;
				case CustomEvent.STAMP_SELECTED:	
					selectStamp();

					break;
				case CustomEvent.MAIN_SELECTED:
					selectMain();
					break;
				case CustomEvent.STAMP_INSERTED:
					insertStamp();
					run();
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
		if(this.fromMain){
			
				this.currentProject.setCode(this.codeField.getCode());
			
		}
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
		if(e.getSource() !=penButton && penTool.isActive()){
			Polygon p = penTool.closePoly();
			if(p!=null){
				addPolyStatement(p);
			}
			penTool.setActive(false);
			
		}
		
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
			penTool.setActive(true);
			canvas.changeCursor(penTool.getImage());
		}
		else if (e.getSource()==polyButton){
			currentTool = polyTool;
			polyButton.setActive();
			canvas.changeCursor(polyTool.getImage());
		}
		else if (e.getSource()==lineButton){
			currentTool = lineTool;
			lineButton.setActive();
			canvas.changeCursor(lineTool.getImage());
		}
		else if (e.getSource()==curveButton){
			currentTool = curveTool;
			curveButton.setActive();
			canvas.changeCursor(curveTool.getImage());
		}
		
		else if (e.getSource()==clearButton){
			console.clearText();
		}
		
		else if (e.getSource() == openButton || e.getSource() == openAction) {
			openFile(null);
		}
		
		else if (e.getSource() == saveButton || e.getSource() == saveAction ) {
			saveFile();
		}
		
		else if (e.getSource() == saveAsAction ) {
			currentProject.setSaved(false);
			saveFile();
		}
		
		
		else if (e.getSource()==newButton ||e.getSource() == newAction){
			newFile();
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
		else if (e.getSource() == stampAction){
			createStamp();
			run();
			
		}
		else if (e.getSource() instanceof ExampleItem){
			ExampleItem eI = (ExampleItem)e.getSource();
			System.out.println(eI.getName());
			openExample(eI.getName());
			
		}
			
		
		canvas.redraw();

	}


	@Override
	public void valueChanged(TreeSelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	//================= END DEFAULT Action Listeners =======================//

	
	class ExampleItem extends JMenuItem{
		String name;
		public ExampleItem(String name){
			
			super(name);
			this.name= name;
		}
		
		public String getName(){
			return this.name;
		}
		
	}




	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() == 2 && !e.isConsumed()) {
		   System.out.println("double click event");
		   if(e.getSource()==polyButton){
			   PolyDialog polyDialog = new PolyDialog(this,true,currentSides);
			   if(polyDialog.getAnswer()){
				   currentSides = polyDialog.getSides();
				   polyTool.setSideNum(currentSides);
			   }
			   
		   }
		}
		
	}
	
	


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
