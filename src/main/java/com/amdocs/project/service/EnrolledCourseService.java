package com.amdocs.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.project.interfaceService.IEnrolledCoursesService;
import com.amdocs.project.interfaceService.IFeedbackService;
import com.amdocs.project.interfaces.IEnrolledCourses;
import com.amdocs.project.interfaces.IFeedback;
import com.amdocs.project.interfaces.IUser;
import com.amdocs.project.model.EnrolledCourses;
import com.amdocs.project.model.FB;
import com.amdocs.project.model.User;


@Service
public class EnrolledCourseService implements IEnrolledCoursesService{
	
	@Autowired
	private IEnrolledCourses data;

	
	@Override
	public List<EnrolledCourses> listEnrolledCourses() {
		// TODO Auto-generated method stub
		return (List<EnrolledCourses>)data.findAll();
	}

	@Override
	public Optional<EnrolledCourses> listId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public int saveEnrolledCourse(EnrolledCourses ec) {
		// TODO Auto-generated method stub
		int res = 0;
		EnrolledCourses enrolledCourse = data.save(ec);
		if(!enrolledCourse.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
