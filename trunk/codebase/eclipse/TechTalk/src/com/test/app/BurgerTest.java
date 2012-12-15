package com.test.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.test.burger.Burger;
import com.test.burger.Waiter;

public class BurgerTest {

	
	public static void main(String[] args) {
		//ApplicationContext context1 = new 
		//		FileSystemXmlApplicationContext("burgerResource.xml");
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("burgerResource.xml"));
		
		System.out.println("context loaded..");
		
		/* 
		// another approach
		Waiter waiter = (Waiter) factory.getBean("waiter");
		Burger burger = waiter.serveBurger();
		System.out.println(burger);
		
		Burger burger1 = waiter.serveBurger();
		System.out.println(burger1);
		
		Burger burger2 = waiter.serveBurger();
		System.out.println(burger2);*/
		
		Burger burger = (Burger) factory.getBean("myBurger");
		System.out.println(burger);
		
		Burger burger1 = (Burger) factory.getBean("myBurger");
		System.out.println(burger1);
		
		Burger burger2 = (Burger) factory.getBean("myBurger");
		System.out.println(burger2);
		
		
	}

}
