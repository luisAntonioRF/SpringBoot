package com.luis.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping("/index")//@GetMapping({"/index","/","/home"})
	public String msn(Model model) {
		model.addAttribute("saludo","Saludos desde Spring Boot2");
		return "/view/index";
	}
	
}
