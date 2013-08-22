package com.pixelmaid.dresscode.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreeSelectionModel;

import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.ComplexPolygon;
import com.pixelmaid.dresscode.drawing.primitive2d.Curve;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.DrawablePoint;
import com.pixelmaid.dresscode.drawing.primitive2d.Ellipse;
import com.pixelmaid.dresscode.drawing.primitive2d.LShape;
import com.pixelmaid.dresscode.drawing.primitive2d.Line;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.pixelmaid.dresscode.drawing.primitive2d.Rectangle;
import com.pixelmaid.dresscode.events.CustomEvent;

public class TreeManager extends NodeEvent implements TreeSelectionListener {

	protected JTree tree;
	protected DefaultMutableTreeNode top;
	protected Color bg;
	protected Color fg;
	private Drawable selectedDrawable = null;
	
	public TreeManager(Color bg, Color fg){
		top = new DefaultMutableTreeNode("Scene");
		   // createNodes(top);
		tree = new JTree(top);
		 tree.setCellRenderer(new DrawingTreeCellRenderer());
		this.bg = bg;
		this.fg = fg;
		this.tree.setBackground(bg);
		tree.addTreeSelectionListener(this);

			  
		
		
	}
	
	
	public void getNodes(ArrayList<Drawable> drawables){
		top.removeAllChildren();
		for(int i=0;i<drawables.size();i++){
			addChild(drawables.get(i),top);
		}
		tree.updateUI();
		
	}
	
	private void addChild(Drawable d, DefaultMutableTreeNode n){
		String name = "drawable";
		if(!(d instanceof DrawablePoint)){
			
		
		if(d instanceof Ellipse){
			name = "ellipse";
		}
		else if(d instanceof Rectangle){
			name = "rectangle";
		}
		else if(d instanceof Line){
			name = "line";
		}
		else if(d instanceof Curve){
			name = "curve";
		}
		/*else if(d instanceof DrawablePoint){
			name = "point";
		}*/
		else if(d instanceof LShape){
			name = "import";
		}
		
		else if(d instanceof Polygon){
			if(((Polygon) d).isHole()){
				name = "hole";
			}
			else{
			name = "polygon";
			}
		}
		
		else if(d instanceof ComplexPolygon){
			name = "complex polygon";
		}
		
		if(d.getIdentifier()!=null){
		name = name+":"+d.getIdentifier();
		}
		if(d.getHide()){
			name = name+" (hidden)";
		}
		
		DrawableTreeObject dt = new DrawableTreeObject(d,name,d.getHide());
		DefaultMutableTreeNode child = new DefaultMutableTreeNode(dt);
		n.add(child);
		

		
		
		if(d.numChildren()!=0){
			for(int i=0;i<d.numChildren();i++){
				addChild(d.childAt(i),child);
			}
		}
		}
		
	}
	
	public JTree getTree(){
		return this.tree;
	}
	class DrawingTreeCellRenderer implements TreeCellRenderer {
        JLabel label;
        JPanel renderer;
       
        DefaultTreeCellRenderer defaultRenderer = new DefaultTreeCellRenderer();

       public DrawingTreeCellRenderer() {
           renderer = new JPanel(); 
    	   label = new JLabel();
    	   label.setHorizontalAlignment(SwingConstants.CENTER);
    	   label.setVerticalAlignment(SwingConstants.CENTER);
    	   renderer.setLayout(new BorderLayout());
            renderer.add(label, BorderLayout.CENTER);
            
           
           
            
         
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
            if (o instanceof  DrawableTreeObject) {
               DrawableTreeObject dt = (  DrawableTreeObject) o;                
              
                label.setText(dt.getName());
                 
                
            } else {
                label.setIcon(null);
                label.setText("" + value);
            }
          
          
            return renderer;
        }
    }
	
	class DrawableTreeObject {
		private Drawable drawable;
		private String name;
		private boolean hidden;
		public DrawableTreeObject(Drawable d, String n, boolean h){
			drawable = d;
			name = n;
			hidden = h;
			
		}
		
		
		private String getName(){
			return this.name;
		}
		private boolean getHidden(){
			return this.hidden;
		}
		private Drawable getDrawable(){
			return this.drawable;
		}
	
	}

	@Override
	  public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode node = (DefaultMutableTreeNode)
                           tree.getLastSelectedPathComponent();
        this.fireToolEvent(CustomEvent.DESELECT_ALL);

    /* if nothing is selected */ 
        if (node == null) return;

    /* retrieve the node that was selected */ 
        if (node.getUserObject() instanceof  DrawableTreeObject) {
        DrawableTreeObject nodeInfo = (DrawableTreeObject)node.getUserObject();
        Drawable d = nodeInfo.getDrawable();
        d.setSelected(true);
        this.selectedDrawable=d;
        this.fireToolEvent(CustomEvent.TREE_DRAWABLE_SELECTED);
        }
      
    /* React to the node selection. */
      
    
	}


	public Drawable getSelectedDrawable() {
		return this.selectedDrawable;
	}
	
	
}
