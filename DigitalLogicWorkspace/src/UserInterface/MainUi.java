package UserInterface;

import processing.core.PApplet;
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
	
	public void click(PVector coords) {
		this.canvas.click(coords);
	}
	
	
}
