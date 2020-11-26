package com.example.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	
	GreetingService greetingService;

	public void testMethod() {
		String str=greetingService.greeting();
		System.out.println(str);
	}
}
