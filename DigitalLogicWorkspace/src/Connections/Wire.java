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
		
		win.strokeWeight(5);
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

			
			
			//draw the smaller line first
			if(deltaX < deltaY) {
				
				win.line(startX, startY, endX, startY);
				win.line(endX, startY, endX, endY);
				
			} else {
				
				win.line(startX, startY, startX, endY);
				win.line(startX, endY, endX, endY);
				
			}
			
			

		
		
		
		win.pop();
		
	}

	public Terminal getStart() {
		
		return this.start;
	}
	
	
	
}
