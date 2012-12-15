package com.test.atowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
	
	@Autowired
	Employee employee;

	public Company() {
	}
	
	public Company(Employee employee) {
		this.employee = employee;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	@Override
	public String toString() {
		return "Company :: employee :: " + employee;
	}
	
}
