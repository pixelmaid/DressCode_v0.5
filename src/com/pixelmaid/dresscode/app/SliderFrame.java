package com.pixelmaid.dresscode.app;

import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SliderFrame extends javax.swing.JFrame{
	private JPanel content;
	private ArrayList<JSlider> sliders;
	private int sliderWidth = 70;
	private int sliderHeight = 45;
	private int width;
	private int height;
	public SliderFrame(){
		
	}
	
	public void init(int w, int h){
		width = w;
		height= h;
		sliders = new ArrayList<JSlider>();

		//setup window dimensions and appearance
				try {
					// System.setProperty("apple.laf.useScreenMenuBar", "true"); 
		            //System.setProperty("com.apple.mrj.application.apple.menu.about.name", "DressCode	");
		            System.setProperty("apple.awt.graphics.UseQuartz","true");
		            System.setProperty("apple.awt.graphics.EnableDeferredUpdates","true");

					 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());    
			        } catch (UnsupportedLookAndFeelException ex) {
			            ex.printStackTrace();
			        } catch (IllegalAccessException ex) {
			            ex.printStackTrace();
			        } catch (InstantiationException ex) {
			            ex.printStackTrace();
			        } catch (ClassNotFoundException ex) {
			            ex.printStackTrace();
			        }
				this.setPreferredSize(new Dimension(width,height));
				this.setSize(new Dimension(width,height));
				this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				this.setAlwaysOnTop(true);
				
				content = new JPanel();
				content.setPreferredSize(new Dimension(width,sliders.size()*sliderHeight));
				content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
				JScrollPane scrPane1 = new JScrollPane(content);
				
				scrPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
				scrPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
				scrPane1.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
				scrPane1.setBorder(null);
				
				
				this.add(scrPane1);


	}
	
	
	
	public JSlider addSlider(String name,double min, double max, double val){
		
		JSlider s = new JSlider(JSlider.HORIZONTAL,(int)min,(int)max,(int)val);
		
		s.setName(name);
		JLabel sliderLabel = new JLabel(name, JLabel.LEFT);
        sliderLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		sliders.add(s);
		content.add(sliderLabel);
		content.add(s);
		content.setPreferredSize(new Dimension(width,sliders.size()*sliderHeight));
		content.updateUI();
		return s;
		
		
	}
	
	
	public void clearAllSliders(){
		content.removeAll();
		sliders.clear();
		content.setPreferredSize(new Dimension(width,sliders.size()*sliderHeight));
		content.updateUI();
	}

}
