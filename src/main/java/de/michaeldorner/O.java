package de.michaeldorner;

public class O extends Base {

	public O() {
		super(Type.O, Tags.O);
	}

	public void doO() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}
}
