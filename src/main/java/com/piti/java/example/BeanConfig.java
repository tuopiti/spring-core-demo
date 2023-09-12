package com.piti.java.example;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;

public class BeanConfig {
//	@Bean
//	public GreetingService greetingService1() {
//		//return new GreetingCambodian();
//		return new GreetingThailand();
//	}
	
	@Bean
	public GreetingService greetingService2() {
		return new GreetingCambodian();		
	}
	
	@Bean(autowire = Autowire.BY_TYPE)
	public GreetingApplication greetingApplication() {
		return new GreetingApplication();
	}
}
