package com.jsp.springcore_applicationcontext;

import org.springframework.stereotype.Component;

//@Component is used to mark a class as a component.
//@Ioc Container creates object for the Component class.
//@component annotation is used to specify pojo class to the ioc container.
//In annotation Context, @Component will be used instead of <bean> tag.
//@Component is a class-Level Annotation.

@Component  
public class Pen {
	
	public Pen()
	{
		System.out.println("Pen Constructor is invoked");
	}
	
	public void work()
	{
		System.out.println("Pen is writing well");
	}
}
