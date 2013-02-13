/*
 * Codeable Objects by Jennifer Jacobs is licensed under a Creative Commons Attribution-ShareAlike 3.0 Unported License.
 * Based on a work at hero-worship.com/portfolio/codeable-objects.
 *
 * This file is part of the Codeable Objects Framework.
 *
 *     Codeable Objects is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Codeable Objects is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Codeable Objects.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.pixelmaid.dresscode.drawing.primitive2d;

import java.util.ArrayList;

import processing.core.PApplet;

import com.pixelmaid.dresscode.app.Embedded;
import com.pixelmaid.dresscode.drawing.datatype.Point;


public class Ellipse extends Drawable implements DrawableInterface {

    private double width;
    private double height;
    private double resolution = 100;
   
    

    public Ellipse(double x, double y) {
    	
    	this(x,y,DEFAULT_WIDTH,DEFAULT_WIDTH);
    }
    
	public Ellipse(double x, double y, double width, double height) {

		this(new Point(x,y), width, height);
		System.out.println("original ellipse1="+x+","+y);

    }
    
    public Ellipse(Point o, double width, double height) {
    
    	this.width = width;
        this.height = height;
        this.origin = o;
    	System.out.println("original ellipse2="+getOrigin().getX()+","+getOrigin().getY());
    	System.out.println("original ellipse2="+origin.getX()+","+origin.getY());
        
		


    }
    
    
   
    
    public Ellipse copy(){
    	return new Ellipse(origin.getX(),origin.getY(),width,height);
    }


	@Override
    public void draw(Embedded e) {
		appearance(e);
		e.pushMatrix();
		e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		e.rotate(PApplet.radians((float)getRotation()));
		System.out.println("ellipse="+getOrigin().getX()+","+getOrigin().getY());
		e.ellipse(0,0,(float)width,(float)height);
		e.popMatrix();
		
		if(this.getDrawOrigin()){
			this.drawOrigin(e);
		}
		
    }

	@Override
	public void print(Embedded e) {
		// TODO Auto-generated method stub
		//parent.strokeWeight(strokeWeight);
		//parent.ellipse((float) origin.getX(), (float) origin.getY(), (float) radius * 2, (float) radius * 2);
		
	}


	@Override
	public void moveBy(double x, double y) {
		this.origin.setX(origin.getX()+x);
		this.origin.setY(origin.getY()+y);
		
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
	public ArrayList<Line> getAllLines() {
		ArrayList<Line>lines = new ArrayList<Line>();
		double lastX=0;
		double lastY=0;
		double pR = (Math.PI*2)/resolution;
		double wR = width/2.0;
		double hR = height/2.0;
		for (int i = 0; i <= resolution; i++) {
			double t = pR*i;
			double x = wR* Math.cos(t)+origin.getX();
			double y = hR* Math.sin(t)+origin.getY();

			if(i==0){
				lastX=x;
				lastY=y;
			}
			else{
				Line line = new Line(lastX,lastY,x,y);
				lines.add(line);
				lastX=x;
				lastY=y;
			}
		}
		return lines;
	}
	
	@Override
	//converts ellipse to polygon
	public Drawable toPolygon() {
		Polygon poly = new Polygon(this.origin.copy());
		double pR = (Math.PI*2)/resolution;
		double wR = width/2.0;
		double hR = height/2.0;
		
		for (int i = 0; i <= resolution; i++) {
			double t = pR*i;
			double x = wR* Math.cos(t);
			double y = hR* Math.sin(t);
			poly.addPoint(x,y);

		}
		
		return poly;
	}

}
