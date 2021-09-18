package com.amdocs.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.amdocs.project.controller.Control;
@Controller
@RequestMapping
public class homeController {
	
	@GetMapping("/get-status")
	public String getUserStatus() {
		System.out.print(Control.canNavigate);
		System.out.print(Control.loggedUser.getName() + Control.loggedUser.getEmail() + Control.loggedUser.getId());
		return "hello";
	}

}
