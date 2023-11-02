package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Curd;
import com.example.demo.service.CurdService;

@RestController
public class CrudController {
	
	@Autowired // is used for creating the method 
	
	CurdService curdService; 
	
	
	@GetMapping("/getall")
	
	public List<Curd> getall(){
		
		return curdService.getallcurd();
		
	}
	
	@GetMapping("/createdata")
	public Curd createdata(Curd curddto)
	{
		
		return curdService.createdata(curddto);
		
	}

}
