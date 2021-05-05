package LogicGates;

import processing.core.PVector;

abstract class LogicGate {

	private String type;
	private boolean[] inputs;
	private boolean[] outputs;
	private PVector coords;
	private boolean hovered;
	
	public abstract void update();
	
	public abstract void draw();
	
	public boolean getOutput(int channel) {
		
		return outputs[channel];
		
	}
	
	public void setInput(int channel, boolean value) {
		inputs[channel] = value;
	}
	
	abstract void compute();
	
	
	
	
	
	
	
}
