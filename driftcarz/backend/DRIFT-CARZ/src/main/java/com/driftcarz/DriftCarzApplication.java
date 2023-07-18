package com.driftcarz;

import com.driftcarz.utils.AppConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DriftCarzApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriftCarzApplication.class, args);
		System.out.println("Welcome to : "+AppConstants.APPLICATION_NAME);
	}
}
