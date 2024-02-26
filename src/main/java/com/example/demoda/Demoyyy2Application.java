package com.example.demoda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demoyyy2Application {

	public static void main(String[] args) {
		ApplicationContext factory = SpringApplication.run(Demoyyy2Application.class, args);

		Alien obj1 = factory.getBean(Alien.class);
		obj1.code();
	}

}
