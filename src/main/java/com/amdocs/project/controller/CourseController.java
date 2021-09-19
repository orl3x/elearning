package com.amdocs.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.amdocs.project.interfaceService.ICourseService;
import com.amdocs.project.interfaceService.IEnrolledCoursesService;
import com.amdocs.project.model.Course;
import com.amdocs.project.model.EnrolledCourses;
import com.amdocs.project.model.User;
import com.amdocs.project.service.EnrolledCourseService;

@Controller
@RequestMapping
public class CourseController {
	
	@Autowired
	private ICourseService service;
	
	@Autowired
	private IEnrolledCoursesService enrolledCourseService;
	

	@GetMapping("/add-course")
	public String addCourse(Model model) {
		model.addAttribute("course", new Course());
		return "add-course";
	}
	
	@PostMapping("/save-course")
	public String saveCourse(Course c) {
//		System.out.print(c.getName());
//		System.out.print(c.getDescription());
//		System.out.print(c.getResource());
//		System.out.print(c.getFees());
		service.saveCourse(c);
		return "redirect:/home";
	}
	
	@GetMapping("/enroll-course")
	public String enrollCourse(Model model) {
		List<Course> courseList = service.listCourse();
		List<EnrolledCourses> enrolledCoursesList = enrolledCourseService.listEnrolledCourses();
		for(EnrolledCourses ec : enrolledCoursesList) {
			if(Control.loggedUser.getId() == ec.getUserId()) {
				System.out.print("Equal one found");
				courseList.removeIf(course -> course.getId() == ec.getCourseId());	
			}
		}
		
		
		EnrolledCourses e = new EnrolledCourses();
		e.setCourseId(7);
		model.addAttribute("enrolledCourse", e);
		model.addAttribute("courses", courseList);
		return "enroll-course";
	}
	
	@PostMapping("/enroll")
	public String saveEnrolledCourse(EnrolledCourses ec) {
	System.out.print("Inside enroll method");
	System.out.println(ec.getCourseId());
	ec.setUserId(Control.loggedUser.getId());
	System.out.print("Logged user id: "+Control.loggedUser.getId());
	enrolledCourseService.saveEnrolledCourse(ec);
	
	return "redirect:/enroll-course";
	}
}
