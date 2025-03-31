package com.claudio.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;


@SpringBootApplication
public class TodolistApplication implements CommandLineRunner{
	
    @Autowired
	private final Environment environment;


    public TodolistApplication(Environment environment) {
        this.environment = environment;
    }

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String appName = environment.getProperty("spring.application.name");
		System.out.println("Bienvenido "+appName);
	}
}
