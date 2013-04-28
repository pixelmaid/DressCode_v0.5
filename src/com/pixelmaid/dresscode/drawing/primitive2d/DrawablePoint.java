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


public class DrawablePoint extends Polygon {

    protected double x;
    protected double y;
   
    public DrawablePoint(double x, double y) {
    	
    	this.x = x;
    	this.y = y;
    	this.setOrigin(new Point(x,y));
    }
    
	
    
    @Override
    public DrawablePoint copy(){
    	DrawablePoint e = new DrawablePoint(this.x,this.y);
    	copyParameters(this,e);
    	
    	return e;
    }


	@Override
    public void draw(Embedded e) {
		if(!this.getHide()){
			appearance(e);
		e.pushMatrix();
		e.translate((float)(x),(float)(y));
			 e.rotate((float)Math.toRadians(getRotation()));
		
			 e.scale((float)getScaleX(),(float)getScaleY());	
		e.point(0,0);
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
			e.translate((float)(x),(float)(y));
				 e.rotate((float)Math.toRadians(getRotation()));
			
				 e.scale((float)getScaleX(),(float)getScaleY());	
			e.point(0,0);
			e.popMatrix();
		}
	}
	
	@Override
	//rotates around a focus. does not change the rotation property
	public Drawable rotateWithFocus(double theta, Point focus){
		this.origin = this.origin.rotate(theta, focus);
		this.x = origin.getX();
		this.y=origin.getY();
		return this;
	}	

	@Override
	//converts ellipse to polygon
	public Polygon toPolygon() {
		Ellipse e = new Ellipse(this.x,this.y,this.getStrokeWeight(), this.getStrokeWeight());
		Polygon c = e.toPolygon();
	
		
		return c;
	}
	
	public double getWidth(){
		return 0;
	}
	
	public double getHeight(){
		return 0;
	
	}
	
	@Override
	public Drawable expand(){
		Polygon ep = this.toPolygon();
		return ep.expand();
	}
	
	@Override
	public Point pointAt(int i){
		
		throw new RuntimeException("cannot access points of a point");
			
		
	}



	public double getX() {
		// TODO Auto-generated method stub
		return this.x;
	}
	public double getY() {
		// TODO Auto-generated method stub
		return this.y;
	}

}