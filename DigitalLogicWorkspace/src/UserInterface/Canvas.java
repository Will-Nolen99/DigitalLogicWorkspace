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

		for (Terminal t : this.terminals) {
			t.draw(win);
		}

		for (Wire w : this.wires) {
			w.draw(win);
		}

	}

	public void update() {

	}

	public void leftClick(PVector coords) {

		boolean createTerminal = true;
		
		
		//get the current wire being created 
		
		Wire currentWire = null;
		
		for(Wire w: this.wires) {
			if(w.getMaking()) {
				currentWire = w;
			}
		}
		
		
		// see if the user clicked on a terminal

		for (Terminal t: this.terminals) {
			
			PVector tCoords = t.getCoords();
			
			if(10 >= PApplet.dist(tCoords.x, tCoords.y, coords.x, coords.y)) {
				
				createTerminal = false;
				
				//terminal has been clicked on
				
				if(currentWire != null && !currentWire.getStart().equals(t)) {
					currentWire.setEnd(t);
				} else {
					Wire wire = new Wire(t);
					this.wires.add(wire);
				}
				
				
			}
			
		}
		
		
		// if the user did not click on a terminal
		if (createTerminal) {
			Terminal t = new Terminal(coords);
			this.terminals.add(t);

			if(currentWire != null) {
				currentWire.setEnd(t);
			} else {
				Wire w = new Wire(t);
				this.wires.add(w);
			}


		}

	}

}
