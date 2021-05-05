package UIElements;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PVector;

public class Ribbon {
	
	private PApplet win;
	private ArrayList<Button> buttons;
	PVector divider;
	
		public Ribbon(PApplet window, PVector verticalOffset) {
			this.win = window;
			buttons = new ArrayList<Button>();
		    this.divider = verticalOffset;
		}
	
		public void draw() {
			
			//draw the top ribbon section divider
			
			this.win.push();
			this.win.stroke(218, 223, 247);
			this.win.strokeWeight(5);
			this.win.line(this.divider.x, this.divider.y, this.win.width, this.divider.y);
			
			this.win.pop();
			
			for(Button btn: this.buttons) {
				btn.draw();
			}
			
		}
		
		public void update() {
			
			for(Button btn: this.buttons) {
				btn.update();
			}
			
		}
		
		public void addButton(Button button) {
			this.buttons.add(button);
		}
	
}
