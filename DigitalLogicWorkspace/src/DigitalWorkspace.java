
import processing.core.PApplet;
import processing.core.PVector;

public class DigitalWorkspace extends PApplet {

    
    public static void main(String[] args) {
        PApplet.main("DigitalWorkspace");
    }


    
    

    
    
    
    
    
    public void settings(){
        size(1920, 1080);
    }

    
    public void setup(){
        background(255);
        stroke(255);
        strokeWeight(10);
        
      
        
    }

    public void draw(){
    	background(255);

    	
    	
   
    	//Draw the mouse coords to screen for development purposes
    	
    	int x = mouseX;
    	int y = mouseY;
    	
    	textSize(32);
    	text("X: " + x, 10, height - 100);
    	text("Y: " +y, 10, height - 50);
    	
    	
    }
    
    public void mousePressed() {
    	
    }
    
}