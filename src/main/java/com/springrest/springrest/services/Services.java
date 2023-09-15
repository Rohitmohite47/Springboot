package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entity.course;

public interface Services {
	
	public List<course> getCources();
	
	public course getCourses(long courseId);
   
	public course addcourse(course course);
		
	}


