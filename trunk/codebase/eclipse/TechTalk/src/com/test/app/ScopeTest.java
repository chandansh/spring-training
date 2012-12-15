package com.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.MyModel;
import com.test.model.Model;
import com.test.model.Model1;
import com.test.model.Model2;

public class ScopeTest {

	public static void main(String[] args) {
		ApplicationContext context1 = new 
				FileSystemXmlApplicationContext("myresource1.xml");
		System.out.println("context loaded..");
		
		MyModel myModel = (MyModel) context1.getBean("myModel");
		System.out.println(myModel);
		
		MyModel myModel1 = (MyModel) context1.getBean("myModel");
		System.out.println(myModel1);
		
		MyModel myModel2 = (MyModel) context1.getBean("myModel");
		System.out.println(myModel2);
		
		
		// third approach
				System.out.println("third approach");
				Model mod = (Model) context1.getBean("mod");
				System.out.println(mod);
				
				Model1 mod1 = (Model1) context1.getBean("mod1");
				System.out.println(mod1);
				Model2 mod2 = (Model2) context1.getBean("mod2");
				System.out.println(mod2);
				
				
				System.out.println("third approach again");
				Model mod11 = (Model) context1.getBean("mod");
				System.out.println(mod11);
				
				Model1 mod111 = (Model1) context1.getBean("mod1");
				System.out.println(mod111);
				Model2 mod112 = (Model2) context1.getBean("mod2");
				System.out.println(mod112);
	}

}
