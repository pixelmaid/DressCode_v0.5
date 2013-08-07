package com.pixelmaid.dresscode.app.ui;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;



public class ImageButton  extends JButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ImageIcon oIcon;
	ImageIcon sIcon;
	 private boolean active = false;
	 public ImageButton(String title,String img,String tip, int width, int height) {
		 
		 this(new ImageIcon(ClassLoader.getSystemResource("com/pixelmaid/dresscode/resources/"+img+".png")),new ImageIcon(ClassLoader.getSystemResource("com/pixelmaid/dresscode/resources/"+img+"_s.png")),tip,width,height);
		  }

		  public ImageButton(ImageIcon icon,ImageIcon rolloverIcon, String tip,int width, int height) {
		    oIcon = icon;
		    sIcon = rolloverIcon;
			setIcon(oIcon);
		   //this.setBorder(new RoundedBorder(5,background));
		    this.setPreferredSize(new Dimension(width,height));
		    setMargin(new Insets(0, 0, 0, 0));
		    setIconTextGap(0);
		    setBorder(null);
		    setBorderPainted(false);
		    this.setOpaque(false);
		    this.setBackground(new Color(210,210,210));
		    setText(null);
		    setSize(icon.getImage().getWidth(null), icon.getImage().getHeight(null));
		    this.setToolTipText(tip);
		    //this.setBackground(background);
		  }
		  
		  public void setActive(){
			  this.setIcon(sIcon);
			  active = true;
		  }
		  
		  public void setInactive(){
			  this.setIcon(oIcon);
			  active = false;
		  }

		public boolean isActive() {
			return this.active;
		}

		
		  
		  
}
