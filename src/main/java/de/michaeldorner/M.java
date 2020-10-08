package de.michaeldorner;

public class M extends Base {

	public M() {
		super(Type.M, Tags.M);
	}

	public void doM() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}
}
