package de.michaeldorner;

public class P extends Base {

	public P() {
		super(Type.P, Tags.P);
	}

	public void doP() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}
}
