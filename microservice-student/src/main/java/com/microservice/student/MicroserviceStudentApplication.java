package com.microservice.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceStudentApplication.class, args);
	}

}
