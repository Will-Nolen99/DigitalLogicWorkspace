package UIElements;

import processing.core.PApplet;
import processing.core.PVector;

public class Button {

	private PApplet win;
	private PVector coords;
	private PVector size;
	boolean hovered;
	int[] primary = {255, 255, 255};
	int[] secondary = {0, 0, 0};
	
	public Button(PApplet window, PVector loc, PVector size) {
		this.win = window;
		this.coords = loc;
		this.size = size;
		
	}
	
	public void draw() {
		
		this.win.push();
		
		// Set the colors of the outline and the inside of the button
		this.win.stroke(this.secondary[0], this.secondary[1], this.secondary[2]);
		this.win.fill(this.primary[0], this.primary[1], this.primary[2]);
		
		this.win.strokeWeight(5);
		
		//draw the button to the screen
		this.win.rect(this.coords.x, this.coords.y, this.size.x, this.size.y);
		
		this.win.pop();
		
	}
	
	public void update() {
	
			int x = this.win.mouseX;
			int y = this.win.mouseY;
			
			this.hovered = x < this.coords.x + this.size.x && x > this.coords.x && y < this.coords.y + this.size.y && y > this.coords.y;
			
			System.out.println(this.hovered);
				
			
			
		
	}
	
	public void setPrimary(int[] color) {
		primary[0] = color[0];
		primary[1] = color[1];
		primary[2] = color[2];
	}
	
	public void setSecondary(int[] color) {
		secondary[0] = color[0];
		secondary[1] = color[1];
		secondary[2] = color[2];
	}
	
}
