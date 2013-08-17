package com.pixelmaid.dresscode.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.media.nativewindow.util.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreePath;

import com.pixelmaid.dresscode.app.ui.ButtonCellEditor;
import com.pixelmaid.dresscode.app.ui.ButtonCellRenderer;
import com.pixelmaid.dresscode.data.Stamp;
import com.pixelmaid.dresscode.events.CustomEvent;


public class StampManager extends TreeManager {
	private StampNode selectedNode;
	public StampManager(){

		top = new DefaultMutableTreeNode("untitled");
		   // createNodes(top);
		tree = new JTree(top);
		
		MouseListener ml = new MouseAdapter() {
		     public void mousePressed(MouseEvent e) {
		         int selRow = tree.getRowForLocation(e.getX(), e.getY());
		         TreePath selPath = tree.getPathForLocation(e.getX(), e.getY());
		         if(selRow != -1) {
		             if(e.getClickCount() == 1) {
		                 //mySingleClick(selRow, selPath);
		             }
		             else if(e.getClickCount() == 2) {
		                doubleClick(selRow,selPath);
		             }
		         }
		     }
		 };
		// tree.addMouseListener(ml);
		
		tree.setLayout(new BorderLayout());
		tree.setRowHeight(20);
		tree.setEditable(true);
		 tree.setCellRenderer(new ButtonCellRenderer());
	        tree.setCellEditor(new ButtonCellEditor());
		// retrieve the HashMap of Default properties.
		 UIDefaults uiDefs = UIManager.getDefaults();
		 // now replace the one we want to change.
		 uiDefs.put("Tree.leftChildIndent" , new Integer( 0 ) );


	}
	
	public void addChild(Stamp s){
		String name = s.getFunctionName();
		//StampNode node=  new StampNode(name, "stamp" );
		DefaultMutableTreeNode child = new DefaultMutableTreeNode(name);
		top.add(child);
		tree.updateUI();
	}
	
	class StampTreeCellRenderer implements TreeCellRenderer {
        JLabel label;
        JPanel renderer;
        JButton button;
        DefaultTreeCellRenderer defaultRenderer = new DefaultTreeCellRenderer();

       public StampTreeCellRenderer() {
           renderer = new JPanel(); 
    	   label = new JLabel();
       
         
            button = new JButton("+");
            button.setEnabled(true);
            renderer.add(label);
            renderer.add(button);
            renderer.doLayout();
            
         
        }
 
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        	  if (selected) {
                  renderer.setBackground(Color.GRAY);
                } else {
                  renderer.setBackground(Color.WHITE);
                }
                renderer.setEnabled(tree.isEnabled());
              
               // returnValue = renderer;
              
        	Object o = ((DefaultMutableTreeNode) value).getUserObject();
            if (o instanceof StampNode) {
               StampNode stamp = (StampNode) o;                
               label.setIcon(new ImageIcon(stamp.getIcon()));
                label.setText(stamp.getName());
                 
                
            } else {
                label.setIcon(null);
                label.setText("" + value);
            }
          
          
            return renderer;
        }
    }
	
	
	
	
	private void doubleClick(int row, TreePath path){
		selectedNode = (StampNode)((DefaultMutableTreeNode)path.getLastPathComponent()).getUserObject();
		this.fireToolEvent(CustomEvent.STAMP_SELECTED);
		
		
		
	}
	
	public String getSelectedNode(){
		return selectedNode.getName();
	}

}
