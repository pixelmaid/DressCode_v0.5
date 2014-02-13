/*PatternManager.java
 * Keeps track of an object pattern. 
 * Loads in data from a pattern info file and generates 
 * appropriate number of Piece instances. Draw method will draw pieces in pattern view
 */
package com.pixelmaid.dresscode.data.templates;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;

import processing.core.PImage;

import com.pixelmaid.dresscode.app.Canvas;
import com.pixelmaid.dresscode.drawing.math.UnitManager;

public class TemplateManager {
	public static boolean patternLoaded = true;
	public static ArrayList<Template> templates = new ArrayList<Template>();
	private static int selected = 0;
	private static JFileChooser fc = new JFileChooser();
	private TemplateManager(){
		throw new AssertionError();
	}
	
	public static void openPattern(Component component){
		System.out.println("open patternfile");
		int returnVal = JFileChooser.CANCEL_OPTION;
		returnVal = fc.showOpenDialog(component);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			try {
				loadPattern(fc.getSelectedFile());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static ArrayList<String> getTemplateNames(){
		ArrayList<String> names = new ArrayList<String>();
		for(int i=0;i<templates.size();i++){
			names.add(templates.get(i).getName());
			
		}
		return names;
		
	}
	
	public static void clearAllTemplates(){
		templates.clear();
		
	}
	
	public static void addTemplate(Template t){
		templates.add(t);
	}
	
	public static void removeTemplate(Template t){
		templates.remove(t);
	}
	
	public static void removeTemplateAt(int i){
		templates.remove(i);
	}
	
	public static void loadPattern(File path) throws IOException{
		templates = new ArrayList<Template>();
		 
		 
		ArrayList<String> lines = new ArrayList<String>();
		final BufferedReader br = new BufferedReader(new FileReader(path));
		String line;
		
		try {
			while ((line = br.readLine()) != null) {
			  lines.add(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<lines.size()-3;i+=4){
			double w = UnitManager.toPixels(Double.parseDouble(lines.get(i+1)),1);
			double h = UnitManager.toPixels(Double.parseDouble(lines.get(i+2)),1);
			double s = UnitManager.toPixels(Double.parseDouble(lines.get(i+3)),1);
			Template p = new Template(w,h,s,lines.get(i));
			templates.add(p);
		}
		patternLoaded = true;	
	}

	public static void draw(Canvas canvas, PImage design) {
		templates.get(selected).draw(canvas, design);
		
	}
	
	public static void setSelected(String name){
		for(int i=0;i<templates.size();i++){
			if(templates.get(i).getName().matches(name)){
				selected = i;
				break;
			}
		}
	}

	
	
}
