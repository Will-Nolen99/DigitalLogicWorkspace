package Connections;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PVector;

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
	
	
	
}
