package UIElements;

import processing.core.PApplet;
import processing.core.PVector;

public class MainInterface {

	private PApplet win;
	private Ribbon topRibbon;
	
	public MainInterface(PApplet window) {
			this.win = window;
			this.topRibbon = new Ribbon(this.win);
			
			Button save = new Button(this.win, new PVector(10, 10), new PVector(100, 100));
			this.topRibbon.addButton(save);
			
			
			
			
	}
	
	public void draw() {
			this.topRibbon.draw();
	}
	
	public void update() {
		this.topRibbon.update();
		
	}
}
	
	

