package de.michaeldorner;

public class N extends Base {

	public N() {
		super(Type.N, Tags.N);
	}

	public void doN() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}
}
