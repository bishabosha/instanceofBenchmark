package de.michaeldorner;

public class L extends Base {

	public L() {
		super(Type.L, Tags.L);
	}

	public void doL() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}
}
