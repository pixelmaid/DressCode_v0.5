package com.pixelmaid.dresscode.app;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;

import processing.core.PApplet;

public class SimFrame extends Frame {

    public SimFrame() {
        super("Embedded PApplet");

        setLayout(new BorderLayout());
        PApplet embed = new SimView();
        this.setSize(new Dimension(500,500));
        add(embed, BorderLayout.CENTER);
        this.setResizable(false);

        // important to call this whenever embedding a PApplet.
        // It ensures that the animation thread is started and
        // that other internal variables are properly set.
        embed.init();
        this.setVisible(true);
    }
}