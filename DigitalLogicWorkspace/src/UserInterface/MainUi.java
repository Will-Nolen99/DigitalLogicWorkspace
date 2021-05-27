package UserInterface;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PVector;

public class MainUi {

	private Canvas canvas;
	
	
	public MainUi() {
		
		this.canvas = new Canvas();
		
	}
	
	public void update() {
		
	}
	
	public void draw(PApplet window) {
		
		this.canvas.draw(window);
		
	}
	
	public void click(PVector coords, PApplet window) {
		
		
		
		if(window.mouseButton == PConstants.LEFT) {
			this.canvas.leftClick(coords);
		}
		
		
	}
	
	
}
