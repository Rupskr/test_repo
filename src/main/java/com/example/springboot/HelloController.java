package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot! by cicd";
	}
	
	@GetMapping("/other")
	public String abcmethod() {
		return "Greetings from other method";
	}
	
	@GetMapping("/name/{name}")
	public String wish(@PathVariable String name) {
    		return "Hello : " + name +" !   how are you ??";
		}

}
