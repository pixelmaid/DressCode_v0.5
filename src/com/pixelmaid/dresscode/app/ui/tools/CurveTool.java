package com.pixelmaid.dresscode.app.ui.tools;


import java.util.ArrayList;

import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;
import com.pixelmaid.dresscode.drawing.primitive2d.Curve;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;

public class CurveTool extends Tool  {
	public ArrayList<Curve> curves;

	
	public CurveTool(){
		curves = new ArrayList<Curve>();
	}
	
	public void init(){
	
	}
	
	public void reset(){
		createdDrawable = null;
		curves = new ArrayList<Curve>();
		
	}
	
	@Override 
	public void setActive(boolean a){
		this.reset();
		active = a;
	}
	
	
	public void finishCurve(){
		this.fireToolEvent(CustomEvent.CURVE_ADDED);
		this.reset();
	}
	
	@Override
	public void mouseReleased(double mouseX, double mouseY, boolean special) {
		
	}
	
	@Override
	public void mousePressed(double mouseX, double mouseY, boolean special) {
		
			
		if(curves.size()==0){
			Curve c = new Curve(new Point(mouseX+4, mouseY+6),new Point(mouseX+4, mouseY+6),new Point(mouseX+4, mouseY+6),new Point(mouseX+4, mouseY+6));
			c.showControl=true;
			curves.add(c);
			this.fireToolEvent(CustomEvent.DRAWABLE_CREATED);
			}
		
		else{
			if(curves.get(curves.size()-1).open){

				curves.get(curves.size()-1).setEnd(mouseX+4, mouseY+6);
				Point mp = Geom.getMidpoint(curves.get(curves.size()-1).getStart(), curves.get(curves.size()-1).getEnd());
				curves.get(curves.size()-1).setControl2(mouseX+4, mouseY+6);
				curves.get(curves.size()-1).open=false;
			}
			else{
			Point lastEnd = curves.get(curves.size()-1).getEnd();
			Point lastControl = curves.get(curves.size()-1).getControl2();
		
			Point pC= oppositePoint(lastControl, lastEnd);
			Curve c = new Curve(lastEnd,pC,new Point(mouseX+4, mouseY+6),new Point(mouseX+4, mouseY+6));
			curves.get(curves.size()-1).showControl=false;
			curves.add(c);
			c.showControl=true;
			curves.get(curves.size()-1).open=false;
			this.fireToolEvent(CustomEvent.DRAWABLE_CREATED);
			}
		}

		
		

	
	
		this.fireToolEvent(CustomEvent.REDRAW_REQUEST);
		
	}
	
	@Override
	public void mouseDragged(double mouseX, double mouseY, boolean special) {
		if(curves.get(curves.size()-1).open){
			
			Point pC= oppositePoint(new Point(mouseX+4, mouseY+6), curves.get(curves.size()-1).getStart());
			curves.get(curves.size()-1).setControl1(pC.getX(),pC.getY());
			
		
		}
		else{
			
			Point pC= oppositePoint(new Point(mouseX+4, mouseY+6), curves.get(curves.size()-1).getEnd());
			curves.get(curves.size()-1).setControl2(pC.getX(),pC.getY());
			
			
			/*double[] polarE = Geom.cartToPolar(mousePos.getX()-endPoint.getX(), mousePos.getY()-endPoint.getY());
			double angle = polarE[1];
			double angle2 = angle+180;
			Point pE = Geom.polarToCart(polarE[0], angle2);
			double angle3 = angle2;
			
			Point pS = Geom.polarToCart(polarE[0], angle3);
			
			//((Curve)createdDrawable).setControl1(pS.getX()+startPoint.getX(), pS.getY()+startPoint.getY());

			((Curve)createdDrawable).setControl2(pE.getX()+endPoint.getX(), pE.getY()+endPoint.getY());
			((Curve)createdDrawable).setControl1(pE.getX()+endPoint.getX(), pE.getY()+endPoint.getY());

			System.out.println("angle ="+angle);*/
		}
			
			
							
			
			this.fireToolEvent(CustomEvent.REDRAW_REQUEST);
		
	
	}
	
	public Drawable getCreatedCurves(){
		if(curves.size()==1){
			return curves.get(0);
		}
		else{
			Drawable d = new Drawable();
			for(int i=0;i<curves.size();i++){
				d.add(curves.get(i));
			}
			return d;
		}
	}
	
	@Override
	public Drawable getCreated(){
		return this.curves.get(this.curves.size()-1);
	}
	
	
	public Point oppositePoint(Point start, Point origin){
		double[] polarE = Geom.cartToPolar(start.getX()-origin.getX(),start.getY()-origin.getY());
		double angle = polarE[1];
		double angle2 = angle+180;
		Point pE = Geom.polarToCart(polarE[0], angle2);
		return pE.add(origin);
	}

	
}
