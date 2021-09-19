package com.amdocs.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amdocs.project.interfaceService.IEnrolledCoursesService;

@Controller
@RequestMapping
public class enrolledCourseController {

	@Autowired
	private IEnrolledCoursesService service;

	public IEnrolledCoursesService getService() {
		return service;
	}

	public void setService(IEnrolledCoursesService service) {
		this.service = service;
	}
	
	
	
	
	

	
}
