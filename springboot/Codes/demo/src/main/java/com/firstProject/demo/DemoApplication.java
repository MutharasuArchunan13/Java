package com.firstProject.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Home homeObject = context.getBean(Home.class);
		homeObject.network();
		Home homeObject2 = context.getBean(Home.class);
		homeObject2.network();
	}

}
