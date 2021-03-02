package com.example.demo.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CareerController {
	
	// GET index
	@GetMapping("/index")
	public String getCareerIndex(Model model) {
		
		model.addAttribute("contents", "career/index :: index_contents");
		return "career/template";
	}
	
	// POST logout
	@PostMapping("/logout")
	public String postLogout() {
		return "redirect:/login";
	}
	
	// GET new
	@GetMapping("/new")
	public String getCareerNew(Model model) {
		
		model.addAttribute("contents", "career/new :: new_contents");
		return "career/template";
	}
	
	// GET edit
	@GetMapping("/edit")
	public String getCareerEdit(/*@PathVariable Long id,*/ Model model) {
		
		model.addAttribute("contents", "career/edit :: edit_contents");
		return "career/template";
	}
}
