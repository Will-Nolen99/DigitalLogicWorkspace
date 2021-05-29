package UserInterface;

import java.util.ArrayList;

import Connections.Terminal;
import Connections.Wire;
import LogicGates.ANDGate;
import LogicGates.LogicGate;
import processing.core.PApplet;
import processing.core.PVector;

/*
 * Class used for the workspace portion of the UI. 
 * Provides functionality of moving and connecting components.
 */
public class Canvas {

	ArrayList<Terminal> terminals = new ArrayList<Terminal>();
	ArrayList<Wire> wires = new ArrayList<Wire>();
	ArrayList<LogicGate> gates = new ArrayList<LogicGate>();

	public Canvas() {
		this.gates.add(new ANDGate());
	}

	// Draws each of the components currently in the workspace to the screen
	public void draw(PApplet win) {
		
		for(LogicGate gate: this.gates) {
			gate.draw(win);
		}

		for (Terminal t : this.terminals) {
			t.draw(win);
		}

		for (Wire w : this.wires) {
			w.draw(win);
		}

	}

	public void update(PApplet win) {

		int x = win.mouseX;
		int y = win.mouseY;
		
		PVector coords = new PVector(x, y);
		
		for(Terminal t: this.terminals) {
			t.update(coords);
		}
		
	}

	public void leftClick(PVector coords) {

		boolean createTerminal = true;

		// See and gets if there is a current wire that is being created
		Wire currentWire = null;

		for (Wire w : this.wires) {
			if (w.getMaking()) {
				currentWire = w;
			}
		}

		// see if the user clicked on a terminal

		for (Terminal t : this.terminals) {

			if (t.isHovered()) {

				createTerminal = false;

				// Set the current wire's end position if a different terminal was clicked
				if (currentWire != null && !currentWire.getStart().equals(t)) {
					currentWire.setEnd(t);
					t.addWire(currentWire);
				} else if (currentWire == null) { 
					
					// TODO remove this double tested condition, removing the second
					// condition causes 2 wires to be built in the same location if the
					// same terminal is clicked twice in a row.
					
					Wire wire = new Wire(t);
					this.wires.add(wire);
					t.addWire(wire);
				}

			}

		}

		// if the user did not click on a terminal
		if (createTerminal) {
			Terminal t = new Terminal(coords);
			this.terminals.add(t);

			if (currentWire != null) {
				currentWire.setEnd(t);
				t.addWire(currentWire);
			} else {
				Wire w = new Wire(t);
				this.wires.add(w);
				t.addWire(w);
			}

		}

	}

	public void rightClick(PVector coords) {

		

		//Terminal and wire removal on right click
		for (int i = this.terminals.size() - 1; i >= 0; i--) {

			Terminal terminal = this.terminals.get(i);
			if (terminal.isHovered()) {
				
					for(int j = this.wires.size() - 1; j >= 0; j--) {
						Wire wire = this.wires.get(j);
						if(wire.getStart().equals(terminal) || wire.getEnd() == null || wire.getEnd().equals(terminal)) {
							this.wires.remove(wire);
						}
					}
					
					this.terminals.remove(terminal);

			}

		}
		
		
		

	}

}
