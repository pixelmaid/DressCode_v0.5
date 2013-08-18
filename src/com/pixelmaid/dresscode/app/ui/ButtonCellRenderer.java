package com.pixelmaid.dresscode.app.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

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

    public ButtonCellRenderer(){
       
    	super();
    	  BorderLayout b = new BorderLayout();
          b.setHgap(5);
          this.setLayout(b);
        button = new JButton("+");
        button.setPreferredSize(new Dimension(20,20));
        label = new JLabel();
      
        add(button, BorderLayout.EAST);
        add(label);
    }

    @Override public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus){
        label.setText(value.toString());
       this.tree = tree;
       if(selected){
    	   this.setBackground(Color.LIGHT_GRAY);
       }
       else{
    	   this.setBackground(Color.WHITE);

       }
        return this;
    }
    
    public void deSelect(){
    	this.setBackground(Color.WHITE);
    }


}