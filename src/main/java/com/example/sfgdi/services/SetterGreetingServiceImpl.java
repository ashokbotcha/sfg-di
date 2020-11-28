package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {

	@Override
	public String greeting() {
		return "Hello from SETTER greeting service";
	}

}
