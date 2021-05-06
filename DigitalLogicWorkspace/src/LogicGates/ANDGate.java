package LogicGates;

import Components.Terminal;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PVector;

public class ANDGate extends LogicGate {

	
	private PVector coords;
	private boolean hovered;
	private boolean moving = false;
	private PVector mouseOffset = new PVector();
	private Terminal inputA = new Terminal("in");
	private Terminal inputB = new Terminal("in");
	private Terminal output = new Terminal("out");
	
	private int width = 50;
	
	
	
	public ANDGate() {
		outputs = new boolean[1];
		inputs = new boolean[2];
		
	}
	
	
	public void setCoords(PVector coords) {
		this.coords = coords;
		this.updateTerminals();
	}

	@Override
	public void update(PApplet win) {
		
		int mx = win.mouseX;
		int my = win.mouseY;
		
		int x = (int) this.coords.x;
		int y = (int) this.coords.y;
		
		this.hovered = mx > x && mx < x + this.width & my > y && my < y + this.width;
		
		
		if(this.moving) {
			
			this.coords.x = win.mouseX - this.mouseOffset.x;
			this.coords.y = win.mouseY - this.mouseOffset.y;
			
			this.moving = win.mousePressed;
			this.updateTerminals();
			
		}
		
		
	}
	
	private void updateTerminals() {
		
		int x = (int) this.coords.x;
		int y = (int) this.coords.y;
		
		int offset = this.width/3;
		
		
		
		this.inputA.setCoords(new PVector(x - 10, y + offset));
		this.inputB.setCoords(new PVector(x - 10, y + 2 *offset));
		this.output.setCoords(new PVector( x + this.width + 10, y + this.width /2));
		
	}


	public void clicked(PApplet win) {
		
		if(this.hovered && win.mouseButton == PConstants.LEFT) {
					
					this.moving = true;
					this.mouseOffset.x = win.mouseX - this.coords.x;
					this.mouseOffset.y = win.mouseY - this.coords.y;
					
					
					
					
				}
		
		
	}


	@Override
	public void draw(PApplet win) {
		int x = (int) this.coords.x;
		int y = (int) this.coords.y;
		
		win.push();
		
		if(this.hovered) {
			win.stroke(200);
		} else {
			win.stroke(255);
		}
		
		
		win.strokeWeight(2);
		win.noFill();
		
		// Draw body of and gate
		win.line(x, y, x + this.width/2, y);
		win.line(x,  y, x, y + this.width);
		win.line(x, y + this.width, x + this.width/2, y + this.width);
		win.arc(x + this.width/2, y + this.width/2, this.width, this.width, -PConstants.HALF_PI, PConstants.HALF_PI);
		
		//draw terminals of and gate
		int offset = this.width/3;
		
		//input
		win.line(x, y + offset, x - 10, y + offset);
		win.line(x, y + 2 * offset, x - 10, y + 2 * offset);
		
		//output
		win.line(x+ this.width, y + this.width/2, x + this.width + 10, y + this.width /2);
		
		
		
		win.pop();
		
		this.inputA.draw(win);
		this.inputB.draw(win);
		this.output.draw(win);
		
		
	}

	@Override
	void compute() {
		outputs[0] = inputs[0] && inputs[1];
	}



}
