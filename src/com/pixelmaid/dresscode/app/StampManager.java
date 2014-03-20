package com.pixelmaid.dresscode.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.AbstractCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreePath;

import com.pixelmaid.dresscode.app.ui.ButtonCellRenderer;
import com.pixelmaid.dresscode.data.Stamp;
import com.pixelmaid.dresscode.events.CustomEvent;


public class StampManager extends ListManager {
	private String selectedNode;
	public StampManager(Color bg, Color fg){
		super(bg,fg);
		top = new DefaultMutableTreeNode("untitled");
		   // createNodes(top);
		tree = new JTree(top);
		tree.setLayout(new BorderLayout());
		tree.setRowHeight(20);
		tree.setEditable(true);
		tree.setCellRenderer(new ButtonCellRenderer(bg,fg));
	    tree.setCellEditor(new ButtonCellEditor());
		tree.setBackground(bg);
	        
	     // retrieve the HashMap of Default properties.
		 UIDefaults uiDefs = UIManager.getDefaults();
		 uiDefs.put("Tree.leftChildIndent" , new Integer( 0 ) );


	}
	
	public void addChild(Stamp s){
		String name = s.getFunctionName();
		//StampNode node=  new StampNode(name, "stamp" );
		DefaultMutableTreeNode child = new DefaultMutableTreeNode(name);
		top.add(child);
		tree.updateUI();
	}
	
	public void clearChildren(){
		top.removeAllChildren();
		DefaultTreeModel model = (DefaultTreeModel)tree.getModel();
		model.reload(top);
		tree.updateUI();
	}
	
	public void updateLabel(String label){
		this.top.setUserObject(label);
		tree.updateUI();
	}

	private void singleClick(String s) {
		selectedNode = s;
		System.out.println("top value:"+top.getUserObject().toString());
		if(selectedNode == (top.getUserObject()).toString()){
			this.fireToolEvent(CustomEvent.MAIN_SELECTED);		

		}
		else{
			this.fireToolEvent(CustomEvent.STAMP_SELECTED);		
		}
	}
	
	private void buttonClick(String s) {
		selectedNode = s;
		this.fireToolEvent(CustomEvent.STAMP_INSERTED);		
	}
	
	
	public String getSelectedNode(){
		return selectedNode;
	}
	
	
	public void selectMainNode(){
		this.tree.setSelectionRow(0);
	}
	
	
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
	    	
	  	  FlowLayout b = new FlowLayout();
	  	  b.setAlignment(FlowLayout.RIGHT);
	  	  b.setVgap(0);

	      b.setHgap(10);

	        panel = new JPanel(b);
	        button = new JButton("+");
	        button.setPreferredSize(new Dimension(15,15));

	        button.addMouseListener(this);
	        label = new JLabel();
	        label.setFont(new Font("Helvetica", Font.PLAIN, 12));
	        label.addMouseListener(this);
	        panel.add(button);
	        panel.add(label);
	    }

	    @Override public Object getCellEditorValue(){
	        return value.toString();
	    }
	    
	    public void removeButton(){
	       button.setVisible(false);
	    }


	    @Override public void actionPerformed(ActionEvent e){
	       
	        
	    }

	    @Override public Component getTreeCellEditorComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row){
	        this.value = value;
	        this.tree = tree;
	        label.setText(value.toString());
	        if(selected){
	     	 panel.setBackground(fg);
	        }
	        else{
	        	 panel.setBackground(bg);

	        }
	    
	        return panel;
	    }

	    @Override public void mouseClicked(MouseEvent e){
	    }

	    @Override public void mousePressed(MouseEvent e){
	        String val = value.toString();
	        stopCellEditing();
	        //tree.updateUI();
	    }

	    @Override public void mouseReleased(MouseEvent e){
	    	 String val = value.toString();
		        if(e.getSource()==button){
		        	buttonClick(val);
		        }
		        else if (e.getSource()==label){
			        singleClick(val);
		        }
		        stopCellEditing();
		      //  tree.updateUI();
	    
	    }

	    @Override public void mouseEntered(MouseEvent e){
	    }

	    @Override public void mouseExited(MouseEvent e){
	    	
	    }
	   
		
	}

}
