package com.amdocs.project.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.project.model.FB;
import com.amdocs.project.model.User;
import com.amdocs.project.model.EnrolledCourses;


@Repository
public interface IEnrolledCourses extends CrudRepository<EnrolledCourses, Integer>{


}
