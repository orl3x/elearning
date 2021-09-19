package com.amdocs.project.interfaceService;

import java.util.List;
import java.util.Optional;

import com.amdocs.project.model.Course;

public interface ICourseService {
	public List<Course> listCourse();
	public Optional<Course> listId(int id);
	public int saveCourse(Course c);
	public void delete(int id);
}
