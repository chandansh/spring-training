package com.test.model;

public class Model1 {
	public static int count;
	public Model1() {
		count++;
	}
	
	
	
	@Override
	public String toString() {
		return "this is model- 1 no ::" + count;
	}
}
