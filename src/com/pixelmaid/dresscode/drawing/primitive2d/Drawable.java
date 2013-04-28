package com.pixelmaid.dresscode.drawing.primitive2d;

import java.util.ArrayList;
import java.util.Collections;

import processing.core.PApplet;

import com.pixelmaid.dresscode.app.Embedded;
import com.pixelmaid.dresscode.drawing.datatype.CmpX;
import com.pixelmaid.dresscode.drawing.datatype.CmpY;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.CustomEventListener;
import com.pixelmaid.dresscode.events.EventSource;

public class Drawable implements DrawableEvent {

	public  ArrayList<Drawable> children =new ArrayList<Drawable>(); //stores all children of a drawable
	
	
	protected double rotation=0;
	private double scaleX = 1;
	private double scaleY = 1;
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
	private String identifier = "";
	private int line= 0;
	protected ArrayList<Hole> holes = new ArrayList<Hole>();
	protected final static int DEFAULT_WIDTH= 50;

	private EventSource es;


	private String error; 
	
	
	//===============PRIVATE METHODS=================//
	
	//adds a child to list of children and sets its parent
	private void add(Drawable d){
		children.add(d);
		d.setParent(this);
	}
	
	private void add(Drawable d, int index){
		children.add(index, d);
		d.setParent(this);
	}

	//removes a child from list of children and destroys reference to child's parent
	private void remove(Drawable d){
		children.remove(d);
		d.setParent(null);
	}
	
	//adds a hole
	public void addHole(Hole h){
		holes.add(h);
		h.setParent(this);

	}
	//returns all holes
	public ArrayList<Hole> getHoles(){
		return this.holes;
	}
	
	public Drawable holesToDrawable(){
		Drawable d = new Drawable();
		for(int i=0;i<holes.size();i++){
			Polygon h = holes.get(i).toPolygon();
			d.addToGroup(h);
		}
		return d;
	}
	
	//returns the parent of the drawable
	protected void setParent(Drawable p){
		this.parent = p;
	}

	

	//===============PUBLIC METHODS=================//
	public Drawable(ArrayList<Double> params){
		this();
	}

	public Drawable(){
		this(0,0);
	}
	
	public Drawable(double x, double y){
		
		origin= new Point(0,0);
		this.fillColor= new Color();
		this.strokeColor= new Color();
		setFillColor(255,255,255);
		setStrokeColor(0,0,0);
		strokeWeight = 1;
		holes = new ArrayList<Hole>();
		es= new EventSource();
	}

	//-------------DRAW AND PRINT METHODS-----------------//
	
	//draws each child in the drawable. Must be overridden by subclasses
	public void draw(Embedded embedded) {
		if(!this.getHide()){//only draws if child is not hidden
		appearance(embedded);
		embedded.pushMatrix();
		embedded.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		embedded.rotate(PApplet.radians((float)getRotation()));
		embedded.scale((float)getScaleX(),(float)getScaleY());
				for(int j =0;j<this.children.size();j++){
					if(!this.children.get(j).getHide()){
						this.children.get(j).draw(embedded);
					}
					
				}
				
				for(int j =0;j<this.holes.size();j++){
					if(!this.holes.get(j).getHide()){
						this.holes.get(j).draw(embedded);
					}
					
				}
				
		embedded.popMatrix();
		
		//if(this.getDrawOrigin()){
			//this.drawOrigin(embedded);
		//}
		}
	}

	//draws each child of the drawable for a vector file version (must be overridden by subclass)
	public void print(Embedded embedded) {
		if(!this.getHide()){//only draws if child is not hidden
			appearance(embedded);
			embedded.noFill();
			embedded.pushMatrix();
			embedded.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
			embedded.rotate(PApplet.radians((float)getRotation()));
			
					for(int j =0;j<this.children.size();j++){
						if(!this.children.get(j).getHide()){
							this.children.get(j).print(embedded);
						}
						
					}
					
					for(int j =0;j<this.holes.size();j++){
						if(!this.holes.get(j).getHide()){
							this.holes.get(j).print(embedded);
						}
						
					}
					
			embedded.popMatrix();
		}

	}
	
	//sets appearance to outline form
	public void outlineAppearance(Embedded e){
		
		e.strokeWeight((float)this.getStrokeWeight());
		
		
		e.fill(255,0,0,25f);
		
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
			//e.noStroke();
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
		embedded.stroke(0,0,0);
		embedded.strokeWeight(8);
		embedded.point((float)this.origin.getX(),(float)this.origin.getY());
		
		embedded.stroke(255,255,255);
		embedded.strokeWeight(4);
		embedded.point((float)this.origin.getX(),(float)this.origin.getY());
	}
	

	
	//---identifier reference methods----------------//
	
	public void setIdentifier(String identifier){
		this.identifier= identifier;
	}
	
	public String getIdentifier(){
	if (this.identifier!=""){
		return this.identifier;
	}
	else{
		return null;
	}
	}
	
	public int getLine() {
		return this.line;
	}
	
	public void setLine(int l){
		this.line = l;
	}

	
	
	//------------COLOR AND STROKE GET AND SET METHODS-----------------//
	
	//sets the stroke weight value
		public void setStrokeWeight(double w){
			this.strokeWeight=w;
			for(int i=0;i<this.children.size();i++){
				this.children.get(i).setStrokeWeight(w);
			}
			for(int i=0;i<this.holes.size();i++){
				this.holes.get(i).setStrokeWeight(w);
			}
		}
	
	//returns the stroke weight value
	public double getStrokeWeight(){
		return this.strokeWeight;
	}
	
	//sets the fill color to an rgb value
	public void setFillColor(int r, int g, int b){
		this.fillColor.set(r, g, b);
		for(int i=0;i<this.children.size();i++){
			this.children.get(i).setFillColor(r, g, b);
		}
		/*for(int i=0;i<this.holes.size();i++){
			this.holes.get(i).setFillColor(r, g, b);
		}*/
	}
	
	//sets the fill color by a color constant
	public void setFillColor(Color c){
		this.fillColor=c;
		for(int i=0;i<this.children.size();i++){
			this.children.get(i).setFillColor(c);
		}
		for(int i=0;i<this.holes.size();i++){
			this.holes.get(i).setFillColor(c);
		}
	}
	
	//returns the current fill color
	public Color getFillColor(){
		return this.fillColor;
	}
	
	//sets the stroke color with an rgb value
	public void setStrokeColor(int r, int g, int b){
		this.strokeColor.set(r, g, b);
		for(int i=0;i<this.children.size();i++){
			this.children.get(i).setStrokeColor(r,g,b);
		}
		for(int i=0;i<this.holes.size();i++){
			this.holes.get(i).setStrokeColor(r,g,b);
		}
	}
		
	//sets the stroke color with a color constant
	public void setStrokeColor(Color c){
		this.strokeColor=c;
		for(int i=0;i<this.children.size();i++){
			this.children.get(i).setStrokeColor(c);
		}
		for(int i=0;i<this.holes.size();i++){
			this.holes.get(i).setStrokeColor(c);
		}
	}
	
	//returns the current stroke color
	public Color getStrokeColor(){
		return this.strokeColor;
	}
	
	
	//sets whether or not the drawable has a fill
	public void doFill(Boolean f){
		doFill=f;
		for(int i=0;i<this.children.size();i++){
			this.childAt(i).doFill(f);
		}
		for(int i=0;i<this.holes.size();i++){
			this.holes.get(i).doFill(f);
		}
		
	}
	
	//sets whether or not the drawable has a stroke
	public void doStroke(Boolean f){
		doStroke=f;
		for(int i=0;i<this.children.size();i++){
			this.childAt(i).doStroke(f);
		}
		for(int i=0;i<this.holes.size();i++){
			this.holes.get(i).doStroke(f);
		}
	}
	
	//returns if the object has a stroke
	public boolean doStroke(){
		return doStroke;
	}
	
	//returns if the object has a fill
	public boolean doFill(){
		return doFill;
	}
	
	
	//-------------TRANSFORMATION METHODS-----------------//

	//hides the drawable and all children
	public void hide() {
		this.hide=true;

	}
	//returns if the drawable is hidden or not
	public boolean getHide() {
		return this.hide;

	}
	//un hides the drawable
	public void show() {
		this.hide=false;

	}
	
	//methods for getting and setting drawOrigin value	
	public boolean getDrawOrigin(){
		return drawOrigin;
	}
	 //sets whether or not to draw the object's origin on the canvas
	public void setDrawOrigin(boolean d){
		drawOrigin=d;
	}

	public void addToCanvas(){
		this.fireEvent(CustomEvent.ADD_DRAWABLE);
	}
	
	//removes drawable from canvas
	public void removeFromCanvas(){
		this.fireEvent(CustomEvent.REMOVE_DRAWABLE);
	}

	//resets origin to new point resulting in the moving of the object
	public void moveTo(double x, double y) {
		this.origin=new Point(x,y);
		if(this.getParent()!=null){
			this.parent.resetOrigin();
		}
	}
	
	//resets origin to new point resulting in the moving of the object
	public void moveBy(double x, double y) {
		this.origin.moveBy(x, y);
		if(this.getParent()!=null){
			this.parent.resetOrigin();
		}
	}
	
	//sets the rotation to a new angle (in degrees)
	public void rotate(double theta) {
		this.rotation=theta;
		if(this.getParent()!=null){
			this.parent.resetOrigin();
		}
		//System.out.println("when set, rotation ="+this.rotation);

	}
	
	//rotates around a focus. does not change the rotation property
		public Drawable rotateWithFocus(double theta, Point focus){
			this.setAbsolute();
			ArrayList<Point> origins = new ArrayList<Point>();
			
			for(int i=0;i<this.children.size();i++){
				this.children.get(i).rotateWithFocus(theta, focus);
				origins.add(this.children.get(i).getOrigin());
			}
			for(int i=0;i<this.holes.size();i++){
				this.holes.get(i).rotateWithFocus(theta, focus);
			}
			
			
			if(this.children.size()>1){
				this.moveOrigin(Geom.getAveragePoint(origins)); //set origin to average of group origins and re-orient group origins
			}
			
			else if(this.children.size()==1){ //if only one child, return the child and remove empty group from canvas
				this.moveOrigin(this.children.get(0).getOrigin()); //set origin to average of group origins and re-orient group origins
			}
			
			if(this.getParent()!=null){
				this.parent.resetOrigin();
			}
			return this;
			
		}
		
		public Drawable mirrorX() {
			this.setAbsolute();
			ArrayList<Point> origins = new ArrayList<Point>();
			
			for(int i=0;i<this.children.size();i++){
				this.children.get(i).mirrorX();
				origins.add(this.children.get(i).getOrigin());
			}
			
			/*for(int i=0;i<this.holes.size();i++){
				this.holes.get(i).mirrorX();
			}*/
			
			if(this.children.size()>1){
				this.moveOrigin(Geom.getAveragePoint(origins)); //set origin to average of group origins and re-orient group origins
			}
			
			else if(this.children.size()==1){ //if only one child, return the child and remove empty group from canvas
				this.moveOrigin(this.children.get(0).getOrigin()); //set origin to average of group origins and re-orient group origins
			}
			
			if(this.getParent()!=null){
				this.parent.resetOrigin();
			}
			return this;
		}
		
		public Drawable mirrorY() {
			this.setAbsolute();
			ArrayList<Point> origins = new ArrayList<Point>();
			
			for(int i=0;i<this.children.size();i++){
				this.children.get(i).mirrorY();
				origins.add(this.children.get(i).getOrigin());
			}
			
			if(this.children.size()>1){
				this.moveOrigin(Geom.getAveragePoint(origins)); //set origin to average of group origins and re-orient group origins
			}
			
			else if(this.children.size()==1){ //if only one child, return the child and remove empty group from canvas
				this.moveOrigin(this.children.get(0).getOrigin()); //set origin to average of group origins and re-orient group origins
			}
			
			if(this.getParent()!=null){
				this.parent.resetOrigin();
			}
			return this;
		}
	
	//returns the rotation of an object
	public double getRotation(){
		return this.rotation;
	}
	
	// TODO IMPLEMENT SCALING
	//scales the object on the x axis
	public void scaleX(double x) {
		this.scaleX = x;
		if(this.getParent()!=null){
			this.parent.resetOrigin();
		}

	}

	//scales the object on the x axis
	public void scaleY(double y) {
		this.scaleY = y;
		if(this.getParent()!=null){
			this.parent.resetOrigin();
		}

	}
	
	//scales the object on the x axis
	public double getScaleX() {
		return this.scaleX;

	}

	//scales the object on the x axis
	public double getScaleY() {
		return this.scaleY;

	}

	//scales the object on the x and y axis by the same amount
	public void scale(double s) {
		this.scaleX = s;
		this.scaleY = s;
		if(this.getParent()!=null){
			//this.parent.resetOrigin();
		}
	}	
	
	// TODO TEST COPY
	//copies drawable and returns copy. Must be overridden by subclasses
	public Drawable copy() {
		Drawable d = new Drawable();
		copyParameters(this,d);
		for(int i=0;i<this.children.size();i++){
			d.add(this.children.get(i).copy());
		}
		for(int i=0;i<this.holes.size();i++){
			d.addHole(this.holes.get(i).copy());
		}
				
		return d;
		
	}

	
	
	 public double getWidth(){
		 Rectangle bb = this.findBoundingBox();
		   double width= bb.getWidth()*getScaleX();
		   return width;
		   
	 }
	   
	 public double getHeight(){
		 Rectangle bb = this.findBoundingBox();
		   double height= bb.getHeight()*getScaleX();
		   return height;
	 }

	   public Rectangle findBoundingBox(){
			  ArrayList<Point> copyPoints =  this.copyAllPoints();
			  Collections.sort(copyPoints, new CmpX());
			  double leftX = copyPoints.get(0).getX();
			  double rightX = copyPoints.get(copyPoints.size()-1).getX();
			  
			  Collections.sort(copyPoints, new CmpY());
			  
			  double leftY = copyPoints.get(0).getY();
			  double rightY = copyPoints.get(copyPoints.size()-1).getY();
			  
			  return new Rectangle(leftX,leftY,rightX-leftX,rightY-leftY);
			  
		   }
		   
		   public Point getExtremeLeftPoint(){
			   ArrayList<Point> copyPoints = this.copyAllPoints();
				  Collections.sort(copyPoints, new CmpX());
				  return copyPoints.get(0);
				
			   }
		    
		   public Point getExtremeRightPoint(){
			   ArrayList<Point> copyPoints = this.copyAllPoints();
				  Collections.sort(copyPoints, new CmpX());
				  return copyPoints.get(copyPoints.size()-1);
				
			   }
		   
		   public Point getExtremeTopPoint(){
			   ArrayList<Point> copyPoints = this.copyAllPoints();
				  Collections.sort(copyPoints, new CmpY());
				  return copyPoints.get(0);
				
			   }
		   
		   public Point getExtremeBottomPoint(){
			   ArrayList<Point> copyPoints = this.copyAllPoints();
				  Collections.sort(copyPoints, new CmpY());
				  return copyPoints.get(copyPoints.size()-1);
				
			   }
	
		   //gets all points of all children
		   public ArrayList<Point> copyAllPoints(){
			   ArrayList<Point> copyPoints = new ArrayList<Point>();
			   Drawable copy = this.condense();
				for(int j=0;j<copy.numChildren();j++){
				  Polygon c = (Polygon)copy.childAt(j);
				  c.setAbsolute();
					for(int i=0;i<c.getPoints().size();i++){
					   copyPoints.add(c.getPoints().get(i).copy());  
				   }
			   }
				   
				   return copyPoints;
			}

	
	
	//copies over all parameters from original drawable to new drawable, MUST BE CALLED IN ALL COPY AND TOPOLYGON METHODS
	public void copyParameters(Drawable o, Drawable c){
		c.setOrigin(o.origin.copy());
		c.rotate(o.getRotation());
		c.scaleX(o.getScaleX());
		c.scaleY(o.getScaleY());
		c.setFillColor(o.getFillColor());
		c.setStrokeColor(o.getStrokeColor());
		c.setStrokeWeight(o.getStrokeWeight());
		c.doFill(o.doFill);
		c.doStroke(o.doStroke);
		c.setDrawOrigin(o.getDrawOrigin());
		c.rotate(o.getRotation());
		c.setParent(o.getParent());
	}
	
	
	
	
	
	
	//----------------ORIGIN/CHILDREN/GROUPING MANIPULATION METHODS------------------//
	
	//gets the parent of the object
	protected Drawable getParent(){
		return this.parent;
	}
	
	
	//set the current origin of the drawable
	protected void setOrigin(Point p){
			this.origin=p;
		}
	
	//get the current origin of the drawable
	public Point getOrigin(){
		return this.origin;
	}
	

	//sets the drawable's origin relative to a new origin
	protected void setRelativeTo(Point p) {
		this.origin= this.origin.difference(p);	
	}
	
	//sets the drawable at a new origin, and moves all children relative to that new origin //should only be used when a new child is added to the group
	private void moveOrigin(Point p){
			this.setOrigin(p);
			for(int i=0;i<this.children.size();i++){
				
					children.get(i).setRelativeTo(p);	
			}
			for(int i=0;i<this.holes.size();i++){
				
				holes.get(i).setRelativeTo(p);	
		}
	}
	
	//sets the drawable to its absolute position with respect to its parent
	protected void setAbsolute() {
			if(this.parent!=null){
				this.origin= this.origin.add(this.parent.getOrigin()); //add parent's origin to its origin
				this.rotation = (this.getRotation()+this.getParent().getRotation()); //adds parent's rotation to its rotation
			}
	}
	
	private Drawable returnAbsoluteAt(int i){
		Drawable orphan = this.children.get(i).copy();
		orphan.setAbsolute();
		return orphan;
	}
	
	private Hole returnAbsoluteHoleAt(int i){
		Hole orphan = this.holes.get(i).copy();
		orphan.setAbsolute();
		
		return orphan;
	}
	
	//converts all children of the drawable to polygons. (must be overridden by subclasses)
	public Drawable toPolygon(){
		for(int j =0;j<this.children.size();j++){
			Drawable poly = this.children.get(j).toPolygon();
			this.children.set(j, poly);
		}
		
		
		return this;
	}
	
	//used when polygon only has one child
	public Polygon simplify(){
		Polygon p = (Polygon)this.childAt(0).toPolygon();
		p.setParent(null);
		p.setOrigin(this.getOrigin());
		for(int j =0;j<this.holes.size();j++){
			p.addHole(holes.get(j));
		}
		return p;
	}
	
	//expands all children of drawable;
	public Drawable expand(){
		for(int j =0;j<this.children.size();j++){
			Drawable poly = this.children.get(j).expand();
			this.children.set(j, poly);
		}
		for(int j =0;j<this.holes.size();j++){
			Drawable poly = this.holes.get(j).expand();
			this.addToGroup(poly);
		}
		this. holes = new ArrayList<Hole> ();
		return this;
	}

	
	//adds new child and resets origin of drawable to accommodate child (must be overridden by subclasses)
	public Drawable addToGroup(Drawable d) {
		return this.addToGroup(d,this.numChildren());
	}
	
	public Drawable addToGroup(Drawable d,int index) {
		this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, d);
		
			for(int i=0;i<this.children.size();i++){
				this.children.get(i).setAbsolute();
			}
			for(int i=0;i<this.holes.size();i++){
				this.holes.get(i).setAbsolute();
			}
		
		
		
		this.add(d,index);
		
		
		ArrayList<Point> origins = new ArrayList<Point>();
		if(this.children.size()>1){
			for(int i=0;i<this.children.size();i++){
				origins.add(this.children.get(i).getOrigin());
			}
			this.moveOrigin(Geom.getAveragePoint(origins)); //set origin to average of group origins and re-orient group origins
		}
		
		else if(this.children.size()==1){ //if only one child, return the child and remove empty group from canvas
			this.moveOrigin(this.children.get(0).getOrigin()); //set origin to average of group origins and re-orient group origins
		}

		return this;

	}
	
	public Drawable addHoleToGroup(Hole h) {
		
		
		this.addHole(h);
	
		h.setRelativeTo(this.origin);
	return this;
	}
	
	//resets the origin when a member of a group is moved, added, adjusted or removed
	public void resetOrigin(){
		for(int i=0;i<this.children.size();i++){
			this.children.get(i).setAbsolute();
		}
		for(int i=0;i<this.holes.size();i++){
			this.holes.get(i).setAbsolute();
		}
		ArrayList<Point> origins = new ArrayList<Point>();
		if(this.children.size()>1){
			for(int i=0;i<this.children.size();i++){
				origins.add(this.children.get(i).getOrigin());
			}
			this.moveOrigin(Geom.getAveragePoint(origins)); //set origin to average of group origins and re-orient group origins
		}
		
		else if(this.children.size()==1){ //if only one child, return the child and remove empty group from canvas
			this.moveOrigin(this.children.get(0).getOrigin()); //set origin to average of group origins and re-orient group origins
		}
	}

	//removes child and resets origin of drawable to accomodate (must be overridden by subclasses) returns removed child
	public Drawable removeFromGroup(Drawable d) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<this.children.size();i++){
			this.children.get(i).setAbsolute();
		}
		for(int i=0;i<this.holes.size();i++){
			this.holes.get(i).setAbsolute();
		}
	    	
		this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, d);
		this.remove(d);
		
		
		ArrayList<Point> origins = new ArrayList<Point>();
		//System.out.println("num children after removal="+this.numChildren());
		if(this.children.size()>1){
			for(int i=0;i<this.children.size();i++){
				origins.add(this.children.get(i).getOrigin());
			}
			this.moveOrigin(Geom.getAveragePoint(origins)); //set origin to average of group origins and re-orient group origins
			//this.setOrigin(Geom.getAveragePoint(origins));
		}
		
		else if(this.children.size()==1){ //if only one child, return the child and remove empty group from canvas
			//this.removeFromCanvas();
			//System.out.println("no more children, removing from canvas");
			this.moveOrigin(this.children.get(0).getOrigin());
			//return this.children.get(0);
		}
		else if(this.children.size()==0){
			this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, this); // if no children, remove empty group
			
		}
		return d;

		

	}
	
	public Drawable removeFromGroup(int index){
		Drawable d = this.childAt(index);
		return this.removeFromGroup(d);
	}
		
		//removes all children from a drawable and returns them as orphans (must be overridden by subclasses)
		public ArrayList<Drawable> removeAllChildren(){
			ArrayList<Drawable> orphans = new ArrayList<Drawable>();
			for(int i=this.children.size()-1;i>=0;i++){
				Drawable d = removeFromGroup(this.children.get(i));
				orphans.add(d);
			}
			Collections.reverse(orphans);
			return orphans;
			
		}
		
		//adds a list of children to the drawable (must be overridden by subclasses)
		public Drawable addAllChildren(ArrayList<Drawable> orphans){
		
			for(int i=0;i<orphans.size();i++){
				this.addToGroup(orphans.get(i));
				
			}
			
			return this;
			
			
		}
		//returns number of children of the drawable (can be used to tell if it is empty, or potentially a polygon)
		public int numChildren(){
			return this.children.size();
		}
		
		//returns the children of the drawable
		public ArrayList<Drawable> getChildren(){
			return this.children;
		}
		//returns child at a specific index- need to decide if should return a copy or child itself
		public Drawable childAt(int i){
			return this.children.get(i);
		}
		
		
		//condenses all drawable children into one dimensional list
		public Drawable condense(){
			Drawable dp = this.toPolygon(); //first convert all children primitves to polygons
			if(dp.numChildren()==0){
				return dp;
			}
			else{
				Drawable parent =  new Drawable();
				condenseRec(dp,parent);
				dp = parent;
				
				//System.out.println("numChildren in drawable after condense ="+parent.children.size());
		
				return parent;
			}
		}
		
		//recursive condense function
		public void condenseRec(Drawable d,Drawable parent){
			ArrayList<Drawable> currentChildren = d.getChildren();
			ArrayList<Hole> currentHoles = d.getHoles();
			//System.out.println("number of children = "+d.numChildren());
			//System.out.println("condensing holes");
			for(int i=0;i<currentHoles.size(); i++){
				Hole h = d.returnAbsoluteHoleAt(i);
				//Window.canvas.addDrawable("hole", 0, h);
				parent.addHoleToGroup(h);
			}
		
			for(int i=currentChildren.size()-1;i>=0; i--){
				Drawable orphan = d.returnAbsoluteAt(i);
		
				//System.out.println("checking child at = "+i +":"+orphan);
				if (orphan.numChildren()!=0){ //is not a polygon
					//System.out.println("orphan is not a polygon");
					condenseRec(orphan,parent);
				}
				else{
					//System.out.println("orphan is a polygon");
					//System.out.println("adding orphan to parent");
					
					parent.addToGroup(orphan);	
				}
				
			}
			
			
		}

		
		
///==================EVENT SOURCE METHODS================
		@Override
		public Drawable getDrawable() {
			return this;
		}

		@Override
		public String getError() {
			return this.error;
		}

		@Override
		public void fireEvent(int event) {
			this.es.fireEvent(this,event);
			
		}
		@Override
		public void drawableEvent(int event, Drawable d) {
			this.es.fireDrawableEvent(this,event,d);
			
		}
		@Override
		public void addEventListener(CustomEventListener listener) {
			this.es.addEventListener(listener);
			
		}
		@Override
		public void removeEventListener(CustomEventListener listener) {
			this.es.removeEventListener(listener);
		}

	
		

	//boolean returns to check type of drawables
	/*public boolean isDrawable(){
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
	//checks if all children of a drawable are polygons or if drawable is a polygon itself
	public boolean childrenArePolygons() {
		
		if(this.isPolygon()){
			return true;
		}
		else{
		boolean areP = true;
		for(int i=0;i<this.children.size();i++){
			if (!this.children.get(i).isPolygon()){
				areP=false;
			}
		}
		return areP;
		}
	}*/

	
	
	
	
	
	
	

	


		
	


}