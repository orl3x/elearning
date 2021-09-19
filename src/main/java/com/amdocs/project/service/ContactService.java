package com.amdocs.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.project.interfaceService.IContactService;
import com.amdocs.project.interfaces.IContact;
import com.amdocs.project.model.Contact;

@Service
public class ContactService implements IContactService{

	@Autowired
	private IContact data;
	
	@Override
	public List<Contact> listContact() {
		// TODO Auto-generated method stub
		return (List<Contact>)data.findAll();
	}

	@Override
	public Optional listId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public int saveContact(Contact c) {
		// TODO Auto-generated method stub
		int res = 0;
		Contact contact = data.save(c);
		if(!contact.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
