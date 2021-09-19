package com.amdocs.project.interfaceService;

import java.util.List;
import java.util.Optional;

import com.amdocs.project.model.EnrolledCourses;
import com.amdocs.project.model.FB;
import com.amdocs.project.model.User;

public interface IEnrolledCoursesService {

	public List<EnrolledCourses> listEnrolledCourses();
	public Optional<EnrolledCourses> listId(int id);
	public int saveEnrolledCourse(EnrolledCourses ec);
	public void delete(int id);
}
