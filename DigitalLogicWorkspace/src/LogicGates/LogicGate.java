package LogicGates;

import processing.core.PApplet;
import processing.core.PVector;

public interface LogicGate {

	public boolean calculate();
    public void draw(PApplet win);
    public void update(PVector coords);
    
}
