package com.test.factory;

public class Factory {

	private Factory() {
	}
	
	public static Factory createFactoryObject(){
		System.out.println("invoking factory method..");
		
		return new Factory();
	}
	
	
	@Override
	public String toString() {
		return "this is factory Object";
	}
	
}
