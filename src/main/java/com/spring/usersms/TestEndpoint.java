package com.spring.usersms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestEndpoint {

	@PostMapping
	public String helloWorld() {
		return "Hello post";
	}
	@GetMapping
	public String helloWorld2() {
		return "Hello get";
	}
}


