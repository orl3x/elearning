package com.amdocs.project.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.project.model.Contact;

@Repository
public interface IContact extends CrudRepository<Contact, Integer>{

}
