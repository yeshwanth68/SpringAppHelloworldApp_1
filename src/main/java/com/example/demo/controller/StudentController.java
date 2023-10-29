package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
public class StudentController {
	
	
	@GetMapping("/student")
	//http://localhost:8080/student
	public Student getStudent() {
		return new Student("Yeshwanth", "Kumar");
	}
	
	@GetMapping("/students")
	//http://localhost:8080/students
	public List<Student> getStudents(){		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Yeshwanth", "Kumar"));
		students.add(new Student("Vishal", "Raj"));
		students.add(new Student("Gokul", "R"));
		students.add(new Student("Sangili", "Kumar"));
		return students;
	}

	


}
