package com.piti.java.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig2 {
   private int count;
   
   //@Bean
   public String getText() {
	   System.out.println("Method Called");
	   System.out.println(++count);
	   return "Pich Khmer";
   }
}
