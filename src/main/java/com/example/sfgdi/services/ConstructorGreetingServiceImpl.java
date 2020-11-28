package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

	@Override
	public String greeting() {
		return "Hello from CONSTRCTOR greeting service";
	}

}
