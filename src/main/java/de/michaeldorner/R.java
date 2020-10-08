package de.michaeldorner;

public class R extends Base {

	public R() {
		super(Type.R, Tags.R);
	}

	public void doR() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}
}
