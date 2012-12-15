package com.test.model;

public class Model {
	public static int count;
	public Model() {
		count++;
	}
	
	
	@Override
	public String toString() {
		return "this is model no : " + count;
	}
}
