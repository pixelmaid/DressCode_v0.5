package com.pixelmaid.dresscode.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;

import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.app.ui.CodeToolbar;
import com.pixelmaid.dresscode.app.ui.DrawingToolbar;
import com.pixelmaid.dresscode.app.ui.ImageButton;
import com.pixelmaid.dresscode.app.ui.PatternToolbar;
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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Random;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.text.BadLocationException;



import com.pixelmaid.dresscode.app.ui.tools.*;
import com.pixelmaid.dresscode.app.ui.usercreated.UserUI;

import com.pixelmaid.dresscode.data.DCProject;
import com.pixelmaid.dresscode.data.DrawableManager;
import com.pixelmaid.dresscode.data.DynamicStamp;
import com.pixelmaid.dresscode.data.InstructionManager;
import com.pixelmaid.dresscode.data.Stamp;
import com.pixelmaid.dresscode.data.UserUIManager;
import com.pixelmaid.dresscode.data.templates.TemplateManager;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.PerlinNoise;
import com.pixelmaid.dresscode.drawing.math.UnitManager;
import com.pixelmaid.dresscode.drawing.primitive2d.Curve;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Ellipse;
import com.pixelmaid.dresscode.drawing.primitive2d.LShape;
import com.pixelmaid.dresscode.drawing.primitive2d.Line;
import com.pixelmaid.dresscode.drawing.primitive2d.Rectangle;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.CustomEventListener;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;

public class DisplayFrame extends javax.swing.JFrame implements CustomEventListener, KeyListener, ActionListener, MouseListener, WindowListener, WindowFocusListener,ComponentListener,ListSelectionListener{

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
	private ListManager	treeManager; //declarative view UI component
	private ListManager stampManager; //stamp manager UI component
	private boolean fromMain = true; //boolean to manage stamp switching
	private boolean fromTemplate = false; //boolean to manage stamp switching

	private String currentStamp = ""; //boolean to manage stamp switching

	private  Console console; //output console
	private CodeToolbar codingToolbar;
	private ImageButton openButton, saveButton, runButton, stopButton, newButton, importButton, backButton; //coding panel buttons
	
	private PatternToolbar patternToolbar;
	private JComboBox patternDropdown;
	//UI components for Drawing
	private DrawingFrame drawingFrame;
	private DrawingToolbar drawingToolbar; 
	private  Canvas canvas; //drawing canvas
	public static DimensionDialog dimensionDialog; //dialog component for adjusting dimensions of canvas
	public static StampDialog stampDialog; //dialog component for adjusting dimensions of canvas
	public static IrregularShapeDialog shapeDialog; //dialog component for adjusting dimensions of canvas

	//drawing panel buttons
	private ImageButton selectButton, targetButton, printButton, zoomButton, panButton, penButton, gridButton, dimensionButton,rectButton, ellipseButton,polyButton,lineButton,curveButton,clearButton;
	private ImageButton unionButton, diffButton, xorButton, clipButton;
	private ImageButton simButton, patternButton, designButton, sliderButton;
	private JSplitPane splitFrame; //split frame that holds drawing frame and coding frame
	private JSplitPane leftSplitFrame; //split frame that holds tree views for stamps and declarative view
	
	private SliderFrame sliderFrame;
	
	
	private ArrayList<ImageButton> buttonList =  new ArrayList<ImageButton>(); //array that holds buttons
	private LinkedHashMap<String, Stamp> stampMap = new LinkedHashMap<String, Stamp>(); //hashmap for storing created stamps
	private ArrayList<String> exampleList = new ArrayList<String>();
	
	//menu items
	public static JMenuItem newAction, openAction,saveAction ,exitAction ,exportAction, loadPatternAction, importAction, copyAction ,pasteAction ,cutAction, saveAsAction, stampAction,dStampAction;
	
	private JMenu fileMenu, editMenu, exampleMenu;
	
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
	private BoolTool boolTool;
	private Tool defaultTool;
	private Tool currentTool;	
	
	
	private static InstructionManager instructionManager; //data manager for program data
	private static DrawableManager drawableManager; //data manager for drawing data
	private static UserUIManager uiManager; //data manager for drawing data

	//keyboard booleans
	private boolean altKey = false;
	private boolean ctrlKey = false;
	private boolean shiftKey = false;
	
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

		//setup boolean buttons
		unionButton = new ImageButton("union","union", "arrow", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT );
		diffButton = new ImageButton("diff","diff", "arrow", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT );
		xorButton = new ImageButton("xor","xor", "arrow", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT );
		clipButton = new ImageButton("clip","clip", "arrow", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT );

		//setup pattern buttons
		patternButton = new ImageButton("pattern","pattern", "switch to pattern template view", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);
		simButton = new ImageButton("sim","sim", "open simulation view", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);
		designButton = new ImageButton("design","design", "switch to design view", DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);
		sliderButton = new ImageButton("sliders","sliders","open slider panel",DEFAULT_BUTTON_WIDTH,DEFAULT_BUTTON_HEIGHT);
		designButton.setActive();
		//patternButton.setEnabled(false);
		simButton.setEnabled(false);
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
		buttonList.add(unionButton);
		buttonList.add(diffButton);
		buttonList.add(xorButton);
		buttonList.add(clipButton);

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
		drawingToolbar.addButtonTo3(unionButton);
		drawingToolbar.addButtonTo3(diffButton);
		drawingToolbar.addButtonTo3(xorButton);
		drawingToolbar.addButtonTo3(clipButton);

		
		drawingToolbar.addButtonTo4(printButton);
		
		//initialize drawing toolbar
		drawingToolbar.init(DEFAULT_TOOLBAR_HEIGHT,defaultDrawingPaneWidth,BROWN);
		
		//initialize pattern toolbar
		patternToolbar = new PatternToolbar();
		
		patternDropdown = new JComboBox();
		patternDropdown.setEnabled(false);
		
		patternToolbar.addButton(designButton);
		patternToolbar.addButton(patternButton);
		patternToolbar.addButton(simButton);

		patternToolbar.init(defaultDrawingPaneWidth,DEFAULT_TOOLBAR_HEIGHT,patternDropdown,BROWN,sliderButton);

		//setup drawing frame
		drawingFrame = new DrawingFrame();
		drawingFrame.init(defaultDrawingPaneWidth,defaultDrawingPaneHeight,canvas,drawingToolbar, patternToolbar);
		drawingFrame.addComponentListener(this);
	
		
		//setup coding side of UI
		codeField= new CodeField("main");
		codeField.init(fontSize);
		
		
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
		backButton = new ImageButton("back","back", "return to main script", 20,19);
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

		codingToolbar.init(defaultDrawingPaneWidth,DEFAULT_TOOLBAR_HEIGHT,BROWN, backButton);
		
		//setup treeManager for declarative view
		treeManager = new ListManager(OFF_WHITE,LIGHT_GREY);
		treeManager.getList().addKeyListener(this);

		stampManager = new ListManager(OFF_WHITE,LIGHT_GREY);
		stampManager.getList().addKeyListener(this);
	
		
		
		//setup coding frame
		codingFrame = new CodingFrame();
		
		JScrollPane stampView = new JScrollPane(stampManager.getList());
		stampView.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		stampView.setBorder(null);
		
		JScrollPane treeView = new JScrollPane(treeManager.getList());
		treeView.setBorder(null);
		treeView.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		

		JPanel stampContainer = new JPanel();
		stampContainer.setBorder(null);
		stampContainer.setBackground(OFF_WHITE);
		BorderLayout b = new BorderLayout();
		b.setVgap(10);
		stampContainer.setLayout(b);
		TreeToolbar stampToolbar = new TreeToolbar();
		stampToolbar.init(400,DEFAULT_TOOLBAR_HEIGHT, "Stamps", BROWN,OFF_WHITE, PINK);
		stampContainer.add(stampToolbar,BorderLayout.NORTH);
		stampContainer.add(stampView,BorderLayout.CENTER);
		
		JPanel treeContainer = new JPanel();
		treeContainer.setBorder(null);
		treeContainer.setBackground(OFF_WHITE);
		BorderLayout b2 = new BorderLayout();
		b2.setVgap(10);
		treeContainer.setLayout(b2);
		TreeToolbar treeToolbar = new TreeToolbar();
		treeToolbar.init(400,DEFAULT_TOOLBAR_HEIGHT, "Shapes", BROWN,OFF_WHITE, PINK);
		treeContainer.add(treeToolbar,BorderLayout.NORTH);
		treeContainer.add(treeView,BorderLayout.CENTER);
		
		leftSplitFrame = new JSplitPane();
		leftSplitFrame.setBorder(null);
		leftSplitFrame.setOrientation(JSplitPane.VERTICAL_SPLIT );
		leftSplitFrame.setDividerLocation(height/4); 
		leftSplitFrame.setBottomComponent(stampContainer);
		leftSplitFrame.setTopComponent(treeContainer);
		
	
		leftSplitFrame.setDividerSize(5);
		leftSplitFrame.setBackground(GREY);
		leftSplitFrame.addComponentListener(this);
		
		codingFrame.init(defaultDrawingPaneWidth,defaultDrawingPaneHeight, codeField, console, codingToolbar, leftSplitFrame,BROWN,GREY,PINK,clearButton);
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
		
		sliderFrame = new SliderFrame();
		sliderFrame.init(100, 400);
	

	}
	
	
	public void initData(){
		//setup data managers
		currentProject = new DCProject();
	   	drawableManager = new DrawableManager();
	   	uiManager = new UserUIManager(this.codeField,sliderFrame); 
	   	uiManager.addEventListener(this);
		instructionManager = new InstructionManager(drawableManager,uiManager,currentProject.getWidth(),currentProject.getHeight());
	
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
		selectTool.init();
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
		boolTool = new BoolTool();
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
		boolTool.addEventListener(this);
		stampManager.addEventListener(this);
		treeManager.addEventListener(this);
		TemplateManager.e.addEventListener(this);
		
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
		unionButton.addActionListener(this);
		xorButton.addActionListener(this);
		diffButton.addActionListener(this);
		clipButton.addActionListener(this);
		printButton.addActionListener(this);
		clearButton.addActionListener(this);
		runButton.addActionListener(this);
		stopButton.addActionListener(this);
		newButton.addActionListener(this);
		saveButton.addActionListener(this);
		openButton.addActionListener(this);
		newAction.addActionListener(this);
	    openAction.addActionListener(this);
	    backButton.addActionListener(this);
	    saveAction.addActionListener(this);
	    saveAsAction.addActionListener(this);
	    exitAction.addActionListener(this);
	    exportAction.addActionListener(this);
	    importAction.addActionListener(this);
	    loadPatternAction.addActionListener(this);
	    stampAction.addActionListener(this);
	    dStampAction.addActionListener(this);
	    designButton.addActionListener(this);
	    patternButton.addActionListener(this);
	    simButton.addActionListener(this);
	    sliderButton.addActionListener(this);
	    patternDropdown.addActionListener(this);

	    stampManager.getList().addListSelectionListener(this);

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
	       fileMenu = new JMenu("File");
	       editMenu = new JMenu("Edit");
	        exampleMenu = new JMenu("Examples");
	      try{
	        setupExampleMenu(exampleMenu);
	      }
	     catch(java.lang.NullPointerException e ){
	    	 System.out.println("can't setup example menu, sorry :(");
	     }
	      
	        menuBar.add(fileMenu);
	        menuBar.add(editMenu);
	        menuBar.add(exampleMenu);
	        
	        // Create and add simple menu item to one of the drop down menu
	        newAction = new JMenuItem("New");
	        openAction = new JMenuItem("Open");
	        saveAction = new JMenuItem("Save");
	        saveAsAction = new JMenuItem("Save As");
	        loadPatternAction = new JMenuItem("Load Pattern Template");
	        exitAction = new JMenuItem("Exit");
	        exportAction = new JMenuItem("Export to PDF");
	        importAction = new JMenuItem("Import SVG");
	        copyAction = new JMenuItem("Copy");
	        pasteAction = new JMenuItem("Paste");
	        cutAction = new JMenuItem("Cut");
	        stampAction = new JMenuItem("Create static stamp from selected object");
	        dStampAction = new JMenuItem("Create dynamic stamp from selected text");

	     
	        fileMenu.add(newAction);
	        fileMenu.add(openAction);
	        fileMenu.add(saveAction);
	        fileMenu.add(saveAsAction);
	        fileMenu.addSeparator();
	        fileMenu.add(exportAction);
	        fileMenu.add(importAction);
	        fileMenu.addSeparator();
	        fileMenu.add(loadPatternAction);
	        fileMenu.addSeparator();
	        fileMenu.add(exitAction);
	        editMenu.add(codeField.getUndoMenu());
	        editMenu.add(codeField.getRedoMenu());
	        editMenu.add(stampAction);
	        editMenu.add(dStampAction);
	        
			

	    }
	 
	//loads the example menu with examples
//	private void setupExampleMenu(JMenu exampleMenu){
		
//	
	//}
	
	
	 private void setupExampleMenu(JMenu exampleMenu){
		 String path = "../examples/examples";
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
		String path = "../examples/examples/"+name+"/"+name+".dc";
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
		 //treeManager.getNodes(drawableManager.getDrawables());
		 canvas.setDrawables(drawableManager.getDrawables());
		 canvas.redraw();
		// canvas.setUserUI(uiManager.getUserUIs());
	 }
	 
	 /* called when create stamp is selected from menu
	  * creates a stamp out of the currently selected drawable
	  * add stamp to stamp palette
	  */
	 private void createStaticStamp(String name, Drawable s){
		 //TODO: create groups from multiply selected shapes?
		 if(s!=null){
			
				 Stamp stamp = new Stamp();
				 stamp.setDrawables(name,false,s);
				 stampManager.addItem(name);
				 stampMap.put(stamp.getFunctionName(),stamp);
				 codingFrame.addCodeField(name, stamp.getFunctionDef(), this.fontSize);
				 insertStamp(stamp);
			 	
			 }
		 
		
	 }
	 
	 private void createDynamicStamp(){
		String selected = codeField.getSelectedText();
		 if(selected!=null){
			 stampDialog = new StampDialog(this,true,stampMap);
			 if(stampDialog.getAnswer()){
				 DynamicStamp stamp = new DynamicStamp();
				 stamp.setCode(stampDialog.getName(),selected);
				 //stampManager.addChild(stamp);
				 stampMap.put(stamp.getFunctionName(),stamp);
			 	
			 }
		 }
		 else{
			 StampDialog.infoBox("No text is selected.", "","Error creating stamp");
		 }
	 }
	 
	 /*called when stamp is selected in stamp manager*/
	 private void selectStamp(String stampName){
		 this.patternButton.setInactive();
		 this.designButton.setActive();
		 this.patternToolbar.updateLabel("Design View");
		 Stamp stamp = stampMap.get(stampName);
		 codingFrame.switchCodeField(stampName,stamp.getFunctionCall().length()+4);
		 codingToolbar.showBackButton(stampName);
			
		}
	 
	 /*called when template is selected*/
	 private void selectTemplate(){
		 this.patternButton.setActive();
		 this.designButton.setInactive();
		 this.patternToolbar.updateLabel("Template View");
		 if(!fromTemplate){
			 this.codeField.stopFilter(); //remove the current document filter on the codefield
		 
			
			fromMain = false; //set from main to false (prevents incorrect saving of files)
			codingToolbar.updateLabel(TemplateManager.getName()); //update label of coding window
			fromTemplate = true; //set from main to true (prevents incorrect saving of files)
			this.codeField.setText(TemplateManager.getTemplateCode()); //set code field text to stamp function
			//if (!(stamp instanceof DynamicStamp)){
			//this.codeField.startFilter(stamp.getFunctionCall().length()+4); //filter code field to prevent editing of function name
	 
			//}
		 }
		}
	 
	 /*resets code field to main program*/
	 private void selectMain(){
		 this.patternButton.setInactive();
		 this.designButton.setActive();
		 this.patternToolbar.updateLabel("Design View");
		stampManager.getList().clearSelection();
		codingToolbar.updateLabel(this.currentProject.getName()); //set label back to main project name
		codingFrame.switchCodeField("main",0);
		codingToolbar.hideBackButton();
	 }
	 
	 /*inserts stamp function call into program*/
	 private void insertStamp(Stamp stamp){
		//String stampName = stampManager.getSelectedNode();
		
		 selectMain();
		 codeField.insertStampStatement(stamp.getFunctionCall());
		//this.currentProject.setCode(this.codeField.getCode()); //update project code to include added statements
		
	 }
	 
	 /*updates the code of the current stamp with modifications made by user*/
	 private void updateStampCode(){
		for(int i=0;i<stampManager.getList().getModel().getSize();i++){
			String stampName = stampManager.getList().getModel().getElementAt(i).toString();
			Stamp pStamp =  stampMap.get(stampName);
			pStamp.setFunctionDef(codingFrame.getStampCode(stampName));
		}
		
	 }
	
	 /*adds in an irregular polygon statement to the code field*/
	 private void addPolyStatement(Drawable p){
		 shapeDialog = new IrregularShapeDialog(this,true,stampMap);
		 if(shapeDialog.getAnswer()){
			 this.createStaticStamp(shapeDialog.getName(),p);
			 
		 	
		 }
	 
	 else{
		 IrregularShapeDialog.infoBox("No object is selected.", "", "Error creating stamp");
	 }
		 	
			//String polyStatement = Stamp.addPolyStatement(p, false);
			//codeField.insertGesturalStatement(polyStatement);
			//this.currentProject.setCode(this.codeField.getCode());
	 }
	 
	 /*sets code parse in motion*/
	 private void run(){
		 	//UI changes
		 	runButton.setActive(); //toggles run button to active visual state
			this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR)); //sets cursor to wait
			console.clearText();
			curveTool.reset();
			codeField.removeHighlights();
			codeField.checkForComments();
			uiManager.clearAllUserUIs();
			
			if(fromTemplate){
				TemplateManager.clearAllTemplates();
				patternDropdown.removeAllItems();
				TemplateManager.setTemplateCode(codeField.getCode());
				TemplateManager.run(instructionManager,currentProject.getUnits());
			}
			else{
			//removes existing drawables
			//TODO: EVENTUALLY PARSE ONLY MODIFIED CODE
			drawableManager.clearAllDrawables();
			
			String code = codingFrame.collectCode();
			
			//runs code from current project
			instructionManager.parseText(code,currentProject.getUnits());
			}
			
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
				selectMain();
				codingFrame.clearStamps();
				stampManager.clearItems();
				stampMap.clear();
				stampMap = stmps;
				for (String key : stampMap.keySet())
				{
					stampManager.addItem(key);
					codingFrame.addCodeField(key, stampMap.get(key).getFunctionDef(), this.fontSize);

				}
			}
			codeField.setUnsaved(false);
			updateLabels();
			run();
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
			 stampManager.clearItems();
			currentProject.newFile(codingFrame, codeField,canvas, drawableManager , instructionManager);
			updateLabels();
			}
		 }
		 else{
			 selectMain();
			codeField.setUnsaved(false);
			 stampMap.clear();
			 stampManager.clearItems();
			currentProject.newFile(codingFrame, codeField,canvas, drawableManager , instructionManager);
			updateLabels();
		 }
		
	 }
	 
	 //saves the file
	 private void saveFile(){
		 updateStampCode();
		 
		 currentProject.saveFile(this,codeField.getCode(),this.stampMap,codingFrame,TemplateManager.getTemplateCode());
		 codeField.setUnsaved(false);
		 updateLabels();
	
	 }
	 
	 //updates any identifying labels of the files
	 private void updateLabels(){
		if(fromMain){
		 this.codingToolbar.updateLabel(currentProject.getName());
		}
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
				double dw;
				double dh;
				int u;
				if(fromTemplate){
					dw = currentProject.getTemplateUnitWidth();
					dh = currentProject.getTemplateUnitHeight();
					u = currentProject.getTemplateUnits();
				}
				else{
					dw = currentProject.getUnitWidth();
					dh = currentProject.getUnitHeight();
					u = currentProject.getUnits();
				}
				 dimensionDialog = new DimensionDialog(this, true,dw,dh,u);
		     
		         if(dimensionDialog.getAnswer()) {
		        	 double widthVal = dimensionDialog.getCanvasWidth();
		        	 double heightVal = dimensionDialog.getCanvasHeight();
		        	 int unitsVal=dimensionDialog.getUnits();
		        	 if(fromTemplate){
		        		 currentProject.setTemplateDimensions(widthVal,heightVal, unitsVal);
		        	 }
		        	 else{
		        		 currentProject.setDimensions(widthVal,heightVal, unitsVal, canvas, instructionManager);
		        	 }
		    	
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
				case CustomEvent.TEMPLATE_CREATED:
					System.out.println("template created");
					if(patternDropdown.getItemCount()==0){
						patternDropdown.addItem("all templates");
					}
					patternDropdown.addItem(TemplateManager.templates.get(TemplateManager.templates.size()-1).getName());
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
					currentTool.mousePressed(canvas.relativeMouseX(), canvas.relativeMouseY(),shiftKey);
				break;
			
				case CustomEvent.CANVAS_MOUSE_RELEASED:
					currentTool.mouseReleased(canvas.relativeMouseX(), canvas.relativeMouseY(),shiftKey);
					
					break;
				case CustomEvent.CANVAS_MOUSE_DRAGGED:
					currentTool.mouseDragged(canvas.relativeMouseX(), canvas.relativeMouseY(),shiftKey);
				break;
				case CustomEvent.TARGET_SELECTED:
					selectMain();
					Point p = targetTool.getTarget();
					this.codeField.insertCoordinate(p.getX(), p.getY());

				break;
				
					
				case CustomEvent.DRAWABLE_MOVED:
					selectMain();
					ArrayList<Drawable> dlist = selectTool.getSelected();
					System.out.println("moved list size="+dlist.size());
					for(int i=0;i<dlist.size();i++){
						Drawable d = dlist.get(i);
						if(this.codeField.insertMoveStatement(d)){
							//run();
						}
						
					}

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
					String rectStatement = Stamp.addRectStatement((Rectangle)rectTool.getCreated(), false);
					codeField.insertGesturalStatement(rectStatement);
					run();	
					
					break;
				case CustomEvent.ELLIPSE_ADDED:
					selectMain();
					String ellipseStatement = Stamp.addEllipseStatement((Ellipse)ellipseTool.getCreated(), false);
					codeField.insertGesturalStatement(ellipseStatement);
					run();	
				case CustomEvent.BOOL_PERFORMED:
					selectMain();
					int type = boolTool.boolType;
					String boolStatement = Stamp.addBoolStatement(selectTool.getSelected(), type, false);
					codeField.insertGesturalStatement(boolStatement);
					//codeField.insertShapeStatement(currentTool.getCreated(),"rect");
					run();	
					run();
					break;	
				case CustomEvent.POLY_ADDED:
					selectMain();
					String polyStatement = Stamp.addRPolyStatement((Polygon)polyTool.getCreated(), polyTool.getRotation(),false);
					codeField.insertGesturalStatement(polyStatement);
					run();	
					
				case CustomEvent.IRREGULAR_POLY_ADDED:
					selectMain();
					addPolyStatement(((PenTool)currentTool).closePoly());
					run();	
					break;
				
				case CustomEvent.LINE_ADDED:
					selectMain();
					String lineStatement = Stamp.addLineStatement((Line)lineTool.getCreated(), false);
					codeField.insertGesturalStatement(lineStatement);
					run();		
					break;
				case CustomEvent.CURVE_ADDED:
					selectMain();
					if(curveTool.curves.size()==1){
						String curveStatement = Stamp.addCurveStatement((Curve)curveTool.getCreatedCurves(), false);
						codeField.insertGesturalStatement(curveStatement);
					}
					else{
						addPolyStatement(curveTool.getCreatedCurves());
					}
					curveTool.reset();
					
					//run();	
				case CustomEvent.REDRAW_REQUEST:
					 canvas.setDrawables(drawableManager.getDrawables());

					canvas.redraw();
					break;
				case CustomEvent.RUN_REQUEST:
					run();
					
					
					break;
				case CustomEvent.DESELECT_ALL:
					
					drawableManager.deselectAll();
					canvas.redraw();
					break;
				
				case CustomEvent.MAIN_SELECTED:
					selectMain();
					break;
				case CustomEvent.STAMP_INSERTED:
					String stampName = this.stampManager.getList().getSelectedValue().toString();
					Stamp s = stampMap.get(stampName);
					insertStamp(s);
					run();
					break;
				case CustomEvent.TEMPLATE_SELECTED:
					canvas.redraw();
					patternDropdown.setSelectedIndex(TemplateManager.getSelected()+1);
						
					System.out.println("set selected");
					
				
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
		//toggle for ctrl key
		if(e.getKeyCode()==16){
			shiftKey=true;
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
		if(e.getKeyCode()==16){
			shiftKey=false;
		}
		if(e.getKeyCode() ==32){
			if(panButton.isActive()){
				canvas.clearMode();
				panButton.setInactive();
				currentTool=defaultTool;
				canvas.changeCursor(null);
			}
		}
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			if(curveButton.isActive()){
				curveTool.finishCurve();
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
		else if (e.getSource()==unionButton){
			currentTool = boolTool;
			boolTool.doBool(selectTool.getSelected(),boolTool.UNION);
		}
		else if (e.getSource()==diffButton){
			currentTool = boolTool;
			boolTool.doBool(selectTool.getSelected(),boolTool.DIFF);
		}
		else if (e.getSource()==xorButton){
			currentTool = boolTool;
			boolTool.doBool(selectTool.getSelected(),boolTool.XOR);
		}
		else if (e.getSource()==clipButton){
			currentTool = boolTool;
			boolTool.doBool(selectTool.getSelected(),boolTool.CLIP);
		}
		else if (e.getSource()==curveButton){
			currentTool = curveTool;
			curveButton.setActive();
			canvas.changeCursor(curveTool.getImage());
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
			 sliderFrame.setVisible(false);

			openFile(null);
		}
		
		else if (e.getSource() == saveButton || e.getSource() == saveAction ) {
			 sliderFrame.setVisible(false);

			saveFile();
	       

		}
		
		else if (e.getSource() == saveAsAction ) {
			 sliderFrame.setVisible(false);

			currentProject.setSaved(false);
			saveFile();

		}
		
		else if (e.getSource() == backButton ) {
			selectMain();

		}
		
		
		else if (e.getSource()==newButton ||e.getSource() == newAction){
			 sliderFrame.setVisible(false);

			newFile();
		}
		
		else if (e.getSource() == printButton|| e.getSource() == exportAction) {
			 sliderFrame.setVisible(false);

			currentProject.printFile(this,canvas);

		}
		else if (e.getSource()==dimensionButton){
			 sliderFrame.setVisible(false);

			setDimensions();
			
		}
		
		else if (e.getSource() == importButton || e.getSource() == importAction ) {
			 sliderFrame.setVisible(false);

			currentProject.importFile(this,codeField);
		}
		
		else if (e.getSource() == exitAction) {
			 sliderFrame.dispose();
			System.exit(DISPOSE_ON_CLOSE);

		}
		else if (e.getSource() == stampAction){
			 stampDialog = new StampDialog(this,true,stampMap);
			 if(stampDialog.getAnswer()){
				 createStaticStamp(stampDialog.getName(),selectTool.getSelected().get(0));
				
			 }
		 
		 else{
			 StampDialog.infoBox("No object is selected.", "", "Error creating stamp");
		 }
			
			run();
			
		}
		else if (e.getSource() == dStampAction){
			createDynamicStamp();
			run();
			
		}
		else if (e.getSource() instanceof ExampleItem){
			ExampleItem eI = (ExampleItem)e.getSource();
			System.out.println(eI.getName());
			openExample(eI.getName());
			
		}
		
		else if(e.getSource() == loadPatternAction){
			
			TemplateManager.openPattern(this);
			if(TemplateManager.patternLoaded){
				ArrayList<String> patternNames =  TemplateManager.getTemplateNames();
				for(int i=0;i<patternNames.size();i++){
					patternDropdown.addItem(patternNames.get(i));
				}
				simButton.setEnabled(true);
				patternButton.setEnabled(true);
			}
		}
		else if(e.getSource()==patternButton){
			canvas.createImage();
			canvas.patternMode();
			patternDropdown.setEnabled(true);
			this.selectTemplate();
			canvas.redraw();

		}
		else if(e.getSource()==designButton){
			canvas.designMode();
			patternDropdown.setEnabled(false);
			this.selectMain();
			canvas.redraw();

		}
		else if(e.getSource()==patternDropdown){
			 String name = (String)patternDropdown.getSelectedItem();
			 TemplateManager.setSelected(name);
			 
		}
		else if(e.getSource()==sliderButton){
			sliderFrame.setLocation(this.getX()+this.getWidth()-sliderFrame.getWidth()-60,100);
			sliderFrame.setVisible(true);
			

		}
			
		
		//canvas.redraw();

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


	@Override
	public void handleCustomUINodeEvent(Object nodeEvent, int event, UserUI d) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void handleCustomUIEvent(Object source, int event) {
	
		
	}


	@Override
	public void valueChanged(ListSelectionEvent e) {
		JList list = (JList)e.getSource();
		if(!list.isSelectionEmpty()){
			if(e.getSource() == stampManager.getList()){
			
				selectStamp(this.stampManager.getList().getSelectedValue().toString());
		
			}
		}
	
	}

}