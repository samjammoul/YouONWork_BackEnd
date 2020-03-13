package com.example.YouOnWork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class YouOnWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(YouOnWorkApplication.class, args);
	}

	@GetMapping("/greeting-javaconfig")
	public User greetingWithJavaconfig(@RequestParam(required=false, defaultValue="World") String name) {
		System.out.println("==== in greeting ====");
		return new User("s1","s2");
	}

}
