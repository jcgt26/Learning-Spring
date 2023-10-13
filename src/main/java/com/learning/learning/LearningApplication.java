package com.learning.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@AutoConfiguration
public class LearningApplication {
	@RequestMapping("/")
	@ResponseBody
	String home(){
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);
	}

}
