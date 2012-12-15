package com.test.app;

import com.test.number.factory.ComplexNumber;
import com.test.number.factory.Number;
import com.test.number.factory.NumberFactory;
import com.test.number.factory.RationalNumber;

public class FactoryDemo {

	public static void main(String[] args) {

		ComplexNumber comNum = (ComplexNumber) NumberFactory.createNumber(Number.COMPLEX);
		System.out.println(comNum);
		
		
		RationalNumber ratNum = (RationalNumber) NumberFactory.createNumber(Number.RATIONAL);
		System.out.println(ratNum);
	}

}
