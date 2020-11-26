package com.example.sfgdi.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.sfgdi.services.GreetingServiceImpl;

class SetterInjectedControllerTest {
	
	SetterInjectedController setterInjectedController;
	
	@BeforeEach
	void setup() {
		
		setterInjectedController = new SetterInjectedController();
		setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	void testTestMethod() {
		setterInjectedController.testMethod();
	}

}
