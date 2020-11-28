package com.example.sfgdi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {
	
	GreetingService greetingService;
	
   
	public ConstructorInjectedController( @Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}



	public void testMethod() {
		String str=greetingService.greeting();
		System.out.println(str);
	}

}
