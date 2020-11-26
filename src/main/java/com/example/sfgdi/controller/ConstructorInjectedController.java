package com.example.sfgdi.controller;

import com.example.sfgdi.services.GreetingService;

public class ConstructorInjectedController {
	
	GreetingService greetingService;
	
	public ConstructorInjectedController() {
		// TODO Auto-generated constructor stub
	}
	

	public ConstructorInjectedController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}



	public void testMethod() {
		String str=greetingService.greeting();
		System.out.println(str);
	}

}
