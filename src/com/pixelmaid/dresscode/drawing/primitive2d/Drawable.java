package com.pixelmaid.dresscode.drawing.primitive2d;

import java.util.ArrayList;

import com.pixelmaid.dresscode.app.Embedded;
import com.pixelmaid.dresscode.app.Manager;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;

public class Drawable implements DrawableInterface {

	private ArrayList<Drawable> children; //stores all children of a drawable
	/*private ArrayList<Curve> curves; //stores all lines of a drawable
	private ArrayList<Point> points; //stores all points of a drawable
	private ArrayList<Polygon> polygons; //stores all polygons of a drawable
	private ArrayList<Ellipse> ellipses;//stores all ellipses of a drawable*/
	private double width;
	private double height;
	private double rotation;
	private boolean hide= false;
	public String key;
	protected Point origin;
	private Drawable parent;
	private Color fillColor;
	private Color strokeColor;
	private double strokeWeight;
	private boolean doFill = true;
	private boolean doStroke=true;
	
	
	protected final static int DEFAULT_WIDTH= 50;


	public Drawable(ArrayList<Double> params){
		this();
	}

	public Drawable(){
		this(0,0);
	}
	
	public Drawable(double x, double y){
		children = new ArrayList<Drawable>();
		origin= new Point(0,0);
		this.fillColor= new Color();
		this.strokeColor= new Color();
		setFillColor(255,255,255);
		setStrokeColor(0,0,0);
	}

	@Override
	public void draw(Embedded embedded) {
		embedded.pushMatrix();
		embedded.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		embedded.rotate((float)getRotation());
		
				for(int j =0;j<this.children.size();j++){
					int rf=this.children.get(j).getFillColor().r();
					int gf=this.children.get(j).getFillColor().g();
					int bf=this.children.get(j).getFillColor().b();
					int rS=this.children.get(j).getStrokeColor().r();
					int gS=this.children.get(j).getStrokeColor().g();
					int bS=this.children.get(j).getStrokeColor().b();
					
					
					if(this.children.get(j).doStroke()){
						embedded.stroke(rS,gS,bS);
						embedded.strokeWeight((float)this.children.get(j).getStrokeWeight());
					}
					else{
						embedded.noStroke();
					}
					if(this.children.get(j).doFill()){
						embedded.fill(rf,gf,bf);
					}
					else{
						embedded.noFill();
					}
					if(this.children.get(j).getHide()==false){
						
						this.children.get(j).draw(embedded);
					}
					
						System.out.println("hide ="+this.children.get(j).getHide());
					
				}
				
		embedded.popMatrix();	
	}

	@Override
	public void print(Embedded embedded) {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		this.hide=true;

	}
	
	public boolean getHide() {
		return this.hide;

	}

	@Override
	public void show() {
		this.hide=false;

	}

	@Override
	public void removeFromCanvas(){
		Manager.canvas.removeDrawable(this);
	}

	@Override
	public void moveTo(double x, double y) {
		
	
		if(isDrawable(this)){
			System.out.println("x,y="+x+","+y);
			this.origin=new Point(x,y);
			/*for(int j =0;j<this.children.size();j++){
				double dx= x-this.origin.getX();
				double dy = y-this.origin.getY();
				System.out.println("dx,dy="+dx+","+dy);
				this.children.get(j).moveTo(Math.random()*100,Math.random()*100);
				his.children.get(j).moveTo(dx+this.children.get(j).getOrigin().getX(),dy+this.children.get(j).getOrigin().getY());
			//}
			//this.origin=new Point(x,y);*/
		}

	}

	@Override
	public void moveBy(double x, double y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotate(double theta) {
		this.rotation=theta;

	}

	@Override
	public void scaleX(double x) {
		// TODO Auto-generated method stub

	}

	@Override
	public void scaleY(double y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void scale(double s) {
		// TODO Auto-generated method stub

	}

	@Override public void add(Drawable d){
			children.add(d);
	}

	@Override
	public Drawable copy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Drawable difference(Drawable d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Drawable union(Drawable d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Drawable clip(Drawable d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point getAbsoluteOrigin() {
		if(this.parent!=null){
			return this.origin.add(this.parent.getOrigin());
		}
		else{
			return this.origin;
		}
		//return Geom.findCentroid(this);
	}
	
	@Override
	public Point getOrigin(){
		return this.origin;
	}
	
	public void setOrigin(Point p){
		this.origin=p;
	}
	
	public double getRotation(){
		return this.rotation;
	}
	
	
//color and stroke get and set
	public double getStrokeWeight(){
		return this.strokeWeight;
	}
	
	public void setStrokeWeight(double w){
		this.strokeWeight=w;
	}
	
	public Color getFillColor(){
		return this.fillColor;
	}
	
	public Color getStrokeColor(){
		return this.strokeColor;
	}
	
	public void setStrokeColor(int r, int g, int b){
		this.strokeColor.set(r, g, b);
	}
		
	public void setFillColor(int r, int g, int b){
		this.fillColor.set(r, g, b);
	}
	
	public void setFillColor(Color c){
		this.fillColor=c;
	}
	public void setStrokeColor(Color c){
		this.strokeColor=c;
	}
	
	public void doFill(Boolean f){
		doFill=f;
	}
	public void doStroke(Boolean f){
		doStroke=f;
	}
	
	public boolean doStroke(){
		return doStroke;
	}
	
	public boolean doFill(){
		return doFill;
	}
	
	
	@Override
	public double getWidth(){
		return this.height;
	}

	@Override
	public double getHeight(){
		return this.width;

	}


	public ArrayList<Line> getAllLines() {
		ArrayList<Line> lines = new ArrayList<Line>();
		for(int i=0;i<children.size(); i++){
			lines.addAll(children.get(i).getAllLines());
		}
		return lines;
	}

	//boolean returns to check type of drawables
	public boolean isDrawable(Object value){
		return value instanceof Drawable;
	}

	public boolean isEllipse(Object value){
		return value instanceof Ellipse;
	}

	public boolean isRectangle(Object value){
		return value instanceof Rectangle;
	}

	public boolean isCurve(Object value){
		return value instanceof Curve;
	}
	public boolean isLine(Object value){
		return value instanceof Line;
	}
	public boolean isPolygon(Object value){
		return value instanceof Polygon;
	}

	
	public Drawable getParent(){
		return this.parent;
	}
	
	public void setParent(Drawable p){
		this.parent = p;
	}

	


}
