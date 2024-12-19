package com.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {

//		ConfigurableApplicationContext context =
	SpringApplication.run(HelloApplication.class, args);
//		Home homeObj = context.getBean(Home.class);
//		Home homeObj1 = context.getBean(Home.class);
//		// Home homeObj = new Home();
//		homeObj.connection();
//		homeObj1.connection();
	}

}
