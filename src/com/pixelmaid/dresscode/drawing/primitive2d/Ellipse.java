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


public class Ellipse extends Polygon {

    protected double width;
    protected double height;
    private double resolution = 100;
   
    

    public Ellipse(double x, double y) {
    	
    	this(x,y,DEFAULT_WIDTH,DEFAULT_WIDTH);
    }
    
	public Ellipse(double x, double y, double width, double height) {

		this(new Point(x,y), width, height);

    }
    
    public Ellipse(Point o, double width, double height) {
    
    	this.width = width;
        this.height = height;
        this.origin = o;
    	

    }
    
    @Override
    public Ellipse copy(){
    	Ellipse e = new Ellipse(0,0);
    	copyParameters(this,e);
    	e.width = this.width;
    	e.height = this.height;
    	return e;
    }


	@Override
    public void draw(Embedded e) {
		if(!this.getHide()){
			appearance(e);
		e.pushMatrix();
		e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
			 e.rotate((float)Math.toRadians(getRotation()));
		
			 e.scale((float)getScaleX(),(float)getScaleY());	
		e.ellipse(0,0,(float)width,(float)height);
		e.popMatrix();
		
		/*if(this.getDrawOrigin()){
			this.drawOrigin(e);
		}*/
		}
		
    }
	
	

	@Override
	public void print(Embedded e) {
		if(!this.getHide()){
		appearance(e);
		e.noFill();
		e.pushMatrix();
		e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		e.rotate((float)Math.toRadians(getRotation()));
		e.scale((float)getScaleX(),(float)getScaleY());
		e.ellipse(0,0,(float)width,(float)height);
		e.popMatrix();
		}
	}
	
	@Override
	//rotates around a focus. does not change the rotation property
	public Drawable rotateWithFocus(double theta, Point focus){
		Polygon p = this.toPolygon();
		return p.rotateWithFocus(theta, focus);	
	}	

	@Override
	//converts ellipse to polygon
	public Polygon toPolygon() {
		Polygon c =  new Polygon();
		copyParameters(this,c);
		double pR = (Math.PI*2)/resolution;
		double wR = width/2.0;
		double hR = height/2.0;
		for (int i = 0; i <= resolution; i++) {
			double t = pR*i;
			double x = wR* Math.cos(t);
			double y = hR* Math.sin(t);
			c.addPoint(x,y);

		}
	
		
		return c;
	}
	
	public double getWidth(){
		return this.width;
	}
	
	public double getHeight(){
		return this.height;
	
	}
	
	@Override
	public Drawable expand(){
		Polygon ep = this.toPolygon();
		return ep.expand();
	}
	
	@Override
	public Point pointAt(int i){
		Polygon poly = this.toPolygon();
		poly.setPointsAbsolute();
		
		Point p = poly.getPoints().get(i).copy();
		
		return p;
	}

}
