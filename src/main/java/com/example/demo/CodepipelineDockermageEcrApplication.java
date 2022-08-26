package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodepipelineDockermageEcrApplication {

	
	@GetMapping("/hello")
	public String hello() {
		return "welcome codepipeline docker image Ecr application";
	}
	
	@GetMapping("/second")
	public String second() {
		return "welcome codepipeline docker image Ecr application and this is second end point";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(CodepipelineDockermageEcrApplication.class, args);
	}

}
