package com.pixelmaid.dresscode.app;

import java.net.URL;

public class StampNode {
    private String name;
    private URL icon;

   StampNode(String name) {
        this.name = name;
       // this.icon = ClassLoader.getSystemResource("com/pixelmaid/dresscode/resources/"+icon+".png");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
    	   this.icon = ClassLoader.getSystemResource("com/pixelmaid/dresscode/resources/"+icon);
    }
}