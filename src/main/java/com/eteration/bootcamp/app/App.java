package com.eteration.bootcamp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.eteration.bootcamp")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
}
