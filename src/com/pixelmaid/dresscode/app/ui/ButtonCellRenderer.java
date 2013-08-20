package com.pixelmaid.dresscode.app.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.TreeCellRenderer;

public class ButtonCellRenderer extends JPanel implements TreeCellRenderer
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button;
    JLabel label;
    JTree tree;
    Color bg;
    Color fg;

    public ButtonCellRenderer(Color bg, Color fg){
       
    	super();
    	this.bg = bg;
    	this.fg = fg;
    	 FlowLayout b = new FlowLayout();
	  	  b.setAlignment(FlowLayout.RIGHT);
	  	  b.setVgap(0);
	      b.setHgap(5);

	    this.setLayout(b);
        button = new JButton("+");
        button.setBackground(bg);
        button.setPreferredSize(new Dimension(15,15));
        label = new JLabel();
        label.setFont(new Font("Helvetica", Font.PLAIN, 12));
        
        add(button, BorderLayout.EAST);
        add(label);
    }

    @Override public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus){
        
    	
    	label.setText(value.toString());
       this.tree = tree;
       if(selected){
    	   this.setBackground(fg);
       }
       else{
    	   this.setBackground(bg);

       }
        return this;
    }
  

}