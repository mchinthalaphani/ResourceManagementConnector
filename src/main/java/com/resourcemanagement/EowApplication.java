package com.resourcemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.resourcemanagement.*")
public class EowApplication {

	public static void main(String[] args) {
		SpringApplication.run(EowApplication.class, args);
	}
}