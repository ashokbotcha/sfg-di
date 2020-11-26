package com.example.sfgdi.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.sfgdi.services.GreetingServiceImpl;

class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController constructorInjectedController;
	
	@BeforeEach
	void setup() {
		constructorInjectedController
		 =new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	void testTestMethod() {
		constructorInjectedController.testMethod();
		
	}

}
