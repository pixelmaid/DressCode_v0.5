package com.pixelmaid.dresscode.app;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.pixelmaid.dresscode.app.ui.tools.PenTool;
import com.pixelmaid.dresscode.app.ui.tools.TargetTool;
import com.pixelmaid.dresscode.app.ui.tools.Tool;
import com.pixelmaid.dresscode.app.ui.usercreated.UserUI;
import com.pixelmaid.dresscode.data.templates.TemplateManager;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.UnitManager;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.CustomEventListener;
import com.pixelmaid.dresscode.events.EventInterface;

import processing.core.*;
import processing.dxf.RawDXF;
import processing.opengl.PGraphicsOpenGL;
import javax.swing.JFrame;

import processing.pdf.PGraphicsPDF;


public class Canvas extends PApplet implements EventInterface{
	/**
	 * 
	 */
	protected List<CustomEventListener> _listeners = new ArrayList<CustomEventListener>();
	private static final long serialVersionUID = 1L;
	public int DEFAULT_BG = 242;
	public Color backgroundColor;
	private double gridUnits = 10;
	private double gridIncrement = 10;
	private double counterIncrement = 100;
	private int unitType = 0;
	private float zoomAmount = 1f;
	private int translateYAmount = 0;
	private int translateXAmount = 0;
	protected int defaultCanvasWidth = 500;
	protected int defaultCanvasHeight = 500;
	private double drawingBoardWidth = 500;
	private double drawingBoardHeight = 500;
	private boolean patternMode = false;
	
	private boolean showOrigin = false; // determines whether or not to show origin;
	private Drawable selectedObject = null;
	private double selectDist = 5;
	private boolean objectMoved = false;
	
	private int gridHeight = 7000;
	private int gridWidth = 7000;
	private int gridX = -gridWidth/2;
	private int gridY = -gridHeight/2;
	private int gridNum = 0; //toggles state of grid
	
	private double zeroX= 0;
	private double zeroY=0;
	
	private ArrayList<Drawable> tempDrawables;
	//private ArrayList<UserUI> userUI;

	private boolean drawGrid = true;

	private int currentMode = -1;
	private static final int NO_MODE = -1;
	private static final int TARGET_MODE = 0;
	private static final int PAN_MODE = 1;
	private static final int SELECT_MODE = 2;
	private static final int PEN_MODE = 3;
	private static final int RECT_MODE = 4;
	private static final int ELLIPSE_MODE = 5;
	private static final int POLY_MODE = 6;
	private static final int LINE_MODE = 7;
	private static final int CURVE_MODE = 8;
	private static final int ZOOM_MODE = 9;
	
	public Console console;
	public JFrame parent;

	private int id=0;

	PGraphicsOpenGL pG;
	
	RawDXF dxf;
	PGraphicsPDF pdf;
	PGraphics designImage;

	public void setId(int i){
		
		id=i;
	}

	public void setDimensions(int width, int height){
		defaultCanvasWidth = width;
		defaultCanvasHeight = height;	
		/*gridHeight = width;
		gridWidth = height;
		gridX = 0;
		gridY = 0;*/
		
	}
	
	public void setDrawingBoardDimensions(double width, double height,int units){
		
		drawingBoardWidth = width;
		drawingBoardHeight =height;
		zeroX = defaultCanvasWidth/2-drawingBoardWidth/2-13; //magic numbers here... not sure why these values are needed
		zeroY= defaultCanvasHeight/2-drawingBoardHeight/2;
		//System.out.println("drawing board="+drawingBoardWidth+","+drawingBoardHeight);
		unitType = units;
		if(gridNum!=1){
		if(unitType==UnitManager.STANDARD){
			setGridtoIn();
		}
		if(unitType==UnitManager.METRIC){
			setGridtoMm();
		}
		}

	}
	
	public void setGridtoPix(){
		gridUnits=10;
		gridIncrement = 10;
		counterIncrement = 100;
		System.out.println("grid units="+gridUnits);
	}
	
	public void setGridtoIn(){
		gridUnits=UnitManager.PIX_IN_INCH/8;
		gridIncrement = 7;
		counterIncrement = 1;
		System.out.println("grid units="+gridUnits);
	}
	
	public void setGridtoMm(){
		
		gridUnits=UnitManager.PIX_IN_MM;
		counterIncrement =10;
		gridIncrement=9;
	}
	
	public float getZeroX(){
		return (float)this.zeroX;
	}
	
	public float getZeroY(){
		return (float)this.zeroY;
	}



	public double getCanvasWidth(){
		return defaultCanvasWidth;
	}
	public double getCanvasHeight(){
		return defaultCanvasHeight;
	}

	public void setGrid(){
		gridNum=gridNum+1;
		if(gridNum>2){
			gridNum=0;
		}
		if(gridNum==0){
			drawGrid = true;
			if(unitType==UnitManager.STANDARD){
				setGridtoIn();
			}
			if(unitType==UnitManager.METRIC){
				setGridtoMm();
			}
		}
		else if(gridNum==1){
			drawGrid = true;
			
			setGridtoPix();
			
		}
		else{
			drawGrid = false;
			if(unitType==UnitManager.STANDARD){
				setGridtoIn();
			}
			if(unitType==UnitManager.METRIC){
				setGridtoMm();
			}
		}
	}

	public boolean getGrid(){
		return drawGrid;
	}



	public void setup() {
		System.out.println("setting up canvas");
		tempDrawables = new	 ArrayList<Drawable>();
		//userUI = new ArrayList<UserUI>();
		//tempDrawables.add(new Ellipse(100,100));
		PFont f; 
		f = createFont("Monospaced", 11);
		  textFont(f);

		size(defaultCanvasWidth,defaultCanvasHeight);
		noLoop();
		//
		//pG =(PGraphicsOpenGL)this.g;
		//pProjectionView = pG.projection;

		//modelview= pG.modelview;
		/*dxf = (RawDXF) createGraphics(width, height, DXF, "outputDC.dxf");
		 
		 beginRaw(dxf);
		 dxf.ellipse(0,0,100,100);

		 endRaw();
		 noLoop();*/
		System.out.println("setup_called");
		parent.setSize(parent.getPreferredSize());
		

	}
	
	
	
	
	public void setDrawables(ArrayList<Drawable> d){
		this.tempDrawables=d;
		//System.out.println("drawables set:"+id);
	}

	
	/*public void setUserUI(ArrayList<UserUI> d){
		this.userUI=d;
		
	}*/

	public void draw() {
		
			System.out.println("drawing");
			pushMatrix();
			background(backgroundColor.getRed(),backgroundColor.getGreen(),backgroundColor.getBlue());
			//translate(translateXAmount,translateYAmount,zoomAmount);
			translate(translateXAmount,translateYAmount);
			scale(zoomAmount);
			if(!patternMode){
				dimensions(false);
			}

			pushMatrix();
			
			//translate(zeroX,zeroY,0);
			translate((float)zeroX,(float)zeroY);
			if(!patternMode){
			for (int i=0;i<tempDrawables.size();i++){
				tempDrawables.get(i).draw(this);
				if(showOrigin){
					if(!tempDrawables.get(i).getHide()){
						tempDrawables.get(i).drawOrigin(this);
					}
					//	tempDrawables.get(i).drawBoundingBox(this);
				}
				
			}
			}
			else{
				
				
				translate((float)zeroX,(float)zeroY);
				
					TemplateManager.draw(this,designImage);	
				
			}
			
			popMatrix();
		
			if(drawGrid){
				grid();
			}
			if(!patternMode){
				dimensions(true);
			}


			popMatrix();	
			rulers();
			//drawUserUI();
		
		

			
	}
	
	/*private void drawUserUI(){
		System.out.println("num of uis ="+userUI.size());
		
		for(int i=0;i<userUI.size();i++){
			userUI.get(i).draw(this);
		}
	}*/

	public void createImage(){
		designImage = createGraphics(((Double)drawingBoardWidth).intValue(), ((Double)drawingBoardHeight).intValue());
		designImage.beginDraw();
		
		designImage.background(255);
		
		for (int i=0;i<tempDrawables.size();i++){

			tempDrawables.get(i).print(designImage);
		
		}
		
		designImage.endDraw();
	}
	
	public void print(File file){
		String pdfFilename = file.getAbsolutePath();
		String dxfFilename = file.getAbsolutePath();
		String subStr = pdfFilename.substring(pdfFilename.length()-4, pdfFilename.length());
		//System.out.println(subStr);
		if(!subStr.contentEquals(".pdf")){
			//System.out.println("substr!=pdf");
			pdfFilename =pdfFilename.concat(".pdf");
		}
		
		pdf = (PGraphicsPDF) createGraphics(((Double)drawingBoardWidth).intValue(), ((Double)drawingBoardHeight).intValue(), PDF, pdfFilename);
		pdf.beginDraw();
		
		
		
		for (int i=0;i<tempDrawables.size();i++){
			
			tempDrawables.get(i).print(pdf);
		
		}
		


		pdf.dispose();
		pdf.endDraw();
		/*
		dxf = (RawDXF) createGraphics(width, height, DXF, dxfFilename+".dxf");
		 
		 beginRaw(dxf);

			for (int i=0;i<tempDrawables.size();i++){

				tempDrawables.get(i).print(dxf);
			
			}

		 endRaw();
		 dxf.dispose();
		 dxf = null;*/
	}

	public void mousePressed() {
		//System.out.println(mousePressed);
		System.out.println("mouse pos="+mouseX+","+mouseY);
		this.fireMousePressedEvent(this, CustomEvent.CANVAS_MOUSE_PRESSED);
		/*for(int i=0;i<userUI.size();i++){
			userUI.get(i).checkForMousePress(mouseX, mouseY);
		}*/
		/*if(currentMode == SELECT_MODE){
			checkSelect();
		}
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image cursorImage = toolkit.getImage(ClassLoader.getSystemResource("com/pixelmaid/dresscode/resources/pen.png"));//toolkit.getImage("cursor.gif");
	    java.awt.Point cursorHotSpot = new java.awt.Point(0,0);
	    Cursor customCursor = toolkit.createCustomCursor(cursorImage, cursorHotSpot, "Cursor");
	    setCursor(customCursor);*/
	}


	public void mouseReleased() {
		this.fireMousePressedEvent(this, CustomEvent.CANVAS_MOUSE_RELEASED);
		/*for(int i=0;i<userUI.size();i++){
			userUI.get(i).checkForMouseRelease(mouseX, mouseY);
		}*/
		//currentTool.mouseReleased(relativeMouseX(),relativeMouseY());
		
		
		
	}

	public void mouseDragged(){
		this.fireMousePressedEvent(this, CustomEvent.CANVAS_MOUSE_DRAGGED);
		/*for(int i=0;i<userUI.size();i++){
			userUI.get(i).checkForMouseDrag(mouseX, mouseY);
		}*/
		redraw();
		//checkModeMove();
		//redraw();
		//currentTool.mouseDragged(mouseX,mouseY);


	}
	
	//===========================MODE AND TOOL FUNCTIONS===========================//
	
	public void patternMode(){
		patternMode= true;
	}
	
	public void designMode(){
		patternMode = false;
	}
	
	public void clearMode() {
		currentMode = NO_MODE;
		showOrigin=false;
		cursor(ARROW);
	}
	
	public void showOrigins() {
		
		showOrigin=true;
		
	}

		
	public void pan(){
		translateXAmount+= mouseX-pmouseX;
		translateYAmount+=  mouseY-pmouseY;
		
	}
	
	public void selectMove(){
		if(selectedObject!=null){
			selectedObject.moveTo(relativeMouseX(),relativeMouseY());
			objectMoved=true;
		}
	}
	
	//sets cursor according to mode
	public void changeCursor(Cursor cursorImage){
		if(cursorImage!=null){
			setCursor(cursorImage);
		}
		else{
			cursor(ARROW);
		}
	}

	/*public void checkModeMouse(){
		switch(currentMode){
		case TARGET_MODE:

			this.fireToolEvent(this,CustomEvent.TARGET_SELECTED);

			break;
			
		case SELECT_MODE:

			if(objectMoved==true){
			objectMoved = false;
			this.fireToolEvent(this,CustomEvent.DRAWABLE_MOVED);
			}
			selectedObject = null;
			break;
		default:

			break;
		}
	}
*/
	
/*
	public void checkModeMove(){
		switch(currentMode){

		case PAN_MODE:

			translateXAmount+= mouseX-pmouseX;
			translateYAmount+=  mouseY-pmouseY;


			
			break;
		
		
		case SELECT_MODE:
			if(selectedObject!=null){
				selectedObject.moveTo(relativeMouseX(),relativeMouseY());
				objectMoved=true;
			}
		}
	}*/
	
	public double relativeMouseX(){
		double x1 = (mouseX - translateXAmount) / zoomAmount;
		double x = x1-(width/2-(drawingBoardWidth)/2);
		return x;
	}
	
	public double relativeMouseY(){
		double y1 = (mouseY - translateYAmount)/ zoomAmount ;
		double y = y1-(height/2-(drawingBoardHeight)/2);
		return y;
	
	}

	public void rulers(){
		noStroke();
		fill(255,255,255);
		rect(0,0,gridWidth,40);
		rect(0,0,40,gridHeight);
		stroke(0,0,0);
		strokeWeight(1.5f);
		
		double heightGridPos=gridY;
		double widthGridPos=gridX;
		int countX=0;
		int countY=0;
		float shortener = 10;
		int counter=0;
		if(gridNum==1){
			counter = 0-gridHeight/2;

		}
		else{
			 counter =0-((Double)(UnitManager.toUnits(gridHeight, this.unitType)/2)).intValue();

		}
		while( heightGridPos<gridHeight){
			if(countX==gridIncrement){
				fill(0,0,0);
				text(counter,20,(float)((heightGridPos*zoomAmount)+translateYAmount));
				
				stroke(0,0,0);
				strokeWeight(1f);
				countX=0;
				

				shortener=5;
				counter+=counterIncrement;
				
			}
			else{
				
				stroke(0,0,0);
				strokeWeight(0.5f);
				countX++;
				shortener=10;
				
			}
			this.line(0,(float)((heightGridPos*zoomAmount)+translateYAmount),20-shortener,(float)((heightGridPos*zoomAmount)+translateYAmount));
			heightGridPos+=gridUnits;
		}
		
		if(gridNum==1){
			counter = 0-gridWidth/2;

		}
		else{
			 counter =0-((Double)(UnitManager.toUnits(gridWidth, this.unitType)/2)).intValue();
			 if(this.unitType==UnitManager.METRIC){
				 counter+=4;
			 }
		}
		while( widthGridPos<gridWidth){
			if(countY==gridIncrement){
				fill(0,0,0);
				text(counter,(float)((widthGridPos*zoomAmount)+translateXAmount),20);
				
				stroke(0,0,0);
				strokeWeight(1f);
				countY=0;
				

				shortener=5;
				counter+=counterIncrement;
				
			}
			else{
				
				stroke(0,0,0);
				strokeWeight(0.5f);
				countY++;
				shortener=10;
				
			}
			this.line((float)((widthGridPos*zoomAmount)+translateXAmount),0,(float)((widthGridPos*zoomAmount)+translateXAmount),20-shortener);
			widthGridPos+=gridUnits;
		}
	}

	public void grid(){


		double heightGridPos=gridY;
		double widthGridPos=gridX;
		int countX=0;
		int countY=0;
		while( heightGridPos<gridHeight){
			if(countX==gridIncrement){
				stroke(0,0,0,75f);
				strokeWeight(1.5f);
				countX=0;
			}
			else{
				stroke(0,0,0,50f);
				strokeWeight(1);
				countX++;
			}
			this.line(gridX,(float)heightGridPos,gridWidth,(float)heightGridPos);
			heightGridPos+=gridUnits;
		}
		while( widthGridPos<gridWidth){
			if(countY==gridIncrement){
				stroke(0,0,0,75f);
				strokeWeight(1f);
				countY=0;
			}
			else{
				stroke(0,0,0,50f);
				strokeWeight(1);
				countY++;
			}

			this.line((float)widthGridPos,gridY,(float)widthGridPos,gridHeight);
			widthGridPos+=gridUnits;
		}
	}
	
	public void dimensions(boolean frame){

				stroke(0);
				strokeWeight(0.5f);
				this.fill(DEFAULT_BG);
				rectMode(CENTER);
				if(frame){
					noFill();
				}
				else{
					noStroke();
				}
				rect(width/2,height/2,(float)drawingBoardWidth,(float)drawingBoardHeight);
				
	
	}


	public void zoomIn(){
		zoomAmount+=0.05;
		//selectDist-=5;
		if(zoomAmount>10){
			zoomAmount = 10;
		}
		//System.out.println(zoomAmount);
	}

	public void zoomOut(){
		zoomAmount-=0.05;
		if(zoomAmount<0){
			zoomAmount = 0;
		}
		//System.out.println(zoomAmount);
	}



	
	
	public Drawable checkSelect(){
		double x= relativeMouseX();
		double y = relativeMouseY();
	
		System.out.println("rel x,y="+x+","+y);
		for(int i=tempDrawables.size()-1;i>=0;i--){
			Point origin = tempDrawables.get(i).getOrigin();
			System.out.println("obj x,y="+origin.getX()+","+origin.getY());
			System.out.println("selectDist ="+selectDist);
			System.out.println("xy dist="+Math.abs(x-origin.getX())+","+Math.abs(y-origin.getY()));
			if((Math.abs(x-origin.getX())<selectDist)&&(Math.abs(y-origin.getY())<selectDist)){
				selectedObject = tempDrawables.get(i);
			
				System.out.println("selected object at"+i);
				return tempDrawables.get(i);
			
			}
		}
		return null;
		
	}
	
	

	public void panMode() {
		currentMode = PAN_MODE;

	}

	@Override
	public synchronized void addEventListener(CustomEventListener listener)  {
		_listeners.add(listener);
	}
	
	@Override
	public synchronized CustomEventListener getListenerAt(int index) {
		return (CustomEventListener) _listeners.get(index);

	}
	
	@Override
	public synchronized void removeEventListener(CustomEventListener listener)   {
		_listeners.remove(listener);
	}

	//  fires tool events to listeners
	private void fireToolEvent(Object source, int event) {
		Iterator<CustomEventListener> i = _listeners.iterator();
		while(i.hasNext())  {
			((CustomEventListener) i.next()).handleCustomToolEvent(source, event);
		}
	}
	
//  fires tool events to listeners
	private void fireMousePressedEvent(Object source, int event) {
		Iterator<CustomEventListener> i = _listeners.iterator();
		while(i.hasNext())  {
			((CustomEventListener) i.next()).handleCustomToolEvent(source, event);
		}
	}

	
	
	
}