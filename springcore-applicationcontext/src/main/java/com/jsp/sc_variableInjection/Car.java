package com.jsp.sc_variableInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")	//@Scope is used to modify the scope of a bean
public class Car {

	@Value("1")	//@Value is used to provide default values by the programmer to the properties of a pojo class.
	int id;
	
	@Value("Audi")	//@Value is used to specify default values.
	String brand;
	
	@Value("100.0")
	double price;
	
}
