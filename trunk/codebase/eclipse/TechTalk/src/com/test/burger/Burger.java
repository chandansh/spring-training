package com.test.burger;

public class Burger {
	public static int count;
	
	public Burger() {
		count++;
	}
	
	@Override
	public String toString() {
		return "burger :: " + count;
	}
}
