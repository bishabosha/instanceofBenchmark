package de.michaeldorner;

public class J extends Base {

	public J() {
		super(Type.J, Tags.J);
	}

	public void doJ() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}
}
