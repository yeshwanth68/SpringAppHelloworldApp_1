package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
	
	
	@GetMapping("/hello")
	public String helloworld()
	{
		return "Hello world!!..";
	}
}
