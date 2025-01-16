package com.jsp.springcore_applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ClassConfiguration.class);
		Pen p = (Pen) context.getBean("pen");
		p.work();
	}

}
