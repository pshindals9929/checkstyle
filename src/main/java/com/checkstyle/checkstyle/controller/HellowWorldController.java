package com.checkstyle.checkstyle.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HellowWorldController {
	
	@GetMapping("/")
	public String greet() {
		return "hello ";
	}

}
