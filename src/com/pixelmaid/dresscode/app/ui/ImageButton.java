package com.pixelmaid.dresscode.app.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class ImageButton  extends JButton {
	 private Color background = new Color(140,130,129);
	 public ImageButton(String title,String img,String tip, int width, int height) {
		 
		 this(new ImageIcon(ClassLoader.getSystemResource("com/pixelmaid/dresscode/resources/"+img)),tip,width,height);
		  }

		  public ImageButton(ImageIcon icon,String tip,int width, int height) {
		    setIcon(icon);
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
		  
}
