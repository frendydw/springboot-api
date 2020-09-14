package com.springboot.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@GetMapping("/student")
	public String Student() {
		return "Hello";
	}
}
