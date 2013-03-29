package com.pixelmaid.dresscode.app;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.pixelmaid.dresscode.app.ui.Toolbar;

public class CodingFrame extends JPanel {
	private CodeField codeField;
	private Console output;
	private int outputHeight = 200;
	public CodingFrame(){
		
	}
	
	 public void init(int width, int height, CodeField c, Console o, Toolbar t){
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(width,height));
		codeField= c;
		codeField.setPreferredSize(new Dimension(width,height-outputHeight));
		
		output = o;

		output.setPreferredSize(new Dimension(width,outputHeight));

		JScrollPane scrPane1 = new JScrollPane(codeField);
		JScrollPane scrPane2 = new JScrollPane(output);


		output.setVisible(true);

		this.add(scrPane1, BorderLayout.CENTER);
		this.add(scrPane2, BorderLayout.PAGE_END);

		//Add the toolbar and the log to this panel.
		this.add(t, BorderLayout.PAGE_START);
		this.doLayout();
		
	}
	
}
