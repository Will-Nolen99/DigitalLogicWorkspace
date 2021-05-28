package UserInterface;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PVector;


/*
 * Class used to contain and organize each of the UI sections and elements in the project.
 */
public class MainUi {

	private Canvas canvas;
	
	
	public MainUi() {
		this.canvas = new Canvas();
	}
	
	
	public void update() {
		
	}
	
	/*
	 * Draws each of the ui elements to the screen.
	 * Breaks the drawing process up so that the correct 
	 * drawing order is easier to visualize and change.
	 */
	public void draw(PApplet window) {
		
		this.canvas.draw(window);
		
	}
	
	
	/*
	 * Method called when the window is clicked.
	 * Calculates what type of click and what part of the ui was clicked.
	 * Calls the corresponding click method of the element that was clicked.
	 */
	public void click(PVector coords, PApplet window) {
		
		if(window.mouseButton == PConstants.LEFT) {
			this.canvas.leftClick(coords);
		} else if (window.mouseButton == PConstants.RIGHT) {
			this.canvas.rightClick(coords);
		} else {
			//TODO add other click functionality
		}
		
		
	}
	
	
}
