package com.pixelmaid.dresscode.app.ui;

//Imports
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.ListCellRenderer.*;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

public class ButtonCellRenderer extends JLabel implements	ListCellRenderer	
{
	private	ArrayList<ImageIcon> images;
	
	public ButtonCellRenderer()
	{
		setOpaque(true);
		this.setPreferredSize(new Dimension(140,32));
		this.setBackground(new Color(190,184,184));

		// Pre-load the graphics images to save time
		images = new ArrayList<ImageIcon>();
	
	}
  
	public void addImage(String name){
		images.add( new ImageIcon(name));
	}
	
	public Component getListCellRendererComponent(
			JList list, Object value, int index, 
			boolean isSelected, boolean cellHasFocus ) 
	{
		// Display the text for this item
		setText(value.toString());
		
		// Set the correct image
		setIcon( images.get(index) );
		  MatteBorder b = new MatteBorder(0,0,3,0,Color.white);
	        this.setBorder(b);       
		// Draw the correct colors and font
		if( isSelected )
		{
			// Set the color and font for a selected item
			setBackground( new Color(140,129,129) );
			setForeground( new Color(242,242,242));
			
			//setFont( new Font( "Roman", Font.BOLD, 24 ) );*/
		}
		else
		{
			this.setBackground(new Color(190,184,184));
			setForeground(Color.black);

			// Set the color and font for an unselected item
		/*	setBackground( Color.white );
			setForeground( Color.black );
			setFont( new Font( "Roman", Font.PLAIN, 12 ) );*/
		}

		return this;
	}
}