package com.test.number.factory;

public class NumberFactory {

	public static Number createNumber(int type){
		Number num = null;
		if(type == Number.COMPLEX)
			num = new ComplexNumber();
		if(type == Number.RATIONAL)
			num = new RationalNumber();
		return num;
	}
	
}
