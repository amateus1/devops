package com.example.coedevops2.web;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("course", "DevOps");
		return "index";
	}
}
