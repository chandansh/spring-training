package com.training.num;

public class NumberFactory {

	public static Number createNewNumber(int type) {
		Number num = null;
		if (Number.COMPLEX == type) {
			num = new ComplexNumber();
		} else if (Number.RATIONAL == type) {
			num = new RationalNumber();
		}
		return num;
	}

	public static Number createNewNumber(int type, int val1, int val2) {
		Number num = null;
		if (Number.COMPLEX == type) {
			num = new ComplexNumber(val1, val2);
		} else if (Number.RATIONAL == type) {
			num = new RationalNumber(val1, val2);
		}
		return num;
	}

}
