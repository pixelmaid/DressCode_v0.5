package com.pixelmaid.dresscode.drawing.math;

import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

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
					t= t.rotateWithFocus(theta*i+offset,t.getOrigin());
				}
				gridD.addToGroup(t);
	
		}
		gridD.moveTo(posX, posY);
		return gridD;
		
	}
	
	//returns a wave pattern of drawables
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
