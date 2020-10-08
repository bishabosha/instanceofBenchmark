package de.michaeldorner;

public class Q extends Base {

	public Q() {
		super(Type.Q, Tags.Q);
	}

	public void doQ() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}
}
