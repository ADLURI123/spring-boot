package com.spring.boot.project.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

	@GetMapping("/test")
	public String fun (){
		return "Hello World";
	}

}
