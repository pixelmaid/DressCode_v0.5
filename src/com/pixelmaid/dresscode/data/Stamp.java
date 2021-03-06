package com.pixelmaid.dresscode.data;

import java.util.ArrayList;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.app.ui.tools.BoolTool;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.*;

//holds code snippets from user created objects that are reusable
// must have function definition of created object
// function call that returns group containing created object
// saved bitmap of object
// parameter setting?
//note- this stamp is static, code created by it will NOT be the same as code used to generate shape

public class Stamp {

	private String functionDef=""; //stores function definition of stamp
	private String functionCall=""; //stores function call of stamp
	
	//identifier labels for primitives
	private static int eId =0;
	private static int rId=0;
	private static int pId =0;
	private static int sId =0;
	private static int gId = 0;
	private static int lId=0;
	private static int cId = 0;
	private static int uId =0;
	private static int dId =0;
	private static int iId =0;
	private static int xId =0;
	private static int listId = 0;
	
	private static String currentGroupId = "g";
	private String functionName="";

	protected  final static String cm = ",";
	protected  final static String end = ");";
	protected  final String functionStart = "def ";
	protected final String functionMiddle = "():";
	protected final String functionEnd = "end";
	protected  String returnStatement = "return "+currentGroupId + ";";
	public Stamp(){
		
	}
	/*public function for setting up a stamp
	* passes in a string of drawables 
	* which are recursively sorted into a function defintion
	*/
	
	public void setDrawables(String fName, boolean isStatic, Drawable d){
		functionName = fName;
		
		
			functionDef += initGroup();
			setDrawablesRecur(d,true);
		
		
	/*	if(drawables.size()==1 && drawables.get(0).numChildren()==0){
			functionDef += initGroup();
			setDrawablesRecur(drawables.get(0),true);
		}
		else{
			functionDef += initGroup();
		for (int i=0;i<drawables.size();i++){
				setDrawablesRecur(drawables.get(i),true);
			}
		}*/
		functionDef = functionStart+functionName+functionMiddle+"\n"+functionDef+"\n"+returnStatement+"\n"+functionEnd;
		functionCall = functionName+"();";
		
	}
	/*recursive drawable sorting function
	 * called by setDrawables
	 */
	private void setDrawablesRecur(Drawable d, boolean toGroup){
		
		VarType v = new VarType(d);
		if(v.isEllipse()){
			d.setAbsolute();
			functionDef+= "\n"+addEllipseStatement((Ellipse)d, toGroup);	
			System.out.println("functionDef="+functionDef);
		}
		else if(v.isRectangle()){
			d.setAbsolute();
			functionDef+= "\n"+addRectStatement((Rectangle)d,toGroup);	
		}
		
		else if(v.isCurve()){
			d.setAbsolute();
			functionDef+= "\n"+addCurveStatement((Curve)d,toGroup);	
		}
		else if(v.isLine()){
			d.setAbsolute();
			functionDef+= "\n"+addLineStatement((Line)d,toGroup);	
		}
		else if(v.isLShape()){
			d.setAbsolute();
			functionDef+= "\n"+addLShapeStatement((LShape)d,toGroup);	
		}
		else if(v.isPolygon()){
			functionDef+= "\n"+addPolyStatement((Polygon)d,toGroup);	
		}
		else{
			d.setAbsolute();
			ArrayList<Drawable> drawables = d.getChildren();
			for (int i=0;i<drawables.size();i++){
				setDrawablesRecur(drawables.get(i),toGroup);
			}
		}
	}
	
	// individual drawable type statement creators
	public static String addEllipseStatement(Ellipse e, boolean toGroup){
		String id ="e"+eId;
		String start = id +" = ellipse(";
		Point origin = e.getOrigin();
		double x = origin.getX();
		double y = origin.getY();
		double w = e.getWidth();
		double h = e.getHeight();
		
		String statement = start+roundNum(x)+cm+roundNum(y)+cm+roundNum(w)+cm+roundNum(h)+end;
	
		statement = checkDefaults(e,id,statement);
		if(toGroup){
			statement = addGroupStatement(id, statement);
		}
		eId++;
		System.out.println(statement);
		return statement;
	
	}
	
	// individual drawable type statement creators
	public static String addRectStatement(Rectangle e, boolean toGroup){
		String id ="r"+rId;
		String start = id +" = rect(";
		Point origin = e.getOrigin();
		double x = origin.getX();
		double y = origin.getY();
		double w = e.getWidth();
		double h = e.getHeight();
		
		String statement = start+roundNum(x)+cm+roundNum(y)+cm+roundNum(w)+cm+roundNum(h)+end;
	
		statement = checkDefaults(e,id,statement);
		if(toGroup){
			statement = addGroupStatement(id, statement);
		}
		
		rId++;
		return statement;
	
	}
	
	public static String addRPolyStatement(Polygon created, double rotation, boolean inGroup) {
		//int point = 0;
		String id ="p"+pId;
		String rectStart;
		String rectEnd = ");";
		String rotationStatement="";
		if(rotation!=0){
			rectStart = "rotate(poly(";
			rotationStatement="),"+roundNum(rotation);
			
		}
		else{
			rectStart = "poly(";
		}
		
		Point origin = created.getOrigin();
		String rectStatement = id +" = "+rectStart+roundNum(origin.getX())+","+roundNum(origin.getY())+","+roundNum(created.numSides())+","+roundNum(created.sideLength())+rotationStatement+rectEnd;
		
		pId++;
		return rectStatement;
		
	}
	
	
	// individual drawable type statement creators
		public static String addPolyStatement(Polygon e, boolean toGroup){
			
			String id ="p"+pId;
			String list  = "lst"+listId+" =[";
			String listEnd = "];";
			String start = id +" = poly("+"lst"+listId+end;
			
			String statement = "";
			Polygon eC = e.copy();
			eC.setPointsAbsolute();
			ArrayList<Point> points = eC.getPoints();
			for(int i=0;i<points.size();i++){
				String pointSt = "point("+roundNum(points.get(i).getX())+cm+roundNum(points.get(i).getY())+")";
				if(i!=points.size()-1){
					pointSt+=",";
				}
				list+=pointSt;
			}
			list+=listEnd;
			statement +=list+"\n"+start;
			statement = checkDefaults(e,id,statement);
			if(toGroup){
				statement = addGroupStatement(id, statement);
			}
			
			pId++;
			listId++;
			return statement;
		
		}
		
		// individual drawable type statement creators
		public static String addCurveStatement(Curve e, boolean toGroup){
			String id ="c"+cId;
			String start = id +" = curve(";
			Point startP = e.getStart();
			Point endP = e.getEnd();
			Point control1 = e.getControl1();
			Point control2 = e.getControl2();
			
			String sX = roundNum(startP.getX());
			String sY = roundNum(startP.getY());
			String eX = roundNum(endP.getX());
			String eY = roundNum(endP.getY());
			String c1X = roundNum(control1.getX());
			String c1Y = roundNum(control1.getY());
			String c2X = roundNum(control2.getX());
			String c2Y = roundNum(control2.getY());
			String statement = start+sX+cm+sY+cm+c1X+cm+c1Y+cm+c2X+cm+c2Y+cm+eX+cm+eY+end;
		
			statement = checkDefaults(e,id,statement);
			if(toGroup){
				statement = addGroupStatement(id, statement);
			}
			
			cId++;
			return statement;
		
		}
		
		// individual drawable type statement creators
		public static String addLineStatement(Line e, boolean toGroup){
					String id ="l"+lId;
					String start = id +" = line(";
					Point startP = e.getStart();
					Point endP = e.getEnd();
					
					
					String sX = roundNum(startP.getX());
					String sY = roundNum(startP.getY());
					String eX = roundNum(endP.getX());
					String eY = roundNum(endP.getY());
					
					String statement = start+sX+cm+sY+cm+eX+cm+eY+end;
				
					statement = checkDefaults(e,id,statement);
					if(toGroup){
						statement = addGroupStatement(id, statement);
					}
					
					cId++;
					return statement;
				
				}
		
		public static String addBoolStatement(ArrayList<Drawable> selected, int boolType, boolean toGroup) {
			
			String n1 =selected.get(0).getIdentifier();
			String n2 =selected.get(1).getIdentifier();
			
			String id = "";
			String lineStart="";
			switch(boolType){
			case BoolTool.UNION:
				id = "u"+uId+"=";
				uId++;
				lineStart ="union(";
			break;
			case BoolTool.DIFF:
				id = "d"+dId+"=";
				dId++;
				lineStart ="diff(";
			break;
			case BoolTool.XOR:
				id = "x"+xId+"=";
				xId++;
				lineStart ="xor(";
			
			break;
			case BoolTool.CLIP:
				id = "i"+iId+"=";
				iId++;
				lineStart ="clip(";
			break;
			
			
		}
			String lineEnd = ");";
			String lineStatement = id+lineStart+n1+","+n2+lineEnd;
			return lineStatement;

			
		}
				
				// individual drawable type statement creators
		public static String addLShapeStatement(LShape e, boolean toGroup){
					String id ="s"+sId;
					String start = id +" = import(";
					String path = e.getPath();
					
					
					String statement = start+"\""+path+"\""+end;
				
					statement = checkDefaults(e,id,statement);
					if(e.getRotation()!=0){
						statement+= "\nrotate("+id+cm+e.getRotation()+end;
					}
					if(e.getOrigin().getX()!=0 || e.getOrigin().getY()!=0 ){
						statement+= "\nmove("+id+cm+roundNum(e.getOrigin().getX())+cm+roundNum(e.getOrigin().getY())+end;
					}
					if(toGroup){
						statement = addGroupStatement(id, statement);
					}
					
					sId++;
					return statement;
				
				}
	
	//checks for color and stroke settings of drawable and adds in necessary statements
	private static String checkDefaults(Drawable e, String id, String statement){
		if(!defaultFill(e.getFillColor())){
			statement += "\n"+fillStatement(id,e.getFillColor());
		}
		if(!defaultStroke(e.getStrokeColor())){
			statement += "\n"+strokeStatement(id,e.getFillColor());
		}
		if(!defaultWeight(e.getStrokeWeight())){
			statement += "\n"+weightStatement(id,e.getStrokeWeight());
		}
		if(!e.doFill()){
			statement+="\n"+noFillStatement(id);
		}
		if(!e.doStroke()){
			statement+="\n"+noStrokeStatement(id);
		}
		return statement;
		
	}
	
	private static String fillStatement(String id, Color col){
		String statement = "fill("+id+cm+col.r()+cm+col.g()+cm+col.b()+end;
		return statement;
	}
	
	private static String strokeStatement(String id, Color col){
		String statement = "stroke("+id+cm+col.r()+cm+col.g()+cm+col.b()+end;
		return statement;
	}
	
	
	private static String noFillStatement(String id){
		String statement = "noFill("+id+end;
		return statement;
	}
	
	private static String noStrokeStatement(String id){
		String statement = "noStroke("+id+end;
		return statement;
	}
	
	private static String weightStatement(String id, double w){
		String statement = "weight("+id+cm+w+end;
		return statement;
	}
	
	
	
	private static boolean defaultFill(Color c){
		if (c.r()!=255 && c.b()!=255 && c.g()!=255){
			return false;
		}
		else{
			return true;
		}
	}
	
	private static boolean defaultStroke(Color c){
		if (c.r()!=0 && c.b()!=0 && c.g()!=0){
			return false;
		}
		else{
			return true;
		}
	}
	//checks to see if drawable has default weight
	private static boolean defaultWeight(double w){
		if (w!=1){
			return false;
		}
		else{
			return true;
		}
	}
	
	//returns a clean string from a rounded double
	private static String roundNum(double n){
		return String.format("%.2f", n);
	}
	//returns function definition
	public String getFunctionDef(){
		return functionDef;
	}
	
	public void setFunctionDef(String def){
		functionDef = def;		
	}
	
	//returns function call
	public String getFunctionCall(){
		return functionCall;
	}
	
	public String getFunctionName() {
		// TODO Auto-generated method stub
		return functionName;
	}

	public String initGroup(){
		//System.out.println("init group statement");

		String statement = currentGroupId +"= group();";
		return statement;
	}
	
	public static String addGroupStatement(String id, String statement){
		//System.out.println("add group statement");
		String add =  "\nadd("+currentGroupId+cm+id+end;
		return statement+=add;
	}

	public void setFunctionCall(String name) {
		functionCall = name+"();";
		functionName = name;
		
	}

	
	
}
