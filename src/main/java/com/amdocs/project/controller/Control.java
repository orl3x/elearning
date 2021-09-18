package com.amdocs.project.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amdocs.project.interfaceService.IUserService;
import com.amdocs.project.model.User;

@Controller
@RequestMapping
public class Control {
	//CONTROL CURRENTLY LOGGED USER
	public static User loggedUser = new User();

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
	
	@GetMapping("/register")
	public String registerUser(Model model) {
		model.addAttribute("user", new User());
		return "registerUser";
	}
	
	@GetMapping("/login-screen")
	public String loginScreen(Model model) {
		model.addAttribute("user", new User());
		return "loginScreen";
	}
	
	@GetMapping("/login-screen-failure")
	public String loginScreenFailure(Model model) {
		model.addAttribute("user", new User());
		return "loginScreenFail";
	}
	
	@PostMapping("validate-login")
	public String validateLogin(User u) {
		String email = u.getEmail();
		//System.out.println(email);
	    String password = u.getPassword();
		//System.out.println(password);
		
		List<User> users = service.listUser();
		for(User user:users) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				loggedUser.setId(user.getId());
				return "hello";
			}
		}
		return "redirect:/login-screen-failure";
	
	}
	
	

	@PostMapping("/save-user")
	public String saveUser(User u) {
		//GET CURRENT TIMESTAMP
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		u.setDate(formatter.format(date));
		service.saveUser(u);
		return "redirect:/login-screen"; 
	}
	
}
