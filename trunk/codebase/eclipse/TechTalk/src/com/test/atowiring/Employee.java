package com.test.atowiring;

public class Employee {
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "employee id :: " + id;
	}
	
	public void myInit(){
		System.out.println("myInit called");
	}
	
	public void myDestroy(){
		System.out.println("myDestroy called");
	}

}
