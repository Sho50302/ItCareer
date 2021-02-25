package com.example.demo.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {
	
	// GET signup
	@GetMapping("/signup")
	public String getSignUp(Model model) {
		return "login/signup";
	}
	
	// POST signup
	@PostMapping("/signup")
	public String postSignUp(Model model) {
		return "redirect:/login";
	}
}
