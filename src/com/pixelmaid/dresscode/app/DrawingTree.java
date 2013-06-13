package com.pixelmaid.dresscode.app;

import java.awt.Color;
import java.net.URL;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreeSelectionModel;

public class DrawingTree extends JTree {

	public DrawingTree(){
		
		 //Create the nodes.
		
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("The Java Series");
        
 
        
        DefaultTreeModel model = new DefaultTreeModel(top);
        //Create a tree that allows one selection at a time.
        this.setModel(model);
       this.getSelectionModel().setSelectionMode (TreeSelectionModel.SINGLE_TREE_SELECTION);
       createNodes(top);
        //Listen for when the selection changes.
        //tree.addTreeSelectionListener(this);
 
       /* if (playWithLineStyle) {
            System.out.println("line style = " + lineStyle);
            tree.putClientProperty("JTree.lineStyle", lineStyle);
        }*/
      this.setBackground(new Color(0,0,0));
      System.out.println(this.getModel());
	}
	
	
	
	private void createNodes(DefaultMutableTreeNode top) {
        DefaultMutableTreeNode category = null;
        DefaultMutableTreeNode book = null;
 
        category = new DefaultMutableTreeNode("Books for Java Programmers");
        top.add(category);
 
        //original Tutorial
        book = new DefaultMutableTreeNode(new BookInfo
            ("The Java Tutorial: A Short Course on the Basics",
            "tutorial.html"));
        category.add(book);
 
        //Tutorial Continued
        book = new DefaultMutableTreeNode(new BookInfo
            ("The Java Tutorial Continued: The Rest of the JDK",
            "tutorialcont.html"));
        category.add(book);
 
        //JFC Swing Tutorial
        book = new DefaultMutableTreeNode(new BookInfo
            ("The JFC Swing Tutorial: A Guide to Constructing GUIs",
            "swingtutorial.html"));
        category.add(book);
 
        //Bloch
        book = new DefaultMutableTreeNode(new BookInfo
            ("Effective Java Programming Language Guide",
         "bloch.html"));
        category.add(book);
 
        //Arnold/Gosling
        book = new DefaultMutableTreeNode(new BookInfo
            ("The Java Programming Language", "arnold.html"));
        category.add(book);
 
        //Chan
        book = new DefaultMutableTreeNode(new BookInfo
            ("The Java Developers Almanac",
             "chan.html"));
        category.add(book);
 
        category = new DefaultMutableTreeNode("Books for Java Implementers");
        top.add(category);
 
        //VM
        book = new DefaultMutableTreeNode(new BookInfo
            ("The Java Virtual Machine Specification",
             "vm.html"));
        category.add(book);
 
        //Language Spec
        book = new DefaultMutableTreeNode(new BookInfo
            ("The Java Language Specification",
             "jls.html"));
        category.add(book);
    }
	
	private class BookInfo {
        public String bookName;
        public URL bookURL;
 
        public BookInfo(String book, String filename) {
            bookName = book;
           /* bookURL = getClass().getResource(filename);
            if (bookURL == null) {
                System.err.println("Couldn't find file: "
                                   + filename);
            }*/
        }
 
        public String toString() {
            return bookName;
        }
    }
	
}
