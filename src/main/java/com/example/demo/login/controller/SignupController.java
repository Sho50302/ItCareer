package com.example.demo.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.login.domain.model.SignupForm;
import com.example.demo.login.domain.model.ValidGroupOrder;

@Controller
public class SignupController {
	
	// GET signup
	@GetMapping("/signup")
	public String getSignUp(@ModelAttribute SignupForm form, Model model) {
		return "login/signup";
	}
	
	// POST signup
	@PostMapping("/signup")
	public String postSignUp(@ModelAttribute 
			@Validated(ValidGroupOrder.class) SignupForm form, 
			BindingResult bindingResult, Model model) {
		
		if (bindingResult.hasErrors()) {
			return getSignUp(form, model);
		}
		
		System.out.println(form);
		
		return "redirect:/login";
	}
}
