package de.michaeldorner;

public class I extends Base {
	
	public I() {
		super(Type.I);
	}
	
	public boolean isI() {
		return true;
	}
	
	public void doI() {
		i = i * -1;
	}
	
	@Override
	public void doSomething() {
		i = i * -1;
	}
}
