import LogicGates.ANDGate; 
import UIElements.MainInterface;
import processing.core.PApplet;
import processing.core.PVector;

public class DigitalWorkspace extends PApplet {

    
    public static void main(String[] args) {
        PApplet.main("DigitalWorkspace");
    }

    MainInterface mainUI = new MainInterface(this);
    int backgroundColor = color(42, 45, 52);
    
    
    ANDGate and = new ANDGate();
    
    
    
    
    
    public void settings(){
        size(1920, 1080);
    }

    
    public void setup(){
        background(backgroundColor);
        stroke(255);
        strokeWeight(10);
        
        and.setCoords(new PVector(width/2, height/2));
        
    }

    public void draw(){
    	background(backgroundColor);
    	mainUI.draw();
    	mainUI.update();
    	
    	and.draw(this);
    	and.update(this);
    	
   
    	//Draw the mouse coords to screen for development purposes
    	
    	int x = mouseX;
    	int y = mouseY;
    	
    	textSize(32);
    	text("X: " + x, 10, height - 100);
    	text("Y: " +y, 10, height - 50);
    	
    	
    }
    
    public void mousePressed() {
    	and.clicked(this);
    	mainUI.clicked();
    }
    
}