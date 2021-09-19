package com.amdocs.project.interfaceService;

import java.util.List;
import java.util.Optional;

import com.amdocs.project.model.Contact;

public interface IContactService {

	public List<Contact> listContact();
	public Optional<Contact> listId(int id);
	public int saveContact(Contact c);
	public void delete(int id);
	
}
