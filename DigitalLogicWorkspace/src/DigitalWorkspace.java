import UserInterface.MainUi;
import processing.core.PApplet;
import processing.core.PVector;

/*
 * Main class for the project. This class controls and displays the user's interaction to the window
 */
public class DigitalWorkspace extends PApplet {

	private MainUi ui = new MainUi();
    
    public static void main(String[] args) {
        PApplet.main("DigitalWorkspace");
    }

    
    /*
     * Ran once PApplet.main is called.
     * Contains and changes settings about the window as well as establish
     * some environment variables such as width and height.
     */
    public void settings(){
        size(1920, 1080);
    }


    /*
     * Ran once after PApplet.main is called and follows settings().
     * Contains initial conditions of the first draw of the window.
     */
    public void setup(){
        background(255);
        stroke(0);
        strokeWeight(10);
    }

    
    /*
     * Main draw loop. Begins running after setup() is called.
     * Runs continuously until program end.
     * A frame is drawn at the end of the loop.
     */
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
    	
    	
    	// Calls draw to the main UI class. The UI is in charge of distributing and  
    	// different stages of drawing 
    	this.ui.draw(this);
    	
    	

    }
    
    /*
     *  Method called when a mouse click is detected
     *  It calculates the coordinates and then passes the information to the
     *  UI class to do the processing.
     */
    public void mousePressed() {
    	
    	int x = mouseX;
    	int y = mouseY;
    	
    	this.ui.click(new PVector(x, y), this);
    	
    }
    
}