package com.pixelmaid.dresscode.drawing.math;

import java.util.ArrayList;

import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Curve;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;

public class Pattern {

	//returns a grid pattern of drawables
	public static Drawable grid(Drawable target, int rowNum, int colNum, double gapX, double gapY,double posX,double posY){
		Drawable gridD = new Drawable();
		
		for(int i=0;i<rowNum;i++){
			for(int j=0;j<colNum;j++){
				Drawable t = target.copy();
				t.moveTo(i*gapX, j*gapY);
				gridD.addToGroup(t);
			}
		}
		gridD.moveTo(posX, posY);
		return gridD;
	}
	
	public static Drawable arc(Drawable target, int dNum, double width,double height, double degree,double offset, boolean rotate,double posX,double posY){
		Drawable gridD = new Drawable();
		double theta = degree/(dNum-1);
		
		
		for(int i=0;i<dNum;i++){
			double pX = Math.cos(Math.toRadians(theta*i+offset))*width/2;
			double pY = Math.sin(Math.toRadians(theta*i+offset))*height/2;
				Drawable t = target.copy();
				t.moveTo(pX,pY);
				if(rotate){
				
						t= t.rotateWithFocus(theta*i+offset,t.getOrigin(),true);
					
				}
				gridD.addToGroup(t);
	
		}
		gridD.moveTo(posX, posY);
		return gridD;
		
	}
	public static Drawable wave(Drawable target, int dNum, double amp,double freq, double width, double posX,double posY,double phase){
		Drawable waveD = new Drawable();	


		double vDUpdate = (360.0/dNum)*freq;

		double dist = width/dNum;
		Point [] points = new Point[dNum];
		for(int i=0;i<dNum;i++){
			double dY = Math.sin(Math.toRadians(vDUpdate*i))*amp;
			double dX = dist*i;
			//hD = hD+dDistStep;
			//vD = vD+vDUpdate;
			points[i] = new Point(dX,dY);

		}

		//points = optimize(points,amp,freq);

		for(int i=0;i<points.length;i++){
			Drawable t2 = target.copy();
			t2.moveTo(points[i].getX(), points[i].getY());
			t2.setFillColor(255,255,255);
			waveD.addToGroup(t2);

		}

		waveD.moveTo(posX, posY);
		return waveD;
	}
	
	public static ArrayList<Point> curvesToPoints(Drawable curveGroup, int dNum){
		ArrayList<Point> curvePoints = new ArrayList<Point>();	
		if(curveGroup.numChildren()>0){
			
			//curveGroup = curveGroup.flatten(true, curveGroup);
			
			ArrayList<Drawable> curves = curveGroup.getChildren();	
			double totalLength =0;
			for(int i=0;i<curves.size();i++){
				if(curves.get(i) instanceof Curve){
				
					double l = ((Curve)curves.get(i)).length();
					totalLength+=l;
				}
			}
			double pointDist = totalLength/1;
			for(int i=0;i<curves.size();i++){
				if(curves.get(i) instanceof Curve){
					Curve c = (Curve)curves.get(i);
					int cNum = (int)Math.ceil(c.length()/pointDist);
					
					ArrayList<Point> cPoints;
					if(i==curves.size()-1){
						cPoints = c.toPoints(cNum,true);
					}
					else{
						cPoints = c.toPoints(cNum,false);
					}
					curvePoints.addAll(cPoints);
				}
			}
		}
			
			return curvePoints;
					
		
		
	}
	
	public static Drawable followCurve(Drawable target, Drawable curveGroup, int dNum, boolean doAngle){
		Drawable curveD = new Drawable();

		if(curveGroup.numChildren()>0){
			
			//curveGroup = curveGroup.flatten(true, curveGroup);
			
			ArrayList<Drawable> curves = curveGroup.getChildren();	
			double totalLength =0;
			for(int i=0;i<curves.size();i++){
				if(curves.get(i) instanceof Curve){
				
					double l = ((Curve)curves.get(i)).length();
					totalLength+=l;
				}
			}
			double pointDist = totalLength/dNum;
			for(int i=0;i<curves.size();i++){
				Point lastPoint = null;
				if(curves.get(i) instanceof Curve){
					Curve c = (Curve)curves.get(i);
					int cNum = (int)Math.round(c.length()/pointDist);
					
					ArrayList<Point> cPoints;
					if(i==curves.size()-1){
						cPoints = c.toPoints(cNum,true);
					}
					else{
						cPoints = c.toPoints(cNum,false);
					}
				
					for(int j=0;j<cPoints.size();j++){
						Drawable tc = target.copy();
						
						if(doAngle){
							double angle=0;
							if(lastPoint!=null){
								 angle = Geom.angleBetweenPoints(lastPoint,cPoints.get(j));
								
							}
							else{
								 angle = Geom.angleBetweenPoints(cPoints.get(j),cPoints.get(j+1));
							}
							tc = tc.rotateWithFocus(angle,tc.getOrigin(),true);		
						}
						lastPoint = cPoints.get(j);
						
						tc.moveTo(cPoints.get(j).getX()+curveGroup.getX(),cPoints.get(j).getY()+curveGroup.getY());
						curveD.addToGroup(tc);
					}
				}
			}
		}
		return curveD;
	}

	//returns a wave pattern of drawables
	/*	public static Drawable wave(Drawable target, int dNum, double amp,double freq, double width, double posX,double posY,double phase){
			Drawable waveD = new Drawable();	
			double dist = width/100;
			double vDUpdate = (360.0/100)*freq;
			double waveLength=0;
			Point [] points = new Point[100];
			for(int i=0;i<100;i++){
				double dY = Math.sin(Math.toRadians(vDUpdate*i))*amp;
				double dX = dist*i;
				//hD = hD+dDistStep;
				//vD = vD+vDUpdate;
				points[i] = new Point(dX,dY);
				if(i!=0){
				waveLength+=points[i].distance(points[i-1]);
				}
				
			}
			
			double w;
			if(target.getWidth()<target.getHeight()){
			
			w= target.getWidth()/2;
			}
			else{
				w= target.getHeight()/2;
			}
			double n = Math.round(waveLength/w);
			//dNum = ((Double)(n)).intValue();
			
			 dist = width/dNum;
			 vDUpdate = (360.0/dNum)*freq;
			
			
			//points = optimize(points,amp,freq);
			
			for(int i=0;i<dNum;i++){
				double dY = Math.sin(Math.toRadians(vDUpdate*i))*amp;
				double dX = dist*i;
				//hD = hD+dDistStep;
				//vD = vD+vDUpdate;
				
				Drawable t2 = target.copy();
				t2.moveTo(dX, dY);
				t2.setFillColor(255,255,255);
				waveD.addToGroup(t2);
			
			}
			
			waveD.moveTo(posX, posY);
			return waveD;
		}
		*/
		public static Point[] optimize(Point[] points, double amp, double freq){
			int iterLimit = 10000;
			int iterNum = 0;
			double moveConst = 0.1;
			double error = 0;
			double lastError = 0.01 ;
			
			while(true){
				//System.out.println("\\n\\n////////////Optimize////////////");
				for(int i=1;i<points.length-1;i++){
					double d1 = points[i].distance(points[i-1]);
					double d2 = points[i].distance(points[i+1]);
					//System.out.println("error at i="+Math.abs(d1-d2));
					error = error+Math.abs(d1-d2);
					
					if(d1>d2){
						double dX = points[i].getX()-moveConst;
						double dY = Math.sin(Math.toRadians(dX*freq))*amp;
					
						points[i].setX(dX);
						points[i].setY(dY);
					}
					else{
						double dX = points[i].getX()+moveConst;
						double dY = Math.sin(Math.toRadians(dX*freq))*amp;
						points[i].setX(dX);
						points[i].setY(dY);
						
					}
					
					//System.out.println("error at i="+Math.abs(d1-d2));
					//error = error+Math.abs(d1-d2);
				
				}
				//System.out.println("total error ="+ error);
				error = error/points.length;
				if(error<lastError){
					break;
				}
				error =0;
				iterNum++;
				if(iterNum>=iterLimit){
					break;
				}
			}
			
			
			
			return points;
			
			
		
		}
	
}
