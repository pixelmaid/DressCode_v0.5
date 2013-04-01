package com.pixelmaid.dresscode.app;

import java.awt.BorderLayout;
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

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.pixelmaid.dresscode.app.ui.Toolbar;
import com.pixelmaid.dresscode.data.DrawableManager;
import com.pixelmaid.dresscode.data.InstructionManager;
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

	private int defaultDrawingBoardWidth = 500;
	private int defaultDrawingBoardHeight = 500;
	private int defaultDrawingPaneWidth = 2000;
	private int defaultDrawingPaneHeight = 1000;
	private int defaultButtonWidth = 50;
	private int defaultButtonHeight = 50;
	
	
	private CodingFrame codingFrame;
	private  CodeField codeField;
	private  Console output;
	private Toolbar codingToolbar;
	
	public static JFileChooser	 fc;
	
	//coding panel buttons
	private ImageButton openButton, saveButton, runButton, stopButton, newButton, importButton;

	
	//drawing panel buttons
	private ImageButton selectButton, targetButton, printButton, zoomInButton, zoomOutButton, panButton, penButton, gridButton;
	
	
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
		eventSource = new EventSource();
		
	}

	public void init(int width, int height){
		fc = new JFileChooser();

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
		canvas.setDrawingBoardDimensions(defaultDrawingBoardWidth, defaultDrawingBoardHeight);
		drawableManager = new DrawableManager();
		instructionManager = new InstructionManager(drawableManager,defaultDrawingBoardWidth,defaultDrawingBoardHeight);
		
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
		
		
		
		
		drawingToolbar.addButton(selectButton);
		selectButton.addActionListener(this);
		
		drawingToolbar.addButton(panButton);
		panButton.addActionListener(this);
		
		drawingToolbar.addButton(zoomInButton);
		zoomInButton.addActionListener(this);
		
		drawingToolbar.addButton(zoomOutButton);
		zoomOutButton.addActionListener(this);

		drawingToolbar.addButton(penButton);
		penButton.addActionListener(this);
		
		drawingToolbar.addButton(targetButton);
		targetButton.addActionListener(this);
		
		drawingToolbar.addButton(gridButton);
		gridButton.addActionListener(this);
		
		drawingToolbar.addButton(printButton);
		printButton.addActionListener(this);

		drawingToolbar.init(defaultDrawingPaneWidth,defaultButtonHeight);

		
		drawingFrame = new DrawingFrame();
		drawingFrame.init(defaultDrawingPaneWidth,defaultDrawingPaneHeight,canvas,drawingToolbar);
		drawingFrame.addComponentListener(this);
		this.getContentPane().add(drawingFrame);
		
		//init code side
		codeField= new CodeField();
		codeField.init();
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
		
		codingToolbar.addButton(runButton);
		codingToolbar.addButton(stopButton);
		codingToolbar.addButton(newButton);
		codingToolbar.addButton(saveButton);
		codingToolbar.addButton(openButton);
		codingToolbar.addButton(importButton);

		codingToolbar.init(defaultDrawingPaneWidth,defaultButtonHeight);
	
		codingFrame = new CodingFrame();
		
		codingFrame.init(defaultDrawingPaneWidth,defaultDrawingPaneHeight, codeField, output, codingToolbar);

		
		this.getContentPane().add(codingFrame,BorderLayout.LINE_END);
		this.getContentPane().doLayout();

		this.pack();
		this.setVisible(true);
		this.addWindowListener(this);
		this.addComponentListener(this);

		this.setResizable(false);
	
		canvas.init();
	}
	
	


	 //Event response methods
	 
	 //called when parse is succesful, gets drawables from the drawable manager and passes them to canvas to be drawn
	 private void drawIntoCanvas(){
		 System.out.println(drawableManager.getDrawables());
		canvas.setDrawables(drawableManager.getDrawables());
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
			drawableManager.clearAllDrawables();
			instructionManager.parseText(codeField.getCode());

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
		else if (e.getSource() == zoomInButton ) {
			canvas.zoomIn();

		}
		else if (e.getSource() == zoomOutButton ) {
			canvas.zoomOut();

		}
		if (e.getSource() == openButton ) {

			int returnVal = fc.showOpenDialog(this);

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				String filetxt= readFile(file);
				codeField.loadFile(filetxt);
				//log.append("Opening: " + file.getName() + "." + newline);
			} 

			//Handle save button action.
		} else if (e.getSource() == saveButton ) {
			int returnVal = fc.showSaveDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				writeFile(codeField.getText(),file);
			} 
		}
		
		else if (e.getSource() == printButton ) {
			int returnVal = fc.showDialog(this, "Export");
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				canvas.print(file);
			}

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
	public void handleCustomTargetEvent(Object source, int eventType, double x,double y) {
		switch (eventType){
		case CustomEvent.TARGET_SELECTED:	
			this.codeField.insertCoordinate(x,y);
		break;
	}
		
	}
	
	public static String readFile(File file) {

		BufferedReader br = null;
		String fileString="";
		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(file));

			while ((sCurrentLine = br.readLine()) != null) {
				fileString+=sCurrentLine+"\n";
				//System.out.println(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return fileString;

	}


	public static void writeFile(String content, File file) {
		try {


			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

			System.out.println("wrote file");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
