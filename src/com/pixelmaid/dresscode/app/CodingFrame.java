package com.pixelmaid.dresscode.app;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import com.pixelmaid.dresscode.app.ui.Toolbar;

public class CodingFrame extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CodeField codeField;
	private CodeField hiddenCodeField;
	private JPanel codeHolder;
	private JPanel hiddenCodeHolder;

	private Console output;
	private int outputHeight = 200;
	private JScrollPane scrPane1,scrPane2,scrPane3;
	private JTabbedPane codeTabs;

	private int width;
	private int height;
	
	public CodingFrame(){
		
	}
	
	 public void init(int w, int he, CodeField c, CodeField h, Console o, Toolbar t){
		this.setLayout(new BorderLayout());
		this.width=w;
		this.height=he;
		this.setMaximumSize(new Dimension(width,height));
		codeTabs = new JTabbedPane();
		codeHolder = new JPanel();
		codeHolder.setLayout(new BorderLayout());
		
		//hiddeHolder = new JPanel();
		//codeHolder.setLayout(new BorderLayout());

		this.setPreferredSize(new Dimension(width,height));
		codeField= c;
		hiddenCodeField = h;
		codeField.setPreferredSize(new Dimension(width,height-outputHeight));
		hiddenCodeField.setPreferredSize(new Dimension(width,height-outputHeight));
		output = o;

		output.setPreferredSize(new Dimension(width,outputHeight));

		scrPane1 = new JScrollPane(codeField);
		scrPane2 = new JScrollPane(output);
		scrPane3 = new JScrollPane(hiddenCodeField);

		output.setVisible(true);

		
		codeHolder.add(scrPane1, BorderLayout.CENTER);
		codeHolder.add(scrPane2, BorderLayout.PAGE_END);
		codeTabs.add(codeHolder, "untitled");
		codeTabs.setPreferredSize(new Dimension(width-30,height));
		codeTabs.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		//codeTabs.add(scrPane3 , "hidden");
		
		
		 //codeTabs.setEnabledAt(1, false);
		//Add the toolbar and the log to this panel.
			this.add(t, BorderLayout.PAGE_START);
		this.add(codeTabs,BorderLayout.CENTER);
	
		this.doLayout();

		
		 
		
	}
	 
	public void setCode(String title,String code){
		codeField.setText(code);
		setTabTitle(0, title);
	}
	 
	 public void setTabTitle(int index, String title){
		codeTabs.setTitleAt(index, title);
	 }
	 
	 public void showHiddenTab(String title, String code){
		hiddenCodeField.setText(code);
		codeTabs.add(scrPane3 , "hidden");
		codeTabs.setEnabledAt(1, true);
	 }
	 
	 public void hideHiddenTab(){
		 
		 codeTabs.remove(scrPane3);
		if(codeTabs.getTabCount()>1){
			codeTabs.setEnabledAt(1, false);
		}
			
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
