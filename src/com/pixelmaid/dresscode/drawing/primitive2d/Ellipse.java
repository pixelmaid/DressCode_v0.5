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

import com.pixelmaid.dresscode.app.Embedded;
import com.pixelmaid.dresscode.drawing.datatype.DCHalfEdge;
import com.pixelmaid.dresscode.drawing.datatype.DoublyConnectedEdgeList;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

import javax.media.opengl.GL2;
import static javax.media.opengl.GL.*;  // GL constants
import static javax.media.opengl.GL2.*; // GL2 constants

public class Ellipse implements Comparable<Ellipse>,Drawable {

    public Point origin;
    public double radius;
    public DoublyConnectedEdgeList border;
    public int setColor;
    public boolean insideGrid = false;
    public boolean kept = false;
    public int numTouching = 0;
    public Vector<Ellipse> discsTouching;
    
    public int strokeWeight = 1;

    public Ellipse (ArrayList<Double> params){
    	if(params.size()==3){
    		 this.radius = params.get(2);
    	     this.origin = new Point(params.get(0),params.get(1));
    	     this.discsTouching = new Vector<Ellipse>();
    	}
    	else{
    		System.err.println("inccorect number of arguments for ellipse");
    	}
    }
 
	public Ellipse(double x, double y, double radius) {
        this.radius = radius;
        this.origin = new Point(x, y);
        this.discsTouching = new Vector<Ellipse>();


    }
    
    public Ellipse(Point origin, double radius) {
        this.radius = radius;
        this.origin = origin;
        this.discsTouching = new Vector<Ellipse>();


    }


    public boolean discOverlap(Ellipse disc) {
        double dist = Geom.distance(this.origin, disc.origin);
        if (dist < this.radius + disc.radius) {
            disc.numTouching++;
            this.numTouching++;
            disc.addTouching(this);
            this.addTouching(disc);
            return true;
        } else {
            return false;
        }

    }

    public void resetTouching() {
        this.discsTouching = new Vector<Ellipse>();
        numTouching = 0;

    }

    public void addTouching(Ellipse d) {
        this.discsTouching.addElement(d);
        Collections.sort(discsTouching, new DiscTouchInternal());

    }

    public boolean removeTouching(Ellipse d) {
        if (this.discsTouching.indexOf(d) != -1) {
            this.discsTouching.removeElement(d);
            numTouching--;
            return true;
        } else {
            return false;
        }


    }
    
    

    @Override
    public int compareTo(Ellipse disc) {
        if (this.discOverlap(disc)) {

            return 1;


        } else {
            return -1;
        }
    }


	@Override
    public void draw(Embedded gl) {
		gl.ellipse((float)origin.getX(),(float)origin.getY(),(float)radius,(float)radius);
	
    }

	
	public void print( float strokeWeight) {
		//parent.strokeWeight(strokeWeight);
		//parent.ellipse((float) origin.getX(), (float) origin.getY(), (float) radius * 2, (float) radius * 2);
		
	}
	
	public Ellipse copy(){
		return new Ellipse(this.origin.copy(),this.radius);
	}

}


class DiscTouchInternal implements Comparator<Ellipse> {
    public int compare(Ellipse a, Ellipse b) {
        return (a.numTouching < b.numTouching) ? -1 : (a.numTouching > b.numTouching) ? 1 : 0;
    }
}