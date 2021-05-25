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
	
	
	public void draw(PApplet win) {
		
		win.push();
		
		win.strokeWeight(5);
		win.stroke(0);
		
		
		if(this.making) {
			
			PVector startCoords = start.getCoords();
			
			int startX = (int) startCoords.x;
			int startY = (int) startCoords.y;
			
			int endX = win.mouseX;
			int endY = win.mouseY;
			
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
			
			

		}
		
		
		win.pop();
		
	}
	
	
	
}
