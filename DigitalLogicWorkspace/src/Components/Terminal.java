package Components;

import processing.core.PApplet;
import processing.core.PVector;

public class Terminal {

	
	private boolean state;
	private String type;
	private PVector coords;
	
	public Terminal(String type) {
		this.type = type;
	}
	
	public boolean getState() {
		return this.state;
	}
	
	public void setState(boolean state) {
		this.state = state;
	}
	
	public PVector getCoords() {
		return this.coords;
	}
	
	public void setCoords(PVector coords) {
		this.coords = coords;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	
	public boolean clicked(PApplet win) {
		
		int mx = win.mouseX;
		int my = win.mouseY;
		
		int x = (int) this.coords.x;
		int y = (int) this.coords.y;
		
		return 10 >= PApplet.dist(x, y, mx, my);
			

	}
	
	public String getType() {
		return this.type;
	}
	
	
	public void draw(PApplet win) {
		
		win.push();
		win.strokeWeight(2);
		win.noFill();
		
		if(this.state) {
			win.stroke(164, 48, 63);
		}else {
			win.stroke(218, 223, 247);
		}
		
		
		win.circle(coords.x, coords.y, 5);
		win.pop();
	}
	
	
	
	
	
}
