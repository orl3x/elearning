package com.amdocs.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amdocs.project.interfaceService.IFeedbackService;
import com.amdocs.project.model.FB;

@Controller
@RequestMapping
public class FeedbackController {
	
	@Autowired
	private IFeedbackService service;

	@GetMapping("/add-feedback")
	public String addFeedback(Model model) {
		if(!Control.canNavigate) {
			return "requireLogin";
		}
		model.addAttribute("feedbackObject", new FB());
		return "addFeedback";
	}
	
	@PostMapping("/save-feedback")
	public String saveFeedback(FB f) {
		f.setEmail(Control.loggedUser.getEmail());
		f.setName(Control.loggedUser.getName());
		f.setUser_id(Control.loggedUser.getId());
		service.saveFeedback(f);
		return "redirect:/user"; 
	}
}
