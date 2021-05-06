package Components;


import processing.core.PApplet;
import processing.core.PVector;

public class Wire {

	
	private Terminal input;
	private Terminal output;
	
	private boolean state;
	
	
	public Wire() {
		
	}
	
	public void creation(PApplet win) {
		
	}
	
	
	public void draw(PApplet win) {
		
		PVector inputCoords = this.input.getCoords();
		PVector outputCoords = this.output.getCoords();
		
		
		win.push();
		
		win.strokeWeight(5);
		
		if(this.state) {
			win.stroke(164, 48, 63);
		} else {
			win.stroke(200, 200, 200);
		}
		
		win.line(inputCoords.x, inputCoords.y, outputCoords.x, outputCoords.y);
		
		win.pop();
		
		
	}

	


	
}
