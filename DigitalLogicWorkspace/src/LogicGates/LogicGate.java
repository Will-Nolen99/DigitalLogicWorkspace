package LogicGates;

import processing.core.PApplet;

abstract class LogicGate {

	protected boolean[] inputs;
	protected boolean[] outputs;
	
	public abstract void update(PApplet win);
	
	public abstract void draw(PApplet win);
	
	public boolean getOutput(int channel) {
		
		return outputs[channel];
		
	}
	
	public void setInput(int channel, boolean value) {
		inputs[channel] = value;
	}
	
	abstract void compute();



	
	
	
	
	
	
	
}
