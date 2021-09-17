package com.amdocs.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amdocs.project.interfaceService.IUserService;
import com.amdocs.project.model.User;

@Controller
@RequestMapping
public class Control {

	@Autowired
	private IUserService service;
	
	@GetMapping("/user")
	public String list(Model model) {
		List<User> users = service.listUser();
		model.addAttribute("users",users);
		return "userList";
	}
	
	@GetMapping("/byid/{id}")
	public String findById(@PathVariable int id, Model model) {
	Optional<User> user = service.listId(id);
	model.addAttribute("users",user.get());
	return "userbyid";
		
	}

	
}
