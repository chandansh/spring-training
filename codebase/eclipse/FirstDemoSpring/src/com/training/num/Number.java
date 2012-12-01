package com.training.num;

public interface Number {
	public static final int RATIONAL = 1;
	public static final int COMPLEX = 2;
		
	public void display();
	public Number add(Number number);
	public int getNumberType();
}
