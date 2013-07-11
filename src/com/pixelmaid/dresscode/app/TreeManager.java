package com.pixelmaid.dresscode.app;

import java.awt.Color;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreeSelectionModel;

import com.pixelmaid.dresscode.drawing.primitive2d.ComplexPolygon;
import com.pixelmaid.dresscode.drawing.primitive2d.Curve;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Ellipse;
import com.pixelmaid.dresscode.drawing.primitive2d.LShape;
import com.pixelmaid.dresscode.drawing.primitive2d.Line;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.pixelmaid.dresscode.drawing.primitive2d.Rectangle;

public class TreeManager {

	private JTree tree;
	private DefaultMutableTreeNode top;
	
	public TreeManager(){
		top = new DefaultMutableTreeNode("Scene");
		   // createNodes(top);
		tree = new JTree(top);
			  
		
		
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
		
		
		DefaultMutableTreeNode child = new DefaultMutableTreeNode(name);
		n.add(child);
		

		
		
		if(d.numChildren()!=0){
			for(int i=0;i<d.numChildren();i++){
				addChild(d.childAt(i),child);
			}
		}
		
	}
	
	public JTree getTree(){
		return this.tree;
	}
	
	
	
}
