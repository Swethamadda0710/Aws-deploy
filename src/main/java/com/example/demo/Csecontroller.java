package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Csecontroller {
	@GetMapping("/adityacse")
	public String rocks() {
		return "Welcome to cse 3rd year";
	}
	
	@GetMapping("/adityait")
	public String rocks1() {
		return "im swetha";
	}
}