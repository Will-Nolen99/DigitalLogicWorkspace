package Connections;

import processing.core.PApplet;
import processing.core.PVector;

public class Terminal {

	private PVector coords;
	private final int size = 15;
	
	public Terminal(PVector coords) {
		
		this.coords = coords;
		
	}
	
	
	
	public void draw(PApplet win) {
		
		win.push();
		
		win.stroke(0);
		win.strokeWeight(2);
		
		win.noFill()
;		
		win.circle(this.coords.x, this.coords.y, this.size);
		
		win.pop();
		
	}
	
	
	
	
}
