package Connections;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PVector;

public class Terminal {

	private PVector coords;
	public final static int size = 15;
	private ArrayList<Wire> connections;
	boolean hovered = false;
	
	
	public Terminal(PVector coords) {
		
		this.coords = coords;
		this.connections = new ArrayList<Wire>();
		
	}
	
	
	
	public void draw(PApplet win) {
		
		win.push();
		
		if(this.hovered) {
			win.stroke(180, 30, 30);
		} else {
			win.stroke(0);
		}
		
		win.strokeWeight(2);
		
		win.noFill()
;		
		win.circle(this.coords.x, this.coords.y, Terminal.size);
		
		win.pop();
		
	}

    public void addWire(Wire wire) {
    	this.connections.add(wire);
    }

	public PVector getCoords() {
		return this.coords;
	}
	
	@Override
	public boolean equals(Object t) {
		
		if(t.getClass() == this.getClass()) {
			
		return ((Terminal) t).getCoords().equals(this.coords);
		
		}
	
		return false;
		
	}
	
	public boolean isHovered() {
		return this.hovered;
	}



	public void update(PVector coords) {
		
		if(Terminal.size / 2.0 >= PApplet.dist(coords.x, coords.y, this.coords.x, this.coords.y)) {
			this.hovered = true;
		} else {
			this.hovered = false;
		}
		
	}
	
	
	
	
}
