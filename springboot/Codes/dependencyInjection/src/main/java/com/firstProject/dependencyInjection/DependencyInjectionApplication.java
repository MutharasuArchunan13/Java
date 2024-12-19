package com.firstProject.dependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		House houseObj = context.getBean(House.class);
		houseObj.getInternet();
		House houseObj1 = context.getBean(House.class);
		houseObj1.getInternet();
	}

}
