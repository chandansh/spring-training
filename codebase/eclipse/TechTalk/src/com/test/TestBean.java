package com.test;

public class TestBean {
	private String id;
	private String name;

	public TestBean() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Id : " + id + " name : " + name ;
	}

}
