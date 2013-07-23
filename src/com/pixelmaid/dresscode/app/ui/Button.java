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

package com.pixelmaid.dresscode.app.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;




public class Button extends JButton {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private boolean on;
    private boolean toggle = false;
   
    public Button() {
       super("test");
        //on = false;
        //this.addActionListener(target);
    }

    public void init(int width, int height, boolean on, boolean toggle, String name) {
     
       // this.setPreferredSize(new Dimension(width,height));
       
        //this.on = on;
        //this.toggle = toggle;
        this.setText(name);
        
        
       
    }
    
    @Override
    public void paintComponent(Graphics g){
    	this.paint(g);
    }
    
    public void setSize(int width, int height){
    	this.setPreferredSize(new Dimension(width,height));
    
    }
    
    public void setTip(String tip){
    	this.setToolTipText(tip);
    }
    
    //TODO: set up image
    public void setImage(){
    }

    
    
  

   /* public boolean checkForMousePress(float mouseX, float mouseY) {
        if (mouseX >= x && mouseX < x + width && mouseY > y && mouseY < y + height) {
            if (toggle) {
                if (on) {
                    on = false;
                } else {
                    on = true;
                }
            } else {
                on = true;
            }
        }
        return on;
    }*/


    public void setValue(boolean value) {
        on = value;
    }

    public boolean getValue() {
        return on;
    }


}
