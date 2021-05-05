import UIElements.MainInterface;
import processing.core.PApplet;

public class DigitalWorkspace extends PApplet {

    
    public static void main(String[] args) {
        PApplet.main("DigitalWorkspace");
    }

    MainInterface mainUI = new MainInterface(this);
    int backgroundColor = color(42, 45, 52);
    
    public void settings(){
        size(1920, 1080);
    }

    
    public void setup(){
        background(backgroundColor);
        stroke(255);
        strokeWeight(10);
    }

    public void draw(){
    	background(backgroundColor);
    	mainUI.draw();
    	mainUI.update();
    	
    	
    	
    	
    	
    	//Draw the mouse coords to screen for development purposes
    	
    	int x = mouseX;
    	int y = mouseY;
    	
    	textSize(32);
    	text("X: " + x, 10, height - 100);
    	text("Y: " +y, 10, height - 50);
    	
    	
    }
}