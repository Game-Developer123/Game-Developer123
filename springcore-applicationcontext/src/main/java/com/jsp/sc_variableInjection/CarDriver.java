package com.jsp.sc_variableInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.springcore_applicationcontext.ClassConfiguration;

public class CarDriver {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ClassConfiguration.class);
		Car c = (Car) context.getBean("car");
		
		System.out.println(c.id);
		System.out.println(c.brand);
		System.out.println(c.price);
		
		Car c1 = (Car) context.getBean("car");
		
		System.out.println(c1.id);
		System.out.println(c1.brand);
		System.out.println(c1.price);
		
		System.out.println(c);
		System.out.println(c1);
	}
}
