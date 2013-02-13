package com.pixelmaid.dresscode.drawing.primitive2d;

import java.util.ArrayList;

import com.pixelmaid.dresscode.app.Embedded;
import com.pixelmaid.dresscode.app.Manager;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;

public class Drawable implements DrawableInterface {

	public  ArrayList<Drawable> children; //stores all children of a drawable
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
	private boolean drawOrigin=true;
	
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
		if(!this.getHide()){
		appearance(embedded);
		embedded.pushMatrix();
		embedded.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		embedded.rotate((float)getRotation());
		
				for(int j =0;j<this.children.size();j++){
						this.children.get(j).draw(embedded);
					
				}
				
		embedded.popMatrix();
		
		if(this.getDrawOrigin()){
			this.drawOrigin(embedded);
		}
		}
	}

	//sets up proper fill and stroke settings
	public void appearance(Embedded e){
		int rf=this.getFillColor().r();
		int gf=this.getFillColor().g();
		int bf=this.getFillColor().b();
		int rS=this.getStrokeColor().r();
		int gS=this.getStrokeColor().g();
		int bS=this.getStrokeColor().b();
		
		
		if(this.doStroke()){
			e.stroke(rS,gS,bS);
			
		}
		else{
			e.noStroke();
		}
		e.strokeWeight((float)this.getStrokeWeight());
		
		if(this.doFill()){
			e.fill(rf,gf,bf);
		}
		else{
			e.noFill();
		}
	}
	
	//draws the origin of the drawable
	public void drawOrigin(Embedded embedded){
		embedded.stroke(255,0,0);
		embedded.strokeWeight(5);
		embedded.point((float)this.origin.getX(),(float)this.origin.getY());
		System.out.println("drawOrigin");
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
	
	//methods for getting and setting drawOrigin value
	
	public boolean getDrawOrigin(){
		return drawOrigin;
	}
	
	public void setDrawOrigin(boolean d){
		drawOrigin=d;
	}

	@Override
	public void removeFromCanvas(){
		Manager.canvas.removeDrawable(this);
	}

	@Override
	public void moveTo(double x, double y) {

		this.origin=new Point(x,y);
	
	}
	
	@Override
	public Drawable toPolygon(){
		for(int j =0;j<this.children.size();j++){
			Drawable poly = this.children.get(j).toPolygon();
			this.children.set(j, poly);
		}
		return this;
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

	//gets the absolute position of the object
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
	public void setAbsoluteOrigin() {
		if(this.parent!=null){
			this.origin= this.origin.add(this.parent.getOrigin());
		}
	}
	

	public void setOriginRelativeTo(Point p) {
		this.origin= this.origin.difference(p);
	}
	
	public void alterOrigin(Point p){
		this.setOrigin(p);
		for(int i=0;i<this.children.size();i++){
			children.get(i).setOriginRelativeTo(p);
		}
		
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
		for(int i=0;i<this.children.size();i++){
			this.children.get(i).setStrokeWeight(w);
		}
	}
	
	public Color getFillColor(){
		return this.fillColor;
	}
	
	public Color getStrokeColor(){
		return this.strokeColor;
	}
	
	public void setStrokeColor(int r, int g, int b){
		this.strokeColor.set(r, g, b);
		for(int i=0;i<this.children.size();i++){
			this.children.get(i).setStrokeColor(r,g,b);
		}
	}
		
	public void setFillColor(int r, int g, int b){
		this.fillColor.set(r, g, b);
		for(int i=0;i<this.children.size();i++){
			this.children.get(i).setFillColor(r, g, b);
		}
	}
	
	public void setFillColor(Color c){
		this.fillColor=c;
		for(int i=0;i<this.children.size();i++){
			this.children.get(i).setFillColor(c);
		}
	}
	public void setStrokeColor(Color c){
		this.strokeColor=c;
		for(int i=0;i<this.children.size();i++){
			this.children.get(i).setStrokeColor(c);
		}
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
	public boolean isDrawable(){
		return this instanceof Drawable;
	}

	public boolean isEllipse(){
		return this instanceof Ellipse;
	}

	public boolean isRectangle(){
		return this instanceof Rectangle;
	}

	public boolean isCurve(){
		return this instanceof Curve;
	}
	public boolean isLine(){
		return this instanceof Line;
	}
	public boolean isPolygon(){
		return this instanceof Polygon;
	}

	
	public Drawable getParent(){
		return this.parent;
	}
	
	public void setParent(Drawable p){
		this.parent = p;
	}

	//condenses all drawable children into one dimensional list
	public Drawable condense(){
		Drawable dp = this.toPolygon(); //first convert all children primitves to polygons
		if(dp.isPolygon()){
			return dp;
		}
		else{
			ArrayList<Drawable> empty = new ArrayList<Drawable>();
			ArrayList<Drawable> finalPolys = condenseRec(dp,empty); 
			this.children=finalPolys;
			return dp;
		}
	}
	
	//recursive condense function
	public ArrayList<Drawable> condenseRec(Drawable d, ArrayList<Drawable> polygons){
		for(int i=0;i<d.children.size(); i++){
			d.children.get(i).setAbsoluteOrigin();
			if (!d.children.get(i).isPolygon()){
				condenseRec(d.children.get(i),polygons);
				
			}
			else{
				polygons.add(d.children.get(i));
			}
		}
		return polygons;
		
	}
	


}
