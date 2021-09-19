package com.amdocs.project.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.amdocs.project.model.Course;

@Repository
public interface ICourse extends CrudRepository<Course, Integer>{

}
