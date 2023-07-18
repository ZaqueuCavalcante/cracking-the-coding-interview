package com.ctci;

import processing.core.PApplet;

public class Q001C01_01 extends PApplet {
    private int screenWidth = 800;
    private int screenHeight = 800;

    private int bgColor = 100;

    public void settings() {
        size(screenWidth, screenHeight);
    }

    public void draw() {
        background(bgColor);
        fill(255);
        stroke(0);
    }

    public void keyPressed() {
        if (keyCode == 10) { // Enter
            bgColor = (int) (Math.random() * 255);
        }
    }
}
