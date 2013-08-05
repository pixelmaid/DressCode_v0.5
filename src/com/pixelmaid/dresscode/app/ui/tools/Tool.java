package com.pixelmaid.dresscode.app.ui.tools;

public class Tool extends ToolEvent{
	protected String cursorImage;
	protected boolean active = false;
	
	public String getImage(){
		return cursorImage;
		
	}
	
	public void setImage(String cImage){
		cursorImage = cImage;
		
	}
	
	public boolean isActive(){
		return active;
	}
	
	public void setActive(boolean a){
		active =a;
	}

	public void mousePressed(int mouseX, int mouseY) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(int mouseX, int mouseY) {
		// TODO Auto-generated method stub
		
	}

	public void mouseDragged(int mouseX, int mouseY) {
		// TODO Auto-generated method stub
		
	}
	
	
}
