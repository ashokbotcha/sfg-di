package com.example.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.sfgdi.controller.ConstructorInjectedController;
import com.example.sfgdi.controller.I18nController;
import com.example.sfgdi.controller.MyController;
import com.example.sfgdi.controller.PropertyInjectedController;
import com.example.sfgdi.controller.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext apcontext=SpringApplication.run(SfgDiApplication.class, args);
		
		I18nController i18nController=(I18nController) apcontext.getBean("i18nController");
		i18nController.testMethod();
		
		MyController myControoler=(MyController) apcontext.getBean("myController");
		myControoler.testMethod();
		
		PropertyInjectedController propertyInjectedController=(PropertyInjectedController) apcontext.getBean("propertyInjectedController");
		propertyInjectedController.testMethod();
		
		SetterInjectedController setterInjectedController = (SetterInjectedController) apcontext.getBean("setterInjectedController");
		setterInjectedController.testMethod();
		
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) apcontext.getBean("constructorInjectedController");
		constructorInjectedController.testMethod();
	}

}
