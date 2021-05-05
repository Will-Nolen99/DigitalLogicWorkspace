package UIElements;

import java.util.ArrayList;

import processing.core.PApplet;

public class Ribbon {
	
	private PApplet win;
	private ArrayList<Button> buttons;
	
		public Ribbon(PApplet window) {
			this.win = window;
			buttons = new ArrayList<Button>();
		}
	
		public void draw() {
			
			//draw the top ribbon section divider
			
			this.win.push();
			this.win.stroke(218, 223, 247);
			this.win.strokeWeight(5);
			this.win.line(0, this.win.height / 15, this.win.width, this.win.height/15);
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
