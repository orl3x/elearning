package com.amdocs.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="enrolled_courses")
public class EnrolledCourses {
	
	
	@Column(name="user_id")
	private int userId;
	
	@Id
	@Column(name="course_id")
	private int courseId;
	
	public EnrolledCourses() {
		
	}

	public EnrolledCourses(int userId, int courseId) {
		super();
		this.userId = userId;
		this.courseId = courseId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	
	
	
	
}
