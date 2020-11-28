package com.example.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController {

	GreetingService greetingService;

	public GreetingService getGreetingService() {
		return greetingService;
	}

	@Autowired
	@Qualifier("setterGreetingServiceImpl")
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public void testMethod() {
		String str=greetingService.greeting();
		System.out.println(str);
	}
}
