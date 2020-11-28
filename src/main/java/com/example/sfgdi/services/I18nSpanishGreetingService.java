package com.example.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18service")
@Profile({"SP","default"})
public class I18nSpanishGreetingService implements GreetingService {

	@Override
	public String greeting() {
		return "Hello from SPANISH greeting service";
	}

}
