package com.erickcode.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** This decorator implies we are going to use SpringBoot annotation */
@SpringBootApplication
public class ApirestApplication {

	public static void main(String[] args) {
		/** This line indicates this application will run on Spring */
		SpringApplication.run(ApirestApplication.class, args);
	}

}
