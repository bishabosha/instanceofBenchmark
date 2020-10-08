package de.michaeldorner;

public abstract class Base {
	protected int i = 1;
	public final Type type;
	public final int tag;

	public Base(Type type, int tag) {
		this.type = type;
		this.tag = tag;
	}

	public abstract void doSomething();
}
