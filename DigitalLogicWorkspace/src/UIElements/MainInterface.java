package UIElements;

import processing.core.PApplet;

public class MainInterface {

	private PApplet win;
	private Ribbon topRibbon;
	
	public MainInterface(PApplet window) {
			this.win = window;
			this.topRibbon = new Ribbon(this.win);
	}
	
	public void draw() {
			this.topRibbon.draw();
	}
	
	public void update() {
		
		
	}
}
	
	

