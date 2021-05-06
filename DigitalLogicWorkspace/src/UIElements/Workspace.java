package UIElements;
import LogicGates.LogicGate;
import processing.core.PApplet;

import java.util.ArrayList;

import Components.Terminal;
import Components.Wire;

public class Workspace {
	
	PApplet win;
	
	private ArrayList<LogicGate> gates = new ArrayList<LogicGate>();
	private ArrayList<Wire> wires = new ArrayList<Wire>();
	private ArrayList<Terminal> terminals = new ArrayList<Terminal>();
	
	private boolean makingWire = false;
	private Wire newWire;
	
	
	public Workspace(PApplet win) {
		this.win = win;
	}
	
	
	public void addGate(LogicGate gate) {
		this.gates.add(gate);
		
		ArrayList<Terminal> gateTerminals = gate.getTerminals();
		
		this.terminals.addAll(gateTerminals);
		
		
	}
	
	public void draw() {
		
		for(LogicGate gate: this.gates) {
			 gate.draw(this.win);
		}
		
		for(Wire wire: wires) {
			wire.draw(this.win);
		}
		
	}
	
	public void update() {
		
		for(LogicGate gate: this.gates) {
			 gate.update(this.win);
		}
		
		
		
	}
	
	public void clicked() {
		
		for(LogicGate gate: this.gates) {
			 gate.clicked(this.win);
		}
		
		for(Terminal terminal: this.terminals) {
			if(terminal.clicked(win)) {
				System.out.println("clicked terminal");
				
				if(this.makingWire) {
					newWire.connect(terminal);
					this.makingWire = false;
					wires.add(newWire);
					
				} else {
				
				newWire = new Wire(terminal);
				this.makingWire = true;
				}
				
				
			}
		}
		
		
	}
	
	

}
