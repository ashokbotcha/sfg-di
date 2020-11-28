package com.example.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18service")
@Profile("EN")
public class I18nEnglishGreetingService implements GreetingService {

	@Override
	public String greeting() {
		return "Hello from ENGLISH greeting service";
	}

}
