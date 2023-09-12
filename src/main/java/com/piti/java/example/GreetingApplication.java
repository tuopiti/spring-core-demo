package com.piti.java.example;

import org.springframework.beans.factory.annotation.Autowired;

public class GreetingApplication {
	//@Autowired
	private GreetingService greetingService; //Injection Point
	
	public void sayHello(String name) {
		greetingService.sayHi(name);
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
}
