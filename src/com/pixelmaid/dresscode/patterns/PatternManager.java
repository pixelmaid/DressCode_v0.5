/*PatternManager.java
 * Keeps track of an object pattern. 
 * Loads in data from a pattern info file and generates 
 * appropriate number of Piece instances. Draw method will draw pieces in pattern view
 */
package com.pixelmaid.dresscode.patterns;

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

public class PatternManager {
	public static boolean patternLoaded = true;
	public static ArrayList<Piece> pieces;
	private static int selected = 0;
	private static JFileChooser fc = new JFileChooser();
	private PatternManager(){
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
	
	public static ArrayList<String> getPieceNames(){
		ArrayList<String> names = new ArrayList<String>();
		for(int i=0;i<pieces.size();i++){
			names.add(pieces.get(i).getName());
			
		}
		return names;
		
	}
	
	public static void loadPattern(File path) throws IOException{
		pieces = new ArrayList<Piece>();
		 
		 
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
			Piece p = new Piece(w,h,s,lines.get(i));
			pieces.add(p);
		}
		patternLoaded = true;	
	}

	public static void draw(Canvas canvas, PImage design) {
		pieces.get(selected).draw(canvas, design);
		
	}
	
	public static void setSelected(String name){
		for(int i=0;i<pieces.size();i++){
			if(pieces.get(i).getName().matches(name)){
				selected = i;
				break;
			}
		}
	}

	
	
}
