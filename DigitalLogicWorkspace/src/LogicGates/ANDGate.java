package LogicGates;

import Connections.Terminal;
import processing.core.PApplet;
import processing.core.PVector;

public class ANDGate implements LogicGate {

	private PVector coords;
	private Terminal input1;
	private Terminal input2;
	private Terminal output;
	
	private boolean hovered;
	
	static int width = 50;
	
	public ANDGate() {
		
		this.coords = new PVector(500, 500);
		
	}
	
	
	
	@Override
	public boolean calculate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void draw(PApplet win) {
		
		int x = (int) this.coords.x;
		int y = (int) this.coords.y;
		
		win.push();
		
		win.strokeWeight(2);
		
		if (this.hovered) {
			win.stroke(125, 30, 30);
		} else {
			win.stroke(0);
		}

		win.noFill();
		
		//Outline of gate
		win.line(x, y, x, y + ANDGate.width);
		win.line(x,  y + ANDGate.width, x + ANDGate.width / 2, y + ANDGate.width);
		win.arc(x + ANDGate.width / 2, y + ANDGate.width / 2, ANDGate.width, ANDGate.width, -PApplet.HALF_PI, PApplet.HALF_PI);
		win.line(x, y, x + ANDGate.width / 2, y);
		
		//terminal points
		
		//input
		win.line(x, y + 10, x - 15, y + 10);
		win.line(x, y + 40, x - 15, y + 40);
		
		//output
		win.line(x + 50, y+25, x + 65, y + 25);
		
		
		win.pop();
		
	}

	@Override
	public void update(PVector mouse) {
		
		int x = (int) this.coords.x;
		int y = (int) this.coords.y;
		
		this.hovered = mouse.x > x && mouse.x < x + ANDGate.width && mouse.y > y && mouse.y < y + ANDGate.width;
		
		
		
		
	}

}
