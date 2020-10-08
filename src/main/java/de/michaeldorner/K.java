package de.michaeldorner;

public class K extends Base {

	public K() {
		super(Type.K, Tags.K);
	}

	public void doK() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}
}
