package com.mypack;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.training.num.Number;

public class SpringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*using bean factory */
		PropertyConfigurator.configure("log4j.properties");
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Number num1 = (Number) factory.getBean("num1");
		num1.display();
		
		Resource r1 = new FileSystemResource("fileResource.xml");
		BeanFactory factory1 = new XmlBeanFactory(r1);
		Number num2 = (Number) factory1.getBean("num1");
		num2.display();
		
		
		/* using context */
		ApplicationContext context = new 
		           ClassPathXmlApplicationContext("applicationContext.xml");
		Number num3 = (Number) context.getBean("num1");
		num3.display();
		
		ApplicationContext context1  = new FileSystemXmlApplicationContext("fileResource.xml");
		Number num4 = (Number) context1.getBean("num1");
		num4.display();
		

	}

}
