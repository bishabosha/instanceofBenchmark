package de.michaeldorner;

public class A extends Base {

	public A() {
		super(Type.A, Tags.A);
	}

	public void doA() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}
}
