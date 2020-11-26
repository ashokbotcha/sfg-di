package com.example.sfgdi.controller;

import com.example.sfgdi.services.GreetingService;

public class SetterInjectedController {

	GreetingService greetingService;

	public GreetingService getGreetingService() {
		return greetingService;
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public void testMethod() {
		String str=greetingService.greeting();
		System.out.println(str);
	}
}
