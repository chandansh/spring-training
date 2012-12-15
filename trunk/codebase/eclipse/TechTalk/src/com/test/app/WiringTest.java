package com.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.atowiring.Company;

public class WiringTest {

	
	public static void main(String[] args) {
		ApplicationContext context = new 
				FileSystemXmlApplicationContext("wiring.xml");
		System.out.println("context loaded..");
		
		Company company = (Company) context.getBean("company"); 
		System.out.println(company);
	}

}
