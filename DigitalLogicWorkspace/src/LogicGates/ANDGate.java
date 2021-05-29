package LogicGates;

import Connections.Terminal;
import processing.core.PApplet;
import processing.core.PVector;

public class ANDGate implements LogicGate {

	private PVector coords;
	private Terminal input1;
	private Terminal input2;
	private Terminal output;
	
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
		win.stroke(0);
		win.noFill();
		
		//Outline of gate
		win.line(x, y, x, y + 50);
		win.line(x,  y + 50, x + 25, y + 50);
		win.arc(x + 25, y + 25, 50, 50, -PApplet.HALF_PI, PApplet.HALF_PI);
		win.line(x, y, x + 25, y);
		
		//terminal points
		
		//input
		win.line(x, y + 10, x - 15, y + 10);
		win.line(x, y + 40, x - 15, y + 40);
		
		//output
		win.line(x + 50, y+25, x + 65, y + 25);
		
		
		win.pop();
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
