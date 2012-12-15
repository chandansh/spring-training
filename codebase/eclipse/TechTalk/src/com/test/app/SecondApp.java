package com.test.app;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.HelloWorld;
import com.test.factory.Factory;
import com.test.model.Model;
import com.test.model.Model1;
import com.test.model.Model2;

public class SecondApp {

	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("myresource_classpath.xml");
		HelloWorld h = (HelloWorld) context.getBean("hello");
		System.out.println(h.sayHello());
		
		ApplicationContext context1 = new 
				FileSystemXmlApplicationContext("myresource.xml");
		System.out.println("context loaded..");
		HelloWorld h1 = (HelloWorld) context1.getBean("hello");
		HelloWorld h2 = (HelloWorld) context1.getBean("hello1");
		HelloWorld h3 = (HelloWorld) context1.getBean("hello2");
		HelloWorld h4 = (HelloWorld) context1.getBean("hello3");
		
		System.out.println(h2.sayHello());
		System.out.println(h1==h2 );
		System.out.println( h2==h3 );
		System.out.println( h3==h4 );
		
		Factory fac = (Factory) context1.getBean("fac");
		System.out.println(fac);
		
		Model model = (Model) context1.getBean("model");
		System.out.println(model);
		
		Model1 model1 = (Model1) context1.getBean("model1");
		System.out.println(model1);
		Model2 model2 = (Model2) context1.getBean("model2");
		System.out.println(model2);
		
		
		// third approach
		System.out.println("third approach");
		Model mod = (Model) context1.getBean("mod");
		System.out.println(mod);
		
		Model1 mod1 = (Model1) context1.getBean("mod1");
		System.out.println(mod1);
		Model2 mod2 = (Model2) context1.getBean("mod2");
		System.out.println(mod2);
		
		
		
		
	}

}
