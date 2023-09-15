package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.course;


@Service
public class courseServiceimpl implements Services {

	
	List<course> list;
	
	public courseServiceimpl() {
		
		list=new ArrayList<>();
		list.add(new course(1,"Core java ","This is a basics of core java course"));
		list.add(new course(2,"Advanced java","This is a basics of advanced java "));
	}
	
	
	
	@Override
	public List<course> getCources() {
		return list;
	}



	@Override
	public course getCourses(long courseId) {
		
		course c=null;
		for (course course : list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
			
		}
		
		return c;
	}
	@Override
	public course addcourse(course course) {
		list.add(course);
		return course;
	}
	
	

}
