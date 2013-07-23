package com.pixelmaid.dresscode.app;


import java.awt.Color;
import java.io.File;
import java.math.RoundingMode;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.UnitManager;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.CustomEventListener;

import processing.core.*;
import processing.dxf.RawDXF;
import processing.opengl.PGL;
import processing.opengl.PGraphicsOpenGL;
import javax.media.opengl.*;
import javax.media.opengl.glu.*;
import javax.swing.JFrame;

import processing.pdf.PGraphicsPDF;


public class Embedded extends PApplet {
	/**
	 * 
	 */
	protected List _listeners = new ArrayList<CustomEventListener>();
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
	private String tempFilename;
	private boolean print = false;
	private boolean drawGrid = true;

	private int currentMode = -1;
	private float relMouseX,relMouseY;
	private static final int NO_MODE = -1;
	private static final int TARGET_MODE = 0;
	private static final int PAN_MODE = 1;
	private static final int SELECT_MODE = 2;
	
	public JFrame parent;
	
	float mvmatrix1[] = new float[16];
	float mvmatrix2[] = new float[16];
	float mvmatrix3[] = new float[16];

	float projmatrix1[] = new float[16];
	int id=0;

	PMatrix3D pProjectionView;	
	PMatrix3D modelview;
	PGraphicsOpenGL pG;
	
	RawDXF dxf;
	PGraphicsPDF pdf;

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
		zeroX = defaultCanvasWidth/2-drawingBoardWidth/2;
		zeroY= defaultCanvasHeight/2-drawingBoardHeight/2;
		System.out.println("drawing board="+drawingBoardWidth+","+drawingBoardHeight);
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
		System.out.println("drawables set:"+id);
	}


	public void draw() {
		
			pushMatrix();
			background(backgroundColor.getRed(),backgroundColor.getGreen(),backgroundColor.getBlue());
			//translate(translateXAmount,translateYAmount,zoomAmount);
			translate(translateXAmount,translateYAmount);
			scale(zoomAmount);
			
			pushMatrix();
			
			//translate(zeroX,zeroY,0);
			translate((float)zeroX,(float)zeroY);
			for (int i=0;i<tempDrawables.size();i++){

				tempDrawables.get(i).draw(this);
				if(showOrigin){
					tempDrawables.get(i).drawOrigin(this);
					//	tempDrawables.get(i).drawBoundingBox(this);
				}
				
			}
			
			popMatrix();
			/*PGraphicsOpenGL pG = (PGraphicsOpenGL)this.g;
			modelview.get(mvmatrix1);
			float x = modelX(0, 0, 0);
			float y = modelY(0, 0, 0);
			float z = modelZ(0, 0, 0);
			pProjectionView.get(projmatrix1); */ 
			/*PVector mousePos = new PVector(mouseX,mouseY);
			PVector screenPos = screenToMatrixCoordinate(mousePos, getMatrix().get());
			float xP = screenPos.x;
			float yP = screenPos.y;*/

			//System.out.println(xP+","+yP);
			dimensions();
			if(drawGrid){
				grid();
			}
			

			/*System.out.println(x+","+y+","+z);
	float screenx = screenX(x,y,z);
	float screeny = screenY(x,y,z);

	System.out.println(screenx+","+screeny);

	System.out.println(mouseX+","+mouseY);
	System.out.println("============\n\n");*/

			popMatrix();	
			//relMouseX = screenX(100, 100, zoomAmount);
			//relMouseY = screenY(100, 100, zoomAmount);
			//System.out.println(relMouseX+","+relMouseY);

			//modelview.get(mvmatrix2);
			rulers();
			

			checkMode();
			
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
		
		if(currentMode == SELECT_MODE){
			checkSelect();
		}
	}


	public void mouseReleased() {
		checkModeMouse();
		
		
		
	}

	public void mouseDragged(){
		checkModeMove();
		redraw();


	}

	public void checkMode(){
		switch(currentMode){
		case TARGET_MODE:
			cursor(CROSS);
			break;

		case PAN_MODE:
			cursor(HAND);
			break;
			
		case SELECT_MODE:
			cursor(MOVE);
		default:
			cursor(ARROW);
			break;
		}
	}

	public void checkModeMouse(){
		switch(currentMode){
		case TARGET_MODE:

			//float[] f = GetOGLPos();
			//System.out.println(f);
			
			
			this.fireTargetEvent(this,CustomEvent.TARGET_SELECTED,relativeMouseX(),relativeMouseY());

			break;
			
		case SELECT_MODE:

			//float[] f = GetOGLPos();
			//System.out.println(f);
			if(objectMoved==true){
			objectMoved = false;
			this.fireMoveEvent(this,CustomEvent.DRAWABLE_MOVED,selectedObject);
			}
			selectedObject = null;
			break;
		default:

			break;
		}
	}

	

	public void checkModeMove(){
		switch(currentMode){

		case PAN_MODE:

			translateXAmount+= mouseX-pmouseX;
			translateYAmount+=  mouseY-pmouseY;


			/*if(zoom){
				posZ+=parent.mouseY-lastMouseY;
			}
			lastMouseX= parent.mouseX;
			lastMouseY = parent.mouseY;*/
			break;
		
		
		case SELECT_MODE:
			if(selectedObject!=null){
				selectedObject.moveTo(relativeMouseX(),relativeMouseY());
				objectMoved=true;
			}
		}
	}
	
	private double relativeMouseX(){
		double x1 = (mouseX - translateXAmount) / zoomAmount;
		double x = x1-(width/2-(drawingBoardWidth)/2);
		return x;
	}
	
	private double relativeMouseY(){
		double y1 = (mouseY - translateYAmount)/ zoomAmount ;
		double y = y1-(height/2-(drawingBoardHeight)/2);
		return y;
	
	}
	
	
	


	PVector screenToMatrixCoordinate(PVector screenPos, PMatrix mat){
		// processing.js WARNING: the following code relies on 
		// patching processing.js core to add the getMatrix function.
		// Note that if we could read out
		// matrixInv we might be even faster!
		//PGraphicsOpenGL pG = (PGraphicsOpenGL)this.g;
		PMatrix pm =mat.get();
		/* if (this.getRerenderMode == P2D) {
		    PVector adjustedScreenPos = screenPos.get();
		    adjustedScreenPos.sub(width/2, height/2, 0);
		    PVector modelPos = new PVector();
		    pm.invert();
		    pm.mult(adjustedScreenPos,modelPos);
		    return modelPos;
		} else {*/
		PVector modelPos = new PVector();
		pm.invert();
		pm.mult(screenPos,modelPos);
		return modelPos;    
		// }
	}

	@Override
	public float screenX(float x, float y, float z) {

		PMatrix3D modelview = pG.modelview;

		float ax =
				modelview.m00*x + modelview.m01*y + modelview.m02*z + modelview.m03;
		float ay =
				modelview.m10*x + modelview.m11*y + modelview.m12*z + modelview.m13;
		float az =
				modelview.m20*x + modelview.m21*y + modelview.m22*z + modelview.m23;
		float aw =
				modelview.m30*x + modelview.m31*y + modelview.m32*z + modelview.m33;



		PMatrix3D projection = pG.projection;
		float ox =
				projection.m00*ax + projection.m01*ay + projection.m02*az + projection.m03*aw;
		float ow =
				projection.m30*ax + projection.m31*ay + projection.m32*az + projection.m33*aw;

		if (nonZero(ow)) {
			ox /= ow;
		}
		float sx = width * (1 + ox) / 2.0f;
		return sx;
	}

	public float projX(float x, float y, float z) {
		PGraphicsOpenGL pG = (PGraphicsOpenGL)this.g;

		PMatrix3D modelview = pG.modelview;

		float ax =
				modelview.m00*x + modelview.m01*y + modelview.m02*z + modelview.m03;
		float ay =
				modelview.m10*x + modelview.m11*y + modelview.m12*z + modelview.m13;
		float az =
				modelview.m20*x + modelview.m21*y + modelview.m22*z + modelview.m23;
		float aw =
				modelview.m30*x + modelview.m31*y + modelview.m32*z + modelview.m33;



		PMatrix3D projection = pG.projection;
		float ox =
				projection.m00*ax + projection.m01*ay + projection.m02*az + projection.m03*aw;
		float ow =
				projection.m30*ax + projection.m31*ay + projection.m32*az + projection.m33*aw;

		if (nonZero(ow)) {
			ox /= ow;
		}
		float sx = width * (1 + ox) / 2.0f;
		return sx;
	}



	protected static boolean nonZero(float a) {
		return Float.MIN_VALUE <= Math.abs(a);
	}


	float[] GetOGLPos()
	{
		int x = mouseX, y = mouseY;

		int viewport[] = new int[4];
		float mvmatrix[] = new float[16];
		//float projmatrix[] = new float[16];
		int realy = 0;// GL y coord pos
		float wcoord[] = new float[4];// wx, wy, wz;// returned xyz coords

		viewport[0]=0;
		viewport[1]=0;
		viewport[2]=width;
		viewport[3]=height;


		modelview.get(mvmatrix);


		println(projmatrix1);
		println(mvmatrix1);
		println(mvmatrix2);
		println(mvmatrix);
		System.out.println(viewport);


		GLU glu = new GLU();
		realy = viewport[3] - (int) y - 1;

		System.out.println("Coordinates at cursor are (" + x + ", " + y);
		glu.gluUnProject((float) x, (float) realy, 0.0f,mvmatrix1, 0,projmatrix1, 0, viewport, 0, wcoord, 0);
		System.out.println("World coords at z=0.0 are ( " + wcoord[0] + ", " + wcoord[1] + ", " + wcoord[2]+ ")");



		// glu.gluUnProject( winX, winY, winZ, modelview,0, projection,0, viewport,0,pos,0);

		return wcoord;
	}


	public Point get2dPoint(float tX, float tY,PMatrix3D projectionMatrix,PMatrix3D viewMatrix){
		PGraphicsOpenGL pG = (PGraphicsOpenGL)this.g;
		PMatrix3D projection = pG.projection;
		PMatrix3D view = pG.camera;
		PMatrix3D modelView = pG.modelview;
		float[] viewport = new float[4];
		viewport[0]=0;
		viewport[1]=0;
		viewport[2]=this.width;
		viewport[3]=this.height;
		float winX = (float)mouseX;                  // Holds The Mouse X Coordinate
		float winY = (float)mouseX; 
		winY = (float)viewport[3] - winY;

		/*
		 System.out.println("mouse coord ="+mouseX+","+mouseY);
	     System.out.println("dimensions ="+width+","+height);

		 System.out.print("projection matrix=");
		 projectionMatrix.print();
		 System.out.print("view matrix=");
		 viewMatrix.print();

		 System.out.print("projection matrix2=");
		 projection2.print();
		 System.out.print("view matrix2=");
		 view2.print();
		 /*  
		 float x = 2.0f * tX / width - 1;
	        float y = - 2.0f * tY / height + 1;

	        System.out.print("cal x,y="+x+","+y);
	       projectionMatrix.apply(viewMatrix);
	       System.out.print("projection matrix mult=");
			 projectionMatrix.print();
	       System.out.println(projectionMatrix.invert());
	       System.out.print("projection matrix inverse=");
			 projectionMatrix.print();
	        PVector v = projectionMatrix.mult(new PVector(x,y,0),null);*/
		return new Point(0,0);
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
		
		/*while( widthGridPos<gridWidth){
			if(countY==gridIncrement){
				stroke(0,0,0,75f);
				strokeWeight(1.5f);
				countY=0;
			}
			else{
				stroke(0,0,0,50f);
				strokeWeight(1);
				countY++;
			}

			this.line(widthGridPos,gridY,widthGridPos,gridHeight);
			widthGridPos+=gridUnits;
		}*/
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
	
	public void dimensions(){

				stroke(0);
				this.fill(DEFAULT_BG);
				rectMode(CENTER);
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
		selectDist= selectDist*5;
		if(zoomAmount<0){
			zoomAmount = 0;
		}
		//System.out.println(zoomAmount);
	}


	public void clearMode() {
		currentMode = NO_MODE;
		showOrigin=false;

	}


	public void targetMode() {
		currentMode = TARGET_MODE;

	}

	public void selectMode() {
		currentMode = SELECT_MODE;
		this.showOrigin=true;
		
		
	}
	
	
	public void checkSelect(){
		//System.out.println("checkSelect");
		System.out.println("num of drawables="+tempDrawables.size());
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
				
				break;
			}
		}
	}
	
	

	public void panMode() {
		currentMode = PAN_MODE;

	}


	public synchronized void addEventListener(CustomEventListener listener)  {
		_listeners.add(listener);
	}

	public synchronized CustomEventListener getListenerAt(int index) {
		return (CustomEventListener) _listeners.get(index);

	}

	public synchronized void removeEventListener(CustomEventListener listener)   {
		_listeners.remove(listener);
	}

	// call this method whenever you want to notify
	//the event listeners of the particular event
	public synchronized void fireEvent( Object source, int eventType) {

		Iterator i = _listeners.iterator();
		while(i.hasNext())  {
			((CustomEventListener) i.next()).handleCustomEvent(source, eventType);
		}
	}

	public void fireTargetEvent(Object source, int event, double x, double y) {
		Iterator i = _listeners.iterator();
		while(i.hasNext())  {

			((CustomEventListener) i.next()).handleCustomTargetEvent(source, event, x, y);
		}

	}
	
	
	private void fireMoveEvent(Object source, int event,Drawable selectedObject) {
		Iterator i = _listeners.iterator();
		while(i.hasNext())  {

			((CustomEventListener) i.next()).handleCustomMoveEvent(source, event,selectedObject);
		}
	}

	
	
	
}