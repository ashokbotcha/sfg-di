package com.example.sfgdi.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.sfgdi.services.GreetingService;
import com.example.sfgdi.services.ConstructorGreetingServiceImpl;

class PropertyInjectedControllerTest {
	
	PropertyInjectedController propertyInjectedController;
	
	@BeforeEach
	public void setup() {
		
		propertyInjectedController=new PropertyInjectedController();
		propertyInjectedController.greetingService = new ConstructorGreetingServiceImpl();
		
	}

	@Test
	public void testTestMethod() {
		propertyInjectedController.testMethod(); 		
	}

}
