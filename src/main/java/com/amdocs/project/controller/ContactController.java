package com.amdocs.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amdocs.project.interfaceService.IContactService;
import com.amdocs.project.interfaceService.ICourseService;
import com.amdocs.project.model.Contact;

@Controller
@RequestMapping
public class ContactController {

	@Autowired
	private IContactService contactService;
	
	
	@GetMapping("/contacts")
	public String listContacts(Model model) {
		List<Contact> contactsList = contactService.listContact();
		model.addAttribute("contacts", contactsList);
		return "contactsList";
	}
	
	@GetMapping("/add-contact")
	public String addContact(Model model) {
		Contact contact = new Contact();
		if(Control.canNavigate) {
			contact.setName(Control.loggedUser.getName());
			contact.setEmail(Control.loggedUser.getEmail());
			contact.setPhone(Control.loggedUser.getPhone());
		}
		model.addAttribute("newcontact", contact);
		return "addContact";
	}
	
	@PostMapping("/save-contact")
	public String saveContact(Contact c) {
		c.setUserId(Control.loggedUser.getId());
		contactService.saveContact(c);
		System.out.print("Contact Saved");
		return "redirect:/add-contact";
	}
	
	
	
}
