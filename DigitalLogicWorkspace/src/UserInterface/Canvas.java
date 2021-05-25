package UserInterface;

import java.util.ArrayList;

import Connections.Terminal;
import processing.core.PApplet;
import processing.core.PVector;

public class Canvas {

	ArrayList<Terminal> terminals = new ArrayList<Terminal>();
	
	public Canvas() {
		
	}
	
	public void draw(PApplet win) {
		
		for(Terminal t: this.terminals) {
			t.draw(win);
		}
		
	}
	
	public void update() {
		
	}
	
	
	public void click(PVector coords) {
		
		this.terminals.add(new Terminal(coords));
		
	}
	
	
	
}
