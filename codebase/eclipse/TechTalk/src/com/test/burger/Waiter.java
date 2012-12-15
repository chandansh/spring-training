package com.test.burger;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Waiter implements BeanFactoryAware{
	BeanFactory factory;
	
	public Burger serveBurger(){
		return (Burger) factory.getBean("burger");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		this.factory = arg0;
		
	}

	
	
	
}
