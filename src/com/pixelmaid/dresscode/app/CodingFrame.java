package com.pixelmaid.dresscode.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import com.pixelmaid.dresscode.app.ui.ConsoleToolbar;
import com.pixelmaid.dresscode.app.ui.Toolbar;
import com.pixelmaid.dresscode.app.ui.TreeToolbar;

public class CodingFrame extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CodeField codeField;
	private TreeManager drawingTree;
	public CodeField hiddenCodeField;
	private JSplitPane codeHolder;
	private JPanel hiddenCodeHolder;

	private Console output;
	private ConsoleToolbar consoleToolbar;
	private JPanel outputContainer;
	private JPanel codeContainer;
	private JPanel treeContainer;

	private int outputHeight = 200;
	private JScrollPane scrPane1,scrPane2,scrPane3;
	//private JTabbedPane codeTabs;
	private JSplitPane splitPane;

	private int width;
	private int height;
	
	public CodingFrame(){
		
	}
	
	 public void init(int w, int he, CodeField c, CodeField h, Console o, Toolbar t, JTree d, Color bg,Color sb, Color brdr){
		this.setBorder(null);
		BorderLayout layout = new BorderLayout();
		layout.setHgap(0);
		layout.setVgap(0);
		this.setLayout(layout);
		this.width=w;
		this.height=he;
		this.setMaximumSize(new Dimension(width,height));
		//codeTabs = new JTabbedPane();
		codeHolder = new JSplitPane();
		//codeHolder.setLayout(new BorderLayout());
		
		outputContainer = new JPanel();
		outputContainer.setLayout(new BorderLayout());
		
		codeContainer = new JPanel();
		codeContainer.setBorder(null);
		codeContainer.setLayout(new BorderLayout());
		
		treeContainer = new JPanel();
		treeContainer.setBorder(null);
		treeContainer.setLayout(new BorderLayout());
		//hiddeHolder = new JPanel();
		//codeHolder.setLayout(new BorderLayout());

		this.setPreferredSize(new Dimension(width,height));
		codeField= c;
		hiddenCodeField = h;
		codeField.setPreferredSize(new Dimension(width,height-outputHeight));
		hiddenCodeField.setPreferredSize(new Dimension(width,height-outputHeight));
		output = o;

		output.setPreferredSize(new Dimension(width,outputHeight));
		consoleToolbar = new ConsoleToolbar();
		consoleToolbar.init(width,25,bg,brdr);

		scrPane1 = new JScrollPane(codeField);
		
		scrPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrPane1.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
		scrPane1.getHorizontalScrollBar().setPreferredSize(new Dimension(0,10));
		scrPane1.setBorder(null);
		scrPane2 = new JScrollPane(output);
		scrPane2.setBorder(null);
		scrPane2.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));

		
		scrPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrPane3 = new JScrollPane(hiddenCodeField);

		output.setVisible(true);
		outputContainer.setVisible(true);
		outputContainer.setBorder(null);
	
		outputContainer.add(consoleToolbar, BorderLayout.PAGE_START);
		outputContainer.add(scrPane2, BorderLayout.CENTER);
		
		codeContainer.add(t, BorderLayout.PAGE_START);
		codeContainer.add(scrPane1);
		
		codeHolder.setOrientation(JSplitPane.VERTICAL_SPLIT );
		codeHolder.setTopComponent(codeContainer);
		codeHolder.setBottomComponent(outputContainer);
		codeHolder.setBorder(null);
		codeHolder.setDividerLocation(he-outputHeight-100);
		codeHolder.setDividerSize(2);
		codeHolder.setBackground(sb);
		//codeTabs.add(codeHolder, "untitled");
		//codeTabs.setPreferredSize(new Dimension(width-30,height));
		//codeTabs.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		//codeTabs.add(scrPane3 , "hidden");
		
		
		 //codeTabs.setEnabledAt(1, false);
		//Add the toolbar and the log to this panel.
		splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT );
		this.add(splitPane);
		splitPane.setRightComponent(codeHolder);
		splitPane.setBorder(null);
		splitPane.setDividerSize(2);
		splitPane.setBackground(sb);
		this.setBorder(null);
		//Create the scroll pane and add the tree to it. 
		
		
		JScrollPane treeView = new JScrollPane(d);
		treeView.setBorder(null);
		treeContainer.add(treeView,BorderLayout.CENTER);
		TreeToolbar tToolbar = new TreeToolbar();
		tToolbar.init(400, 10, bg,brdr);
		tToolbar.setMaximumSize(new Dimension(400,10));
		//treeContainer.add(tToolbar,BorderLayout.NORTH);
		
		splitPane.setLeftComponent(treeContainer);
		treeView.setMinimumSize(new Dimension(0,0));
		
			//this.add(t, BorderLayout.PAGE_START);
		this.add(splitPane,BorderLayout.CENTER);
		
		this.doLayout();
		splitPane.setDividerLocation(100);
		//splitPane.setEnabled( false );

		
		 
		
	}
	 
	public void setCode(String title,String code){
		codeField.setText(code);
		setTabTitle(0, title);
	}
	 
	 public void setTabTitle(int index, String title){
		//codeTabs.setTitleAt(index, title);
	 }
	 
	 public void showHiddenTab(String title, String code){
		hiddenCodeField.setText(code);
		//codeTabs.add(scrPane3 , "hidden");
		//codeTabs.setEnabledAt(1, true);
	 }
	 
	 public void hideHiddenTab(){
		 
		// codeTabs.remove(scrPane3);
		//if(//codeTabs.getTabCount()>1){
			//codeTabs.setEnabledAt(1, false);
		//}
			
	 }
	 
	/* public void showHiddenField(){
		 codeHolder.remove(scrPane1);
		 codeField.setPreferredSize(new Dimension(width,(height-outputHeight)/2-20));
		 hiddenCodeField.setPreferredSize(new Dimension(width,(height-outputHeight)/2-20));
		 codeHolder.add(scrPane1,BorderLayout.PAGE_START);
		 codeHolder.add(scrPane3,BorderLayout.CENTER);
		 codeHolder.doLayout();
		 this.doLayout();
	 }
	 
	 public void hideHiddenField(){
		 codeHolder.remove(scrPane1);
		 codeHolder.remove(scrPane3);
		 codeField.setPreferredSize(new Dimension(width,(height-outputHeight)));
		 codeHolder.add(scrPane1,BorderLayout.CENTER);
		 codeHolder.doLayout();
	 }*/
	
}
