package UIElements;
import LogicGates.LogicGate;
import processing.core.PApplet;

import java.util.ArrayList;

public class Workspace {
	
	PApplet win;
	
	private ArrayList<LogicGate> gates = new ArrayList<LogicGate>();
	
	
	public Workspace(PApplet win) {
		this.win = win;
	}
	
	
	public void addGate(LogicGate gate) {
		this.gates.add(gate);
	}
	
	public void draw() {
		
		for(LogicGate gate: this.gates) {
			 gate.draw(this.win);
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
		
	}
	
	

}
