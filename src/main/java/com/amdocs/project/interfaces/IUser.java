package com.amdocs.project.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.project.model.User;

@Repository
public interface IUser extends CrudRepository<User, Integer>{

}
