package com.pixelmaid.dresscode.app.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.TreeCellEditor;

public class ButtonCellEditor extends AbstractCellEditor implements TreeCellEditor, ActionListener, MouseListener
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton button;
    private JLabel label;
    private JPanel panel;
    private Object value;
    private JTree tree;

    public ButtonCellEditor(){
    	
  	  BorderLayout b = new BorderLayout();
        b.setHgap(5);
       
        panel = new JPanel(b);
        button = new JButton("+");
        button.setPreferredSize(new Dimension(20,20));

        button.addActionListener(this);
        label = new JLabel();
        label.addMouseListener(this);
        panel.add(button, BorderLayout.EAST);
        panel.add(label);
    }

    @Override public Object getCellEditorValue(){
        return value.toString();
    }

    @Override public void actionPerformed(ActionEvent e){
        String val = value.toString();
        System.out.println("Pressed: " + val);
        stopCellEditing();
        tree.updateUI();
    }

    @Override public Component getTreeCellEditorComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row){
        this.value = value;
        this.tree = tree;
        label.setText(value.toString());
        if(selected){
     	 panel.setBackground(Color.LIGHT_GRAY);
        }
        else{
        	 panel.setBackground(Color.WHITE);

        }
    
        return panel;
    }

    @Override public void mouseClicked(MouseEvent e){
    }

    @Override public void mousePressed(MouseEvent e){
        String val = value.toString();
        System.out.println("Clicked: " + val);
        stopCellEditing();
        tree.updateUI();
    }

    @Override public void mouseReleased(MouseEvent e){
    }

    @Override public void mouseEntered(MouseEvent e){
    }

    @Override public void mouseExited(MouseEvent e){
    	
    }
    public void deSelect(){
    	panel.setBackground(Color.WHITE);
    }



	
}