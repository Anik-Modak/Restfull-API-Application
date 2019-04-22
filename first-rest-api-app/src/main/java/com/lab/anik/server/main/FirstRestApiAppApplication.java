package com.lab.anik.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.lab"})
public class FirstRestApiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstRestApiAppApplication.class, args);
	}

}
