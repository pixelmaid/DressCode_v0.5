package com.pixelmaid.dresscode.app;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JViewport;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import com.pixelmaid.dresscode.app.ui.ConsoleToolbar;
import com.pixelmaid.dresscode.app.ui.ImageButton;
import com.pixelmaid.dresscode.app.ui.Toolbar;
import com.pixelmaid.dresscode.app.ui.TreeToolbar;
import com.pixelmaid.dresscode.data.Stamp;

public class CodingFrame extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CodeField codeField;
	private ListManager drawingTree;
	private JSplitPane codeHolder;

	private Console output;
	private ConsoleToolbar consoleToolbar;
	private JPanel outputContainer;
	private JPanel codeContainer;
	private JPanel treeContainer;
	private JPanel cardContainer;

	private int outputHeight = 200;
	private JScrollPane scrPane1,scrPane2,scrPane3;
	//private JTabbedPane codeTabs;
	private JSplitPane splitPane;

	private int width;
	private int height;
	
	public CodingFrame(){
		
	}
	
	 public void init(int w, int he, CodeField c, Console o, Toolbar t, Component d, Color bg,Color sb, Color brdr, ImageButton clearButton){
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
		
		//hiddeHolder = new JPanel();
		//codeHolder.setLayout(new BorderLayout());

		this.setPreferredSize(new Dimension(width,height));
		codeField= c;
		codeField.setPreferredSize(new Dimension(width,height-outputHeight));
		output = o;

		output.setPreferredSize(new Dimension(width,outputHeight));
		consoleToolbar = new ConsoleToolbar();
		consoleToolbar.init(width,25,bg,brdr,clearButton);

		scrPane1 = new JScrollPane(codeField);
		cardContainer = new JPanel();
		cardContainer.setLayout( new CardLayout());
		cardContainer.add(scrPane1, "main");
		
		
		scrPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrPane1.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
		scrPane1.getHorizontalScrollBar().setPreferredSize(new Dimension(0,10));
		scrPane1.setBorder(null);
		scrPane2 = new JScrollPane(output);
		scrPane2.setBorder(null);
		scrPane2.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));

		
		scrPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		output.setVisible(true);
		outputContainer.setVisible(true);
		outputContainer.setBorder(null);
	
		outputContainer.add(consoleToolbar, BorderLayout.PAGE_START);
		outputContainer.add(scrPane2, BorderLayout.CENTER);
		
		codeContainer.add(t, BorderLayout.PAGE_START);
		codeContainer.add(cardContainer);
		
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
		
		
	
		
		
		splitPane.setLeftComponent(d);
		//treeView.setMinimumSize(new Dimension(0,0));
		
			//this.add(t, BorderLayout.PAGE_START);
		this.add(splitPane,BorderLayout.CENTER);
		
		this.doLayout();
		splitPane.setDividerLocation(100);
		//splitPane.setEnabled( false );

		
		 
		
	}
	 
	 public CodeField addCodeField(String id, String code, int fontSize){
		 CodeField c = new CodeField(id);
		 c.init(fontSize);
		 JScrollPane scrPane = new JScrollPane(c);
		 c.setText(code);
		scrPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrPane.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
		scrPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0,10));
		scrPane.setBorder(null);
		
		cardContainer.add(scrPane, id);
		return c;
			
			
		
	 }
	 
	/* public void removeCodeField(String id){
		 CardLayout cl = (CardLayout)(cardContainer.getLayout());
		 cl.removeLayoutComponent(comp)
		 //cl.removeLayoutComponent(
	
	 }*/
	 
	 public void switchCodeField(String id,int filterLength){
		
		getCurrentCard().stopFilter(); 
		 CardLayout cl = (CardLayout)(cardContainer.getLayout());
	     cl.show(cardContainer, id);
	     getCurrentCard().startFilter(filterLength);
	 }
	 
	 public CodeField getCurrentCard()
	 {
	     CodeField card = null;

	     for (Component comp : cardContainer.getComponents() ) {
	         if (comp.isVisible() == true) {
	             card = (CodeField)(((JViewport)((JScrollPane)(comp)).getComponent(0)).getView());
	        
	         }
	     }

	     return card;
	 }
	 
	 
	public void setCode(String code){
		codeField.loadFile(code);
		
	}
	 
	

	public String getStampCode(String stampName){
		for (Component comp : cardContainer.getComponents() ) {
		      
			CodeField card = (CodeField)(((JViewport)((JScrollPane)(comp)).getComponent(0)).getView());
			if(card.getId().matches(stampName)){
				return card.getCode();
			}
	             
	        
	     }
		return null;
	}
	 
	public String collectCode() {
		
		String parseCode = "";
		for (Component comp : cardContainer.getComponents() ) {
	      
			CodeField card = (CodeField)(((JViewport)((JScrollPane)(comp)).getComponent(0)).getView());
			if(card!= codeField){
				parseCode +="\n"+card.getCode();
			}
	             
	        
	     }

		
		
		parseCode = codeField.getCode()+parseCode;
		return parseCode;
	}
	
public void clearStamps() {
		
		String parseCode = "";
		for (Component comp : cardContainer.getComponents() ) {
	      
			CodeField card = (CodeField)(((JViewport)((JScrollPane)(comp)).getComponent(0)).getView());
			if(card!= codeField){
				cardContainer.remove(comp);
			}
	             
	        
	     }

	}
	 
	 
	
	
	 
	
}
