
import UserInterface.MainUi;
import processing.core.PApplet;
import processing.core.PVector;


public class DigitalWorkspace extends PApplet {

	private MainUi ui = new MainUi();
    
    public static void main(String[] args) {
        PApplet.main("DigitalWorkspace");
    }
    
    public void settings(){
        size(1920, 1080);
    }

    
    public void setup(){
        background(255);
        stroke(0);
        strokeWeight(10);
        
    }

    public void draw(){
    	background(255);
    	

    	//Draw the mouse coords to screen for development purposes
    	int x = mouseX;
    	int y = mouseY;
    	
    	stroke(0);
    	fill(0);
    	
    	textSize(32);
    	text("X: " + x, 10, height - 100);
    	text("Y: " +y, 10, height - 50);
    	
    	
    	
    	this.ui.draw(this);
    	
    	

    }
    
    public void mousePressed() {
    	
    	int x = mouseX;
    	int y = mouseY;
    	
    	this.ui.click(new PVector(x, y), this);
    	
    }
    
}