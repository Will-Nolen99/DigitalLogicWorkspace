package UIElements;

import processing.core.PApplet;
import processing.core.PVector;

public class MainInterface {

	private PApplet win;
	private Ribbon topRibbon;
	private Column leftColumn;
	
	public MainInterface(PApplet window) {
			this.win = window;
			this.topRibbon = new Ribbon(this.win, new PVector(0, 75));
			
			Button save = new Button(this.win, new PVector(10, 10), new PVector(50, 50));
			save.setName("Save");
			this.topRibbon.addButton(save);
			
			leftColumn = new Column(this.win, new PVector(200, 75));
			

			
	}
	
	public void draw() {
		
			this.leftColumn.draw();
			this.topRibbon.draw();
			
	}
	
	public void update() {
		
		this.leftColumn.update();
		this.topRibbon.update();
		
		
	}
}
	
	

