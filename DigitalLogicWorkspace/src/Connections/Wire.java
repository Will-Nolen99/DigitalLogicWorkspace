package Connections;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PVector;


/*
 * Class that represents wires used to connect components in the workspace
 */
public class Wire {

	private Terminal start;
	private Terminal end;
	
	private boolean making;
	
	ArrayList<PVector> points = new ArrayList<PVector>();
	
	
	public Wire(Terminal start) {
		this.start = start;
		this.making = true;
	}
	
	public boolean getMaking() {
		return this.making;
	}
	
	public void setEnd(Terminal end) {
		this.end = end;
		this.making = false;
	}
	
	public void draw(PApplet win) {
		
		win.push();
		
		win.strokeWeight(2);
		win.stroke(0);
		

			int endX;
			int endY;

			PVector startCoords = this.start.getCoords();
			
			int startX = (int) startCoords.x;
			int startY = (int) startCoords.y;
			
			// Get the correct end point for the wire depending on if it is created or not
			if(this.making) {
				endX = win.mouseX;
				endY = win.mouseY;
			} else {
				PVector endCoords = this.end.getCoords();
				endX = (int) endCoords.x;
				endY = (int) endCoords.y;
			}

			
			int deltaX = PApplet.abs(startX - endX);
			int deltaY = PApplet.abs(startY - endY);

			//Draw the 2 line segment wire depending on how the start and end point are located
			if (PApplet.abs(deltaX) < PApplet.abs(deltaY)) {
				
				if (endY - startY < 0) {
					deltaX = -deltaX;
				}

				win.line(startX, startY, startX, (endY - deltaX));
				win.line(startX, (endY - deltaX), endX, endY);

			} else {

				if (endX - startX < 0) {
					deltaY = -deltaY;
				}

				win.line(startX, startY, (endX - deltaY), startY);
				win.line((endX - deltaY), startY, endX, endY);

			}
			

		win.pop();
		
	}

	public Terminal getStart() {
		return this.start;
	}

	public Terminal getEnd() {
		return this.end;
	}
	
	
	
}
