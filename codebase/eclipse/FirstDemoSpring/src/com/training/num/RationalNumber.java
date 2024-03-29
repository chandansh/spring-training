package com.training.num;

public class RationalNumber implements Number {
	private int type;
	private int p, q;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
	}

	RationalNumber() {
		this.type = RATIONAL;
	}

	RationalNumber(int p, int q) {
		this();
		this.p = p;
		this.q = q;
	}

	@Override
	public void display() {
		System.out.println("Rational number Display :: " + p + "/" + q);

	}

	@Override
	public Number add(Number number) {
		RationalNumber newRational = null;
		if (number instanceof RationalNumber) {
			RationalNumber r = (RationalNumber) number;
			int x = this.p * r.q + this.q * r.p;
			int y = this.q * r.q;
			newRational = new RationalNumber(x, y);
		} else {
			System.out.println("provided number is not a rational number");
		}

		return newRational;
	}

	@Override
	public int getNumberType() {
		return type;
	}

}
