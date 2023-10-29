package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/response")
public class PostMappingController {
	
	
	@PostMapping("/register")
    public String postBody(@RequestBody String fullName) {
        return fullName;
    }

}
