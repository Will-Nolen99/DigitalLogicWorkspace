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
			
			for(Button btn: this.buttons) {
				btn.draw();
			}
			
		}
		
		public void update() {
			
			
		}
		
		public void addButton(Button button) {
			this.buttons.add(button);
		}
	
}
