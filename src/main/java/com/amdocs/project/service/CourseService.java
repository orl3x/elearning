package com.amdocs.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.project.interfaceService.ICourseService;
import com.amdocs.project.interfaces.ICourse;
import com.amdocs.project.model.Course;


@Service
public class CourseService implements ICourseService{

	@Autowired
	private ICourse data;
	
	@Override
	public List<Course> listCourse() {
		// TODO Auto-generated method stub
		return (List<Course>)data.findAll();
	}

	@Override
	public Optional<Course> listId(int id) {
		return data.findById(id);
	}

	@Override
	public int saveCourse(Course c) {
		int res = 0;
		Course course = data.save(c);
		if(!course.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
