package com.piti.java.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunner {
	
	public static void main(String[] args) {
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		//GreetingApplication greetingApplication = context.getBean(GreetingApplication.class);
		//greetingApplication.sayHello("Dara");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig2.class);
		BeanConfig2 beanConfig2 = context.getBean(BeanConfig2.class);
		beanConfig2.getText();
		beanConfig2.getText();
		context.close();
	}
}
