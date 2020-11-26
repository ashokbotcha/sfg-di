package com.example.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.sfgdi.controller.PropertyInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext apcontext=SpringApplication.run(SfgDiApplication.class, args);
		PropertyInjectedController myControoler=(PropertyInjectedController) apcontext.getBean("myController");
		myControoler.testMethod();
	}

}
