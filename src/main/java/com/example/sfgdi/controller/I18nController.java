package com.example.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.sfgdi.services.GreetingService;

@Controller
public class I18nController {
	
	@Autowired
	@Qualifier("i18service")
	GreetingService greetingService;	  

	public void testMethod() {
		String str=greetingService.greeting();
		System.out.println(str);
	}

}
