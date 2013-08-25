package com.pixelmaid.dresscode.data;

import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

public class DynamicStamp extends Stamp {

	
	public void setCode(String fName, String code){
		this.setFunctionCall(fName);
		
		this.setFunctionDefFromSelection(code);
	
	}
	
	private void setFunctionDefFromSelection(String code){
		String def = functionStart+this.getFunctionName()+functionMiddle+"\n"+initGroup()+code+"\n"+returnStatement+"\n"+functionEnd;
		this.setFunctionDef(def);
	}
}
