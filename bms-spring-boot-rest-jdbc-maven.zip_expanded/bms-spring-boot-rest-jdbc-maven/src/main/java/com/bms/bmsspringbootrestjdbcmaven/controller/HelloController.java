package com.bms.bmsspringbootrestjdbcmaven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bmsspringbootrestjdbcmaven.model.StudentDto;

//@Component
@RestController // 1. annotate 
public class HelloController {

	// 2. here we create endpoints which are mapped to rest methods
	// to reach this endpoint from the client(postman) - http://localhost:4545/hello
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello everyone";
	}
	
	@GetMapping("/fetch-a-student")
	public StudentDto fetchAStudent() {
		StudentDto student = new StudentDto(101, "ABC", 80);
		return student;
	}
	
}
