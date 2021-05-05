package UIElements;

import processing.core.PApplet;
import processing.core.PVector;

public class Column {
	
	private PApplet win;
	PVector divider;
	
		public Column(PApplet window, PVector horizontalOffset) {
			this.win = window;
			this.divider = horizontalOffset;
		}
	
		public void draw() {
			
			this.win.push();
			this.win.stroke(218, 223, 247);
			this.win.strokeWeight(5);
			
			this.win.line(this.divider.x, this.divider.y, this.divider.x, this.win.height);
			
			this.win.pop();
			
		}
		
		public void update() {
			
		}
		

}