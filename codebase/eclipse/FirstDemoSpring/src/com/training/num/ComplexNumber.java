package com.training.num;

public class ComplexNumber implements Number {
	private int type;
	private int r, i;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	ComplexNumber() {
		this.type = COMPLEX;
	}

	ComplexNumber(int r, int i) {
		this();
		this.r = r;
		this.i = i;
	}

	@Override
	public void display() {
		System.out.println("Complex number Display :: " + r + "+" + i + "i");

	}

	@Override
	public Number add(Number number) {
		ComplexNumber newComplex = null;
		if (number instanceof ComplexNumber) {
			ComplexNumber c = (ComplexNumber) number;
			int x = this.r + c.r;
			int y = this.i + c.i;
			newComplex = new ComplexNumber(x, y);
		} else {
			System.out.println("provided number is not a Complex number");
		}

		return newComplex;
	}

	@Override
	public int getNumberType() {
		return type;
	}

}
