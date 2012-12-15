package com.test;

public class MyModel {
	public static int count;

	public MyModel() {
		count++;
	}
	
	@Override
	public String toString() {
		
		return "MyModel object :: " + count;
	}

}
