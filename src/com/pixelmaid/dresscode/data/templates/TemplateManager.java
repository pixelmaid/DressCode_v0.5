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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.swing.JFileChooser;

import processing.core.PGraphics;
import processing.core.PImage;

import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.app.Canvas;
import com.pixelmaid.dresscode.data.DrawableManager;
import com.pixelmaid.dresscode.data.InstructionManager;
import com.pixelmaid.dresscode.data.Stamp;
import com.pixelmaid.dresscode.drawing.math.UnitManager;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.EventSource;

public class TemplateManager extends EventSource{
	public static boolean patternLoaded = true;
	public static ArrayList<Template> templates = new ArrayList<Template>();
	private static HashMap<String,Template> templateKeys = new HashMap<String, Template>();
	public static NodeEvent e = new NodeEvent();
	private static int selected = 0;
	private static JFileChooser fc = new JFileChooser();
	private static String templateProgram="";
	private static String name = "untitled_template";
	private static String lastSelected ="";
	private static double width;
	private static double height;
	private TemplateManager(){
		throw new AssertionError();
	}
	
	public static void openPattern(Component component){
		System.out.println("open pattern file");
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
	
	public static Template checkIdChar(char n){
		if(templateKeys.containsKey(n)){
			return templateKeys.get(n);
		}
		return null;
	}
	
	public static ArrayList<String> getTemplateNames(){
		ArrayList<String> names = new ArrayList<String>();
		for(int i=0;i<templates.size();i++){
			names.add(templates.get(i).getName());
			
		}
		return names;
		
	}
	
	public static void clearAllTemplates(){
		if(templates.size()!=0){
			if(selected!=-1){
				lastSelected = templates.get(selected).getName();
			}
			else{
				lastSelected="";
			}
			templates.clear();
			templateKeys.clear();
		}
		
	}
	
	public static void addTemplate(Template t){
		if(!templateKeys.containsKey(t.GetNodeName())){
			templates.add(t);
			templateKeys.put(t.GetNodeName(), t);
			e.fireDrawableEvent(CustomEvent.TEMPLATE_CREATED,t);
		
		}
	}
	
	public static void removeTemplate(Template t){
		templates.remove(t);
		templateKeys.remove(t.GetNodeName());
	}
	
	public static void removeTemplateAt(int i){
		Template t = templates.remove(i);
		templateKeys.remove(t.GetNodeName());
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
			Template p = new Template(lines.get(i));
			p.setWidth(w);
			p.setHeight(h);
			p.setSeam(s);
			templates.add(p);
		}
		patternLoaded = true;	
	}

	public static void draw(Canvas canvas,  ArrayList<Drawable> d) {
		System.out.println("selected template ="+selected);
		if(templates.size()!=0){
			if(selected<templates.size()&&selected!=-1){
				templates.get(selected).draw(canvas,  d,false);
			}
			else if(selected==-1){
				for(int i=0;i<templates.size();i++){
					templates.get(i).draw(canvas, d,true);
				}
				
			}
		}
		
	}
	
	public static void print(PGraphics canvas, ArrayList<Drawable> d) {
			for(int i=0;i<templates.size();i++){
					templates.get(i).print(canvas, d,false);
			}
				
		
	}
	
	public static void setSelected(String name){
		if(name== "all templates"){
			selected=-1;
		}
		else{
		for(int i=0;i<templates.size();i++){
			if(templates.get(i).getName().matches(name)){
				selected = i;
				e.fireToolEvent(CustomEvent.TEMPLATE_SELECTED);
				break;
			}
		}
		}
		
	}

	
	public static int getSelected(){
		return selected;
	}
	public static void setTemplateCode(String c){
		templateProgram = c;
	}
	
	public static String getTemplateCode(){
		return templateProgram;
	}
	
	public static void setName(String c){
		name = c;
	}
	
	public static String getName(){
		return name;
	}
	
	public static void run(InstructionManager instructionManager, int units){

		instructionManager.parseText(templateProgram,units);
		if(lastSelected !=""){
			setSelected(lastSelected);
			
			
			
		}
		
		
	}

	public static void setWidth(double w) {
		width=w;
		
	}
	
	public static void setHeight(double h) {
		height=h;
		
	}
	
	public static double getWidth() {
		return width;
	}
	
	public static double getHeight() {
		return height;
		
	}
	
	
}
