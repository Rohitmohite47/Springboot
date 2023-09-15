package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.course;
import com.springrest.springrest.services.Services;


@RestController
public class MyController {
	
	@Autowired
	private Services services;    

	
	@GetMapping("/home")
	public String home() {
		
		return "Welcome to courses application";
	}
     
	@GetMapping("/course")
	public List<course> getCourses(){
		return this.services.getCources();
		
		
	}
	@GetMapping("/courses/{courseId}")
	public course getcourse(@PathVariable String courseId) {
		
		return this.services.getCourses(Long.parseLong(courseId));
	}
	@PostMapping("/courses")
	public course addcourse(course course) {
		return this.services.addcourse(course);
}
}
