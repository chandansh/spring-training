package com.training;

import com.training.num.Number;
import com.training.num.NumberFactory;

public class FactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Number num1 = NumberFactory.createNewNumber(Number.COMPLEX, 4, 5);
		Number num2 = NumberFactory.createNewNumber(Number.COMPLEX, 6, 7);
		
		Number num3 = NumberFactory.createNewNumber(Number.RATIONAL, 3, 4);
		Number num4 = NumberFactory.createNewNumber(Number.RATIONAL, 8, 9);

		num1.display();
		num2.display();
		
		num3.display();
		num4.display();
		
		System.out.println("after adding num1 and num2::");
		Number num5 = num1.add(num2);
		num5.display();
		
		System.out.println("after adding num4 and num5::");
		Number num6 = num3.add(num4);
		num6.display();
		
	}
}
