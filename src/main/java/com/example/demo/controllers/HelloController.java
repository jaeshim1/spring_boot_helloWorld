package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@RequestMapping("/")
	public String home() {
		return "Hello World jay";
	}
	
	@RequestMapping("/hello/{name}")
	public String helloName(@PathVariable String name) {
		return String.format("Hello %s!", name);
	}
	
	@RequestMapping("/hello/age/{name}")
	public String helloNameAge(@PathVariable String name, @RequestParam(value="age") int age) {
		return String.format("Hello %s! You are %d years old!", name, age);
		//		localhost:8080/hello/age/Fred?age=32
	}
	
	@RequestMapping("/math/add/{number_1}/{number_2}")
	public String addNumbers(@PathVariable float number_1, @PathVariable float number_2) {
		return String.format("%f",  number_1 + number_2);
		//		localhost:8080/math/add/1/2
	}

}
