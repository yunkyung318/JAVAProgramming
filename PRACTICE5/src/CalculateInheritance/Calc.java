package CalculateInheritance;

abstract public class Calc {
	protected int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	abstract int Calculate();
}
