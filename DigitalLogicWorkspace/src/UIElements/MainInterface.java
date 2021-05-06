package UIElements;

import LogicGates.ANDGate;
import LogicGates.LogicGate;
import processing.core.PApplet;
import processing.core.PVector;

public class MainInterface {

	private PApplet win;
	private Ribbon topRibbon;
	private Column leftColumn;
	private Workspace workspace;
	
	public MainInterface(PApplet window) {
			this.win = window;
			this.workspace = new Workspace(this.win);
			
			
			LogicGate and = new ANDGate();
			this.workspace.addGate(and);
			and.setCoords(new PVector(50, 50));
			
			LogicGate and2 = new ANDGate();
			this.workspace.addGate(and2);
			and2.setCoords(new PVector(570, 50));
			
			
			this.topRibbon = new Ribbon(this.win, new PVector(0, 75));
			
			Button save = new Button(this.win, new PVector(10, 10), new PVector(50, 50));
			save.setName("Save");
			this.topRibbon.addButton(save);
			
			leftColumn = new Column(this.win, new PVector(200, 75));
			

			
	}
	
	public void draw() {
		
			this.leftColumn.draw();
			this.topRibbon.draw();
			this.workspace.draw();
			
	}
	
	public void update() {
		
		this.leftColumn.update();
		this.topRibbon.update();
		this.workspace.update();
		
		
	}
	
	public void clicked() {
		
		this.workspace.clicked();
	}
	
}
	
	

