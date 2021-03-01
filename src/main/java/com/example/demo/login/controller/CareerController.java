package com.example.demo.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CareerController {
	
	// GET index
	@GetMapping("/index")
	public String getCareerIndex(Model model) {
		
		model.addAttribute("contents", "career/index :: index_contents");
		return "career/template";
	}
	
	// logout
	@PostMapping("/logout")
	public String postLogout() {
		return "redirect:/login";
	}
}
