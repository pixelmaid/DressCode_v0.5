package com.pixelmaid.dresscode.app.ui.usercreated;

import java.math.BigDecimal;

import com.pixelmaid.dresscode.drawing.math.Basic;
import com.pixelmaid.dresscode.drawing.math.Geom;
import com.pixelmaid.dresscode.events.CustomEvent;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PGraphics;

public class Slider extends UserUI {

    private double x;
    private double y;
    private double width;
    private double height;
    private double value;
    private double minTarget;
    private double maxTarget;
    private boolean selected;
    private String name;
    private String units;
    
    public Slider() {
        x = 0;
        y = 0;
        width = 0;
        height = 0;
        value = 0;
        minTarget = 0;
        maxTarget = 0;
        selected = false;
        value = 0.5;
        
   
    }

    public void init(double x, double y, double width, double height, double v, double minT, double maxT, String name, String units) {
        this.x = 100;
        this.y = 100;
        this.width = width;
        this.height = height;
        this.value = Basic.map(v, minT, maxT, 0, 1);
        this.minTarget = minT;
        this.maxTarget = maxT;
        this.name = name;
        this.units= units;
    }
@Override
    public void draw(PApplet myParent) {
        myParent.noFill();
        myParent.strokeWeight(2);
        myParent.stroke(255, 255, 255);
        myParent.rectMode(myParent.CORNER);
        myParent.rect((float)x, (float)y, (float)width, (float)height);
        if (selected) {


            myParent.fill(255, 255, 0);
        } else myParent.fill(255, 0, 0);
        myParent.noStroke();
        double sliderWidth = Basic.map(value, 0, 1, 0, width - 2);
        myParent.rectMode(myParent.CORNER);

        myParent.rect((float)(x + 1), (float)(y + 1), (float)sliderWidth, (float)(height - 2));

        myParent.fill(255);

       myParent.text(name, (float)x, (float)(y + height + 15));
        myParent.fill(255, 255, 0);
        myParent.text(Double.toString(Geom.round(getSliderValue(),2,BigDecimal.ROUND_HALF_UP))+units, (float)(x+width+10), (float)(y+height/2+7));
        myParent.rectMode(myParent.CENTER);

    }
@Override
    public boolean checkForMousePress(double mouseX, double mouseY) {
        if (mouseX >= x && mouseX < x + width && mouseY > y && mouseY < y + height) {
            selected = true;
        } else selected = false;
        return selected;
    }


@Override
    public boolean checkForMouseDrag(double mouseX, double mouseY) {
        if (selected && mouseX >= x && mouseX < x + width) {
            value = Basic.map(mouseX, x, x + width, 0, 1);
            this.fireUIModifedEvent(this, CustomEvent.UI_MODIFIED);
            return true;
            
        }
        return false;
    }

    public double getSliderValue() {
        return Basic.map(value, 0, 1, minTarget, maxTarget);
    }

    public void setSliderValue(double val) {
        value = Basic.map(val, minTarget, maxTarget, 0, 1);
    }

	

}
