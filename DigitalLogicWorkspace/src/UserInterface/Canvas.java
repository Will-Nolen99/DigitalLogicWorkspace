package UserInterface;

import java.util.ArrayList;

import Connections.Terminal;
import Connections.Wire;
import processing.core.PApplet;
import processing.core.PVector;

public class Canvas {

	ArrayList<Terminal> terminals = new ArrayList<Terminal>();
	ArrayList<Wire> wires = new ArrayList<Wire>();
	
	public Canvas() {
		
	}
	
	public void draw(PApplet win) {
		
		for(Terminal t: this.terminals) {
			t.draw(win);
		}
		
		for(Wire w: this.wires) {
			w.draw(win);
		}
		
	}
	
	public void update() {
		
	}
	
	
	public void click(PVector coords) {
		
		Terminal t = new Terminal(coords);
		this.terminals.add(t);
		
		boolean makingWire = false;
		
		for(Wire w:this.wires) {
			
			if(w.getMaking()) {
				makingWire = true;
				w.setEnd(t);
			}
			
		}
		
		if(!makingWire) {
			Wire w = new Wire(t);
			this.wires.add(w);
		}

		
	}
	
	
	
}
