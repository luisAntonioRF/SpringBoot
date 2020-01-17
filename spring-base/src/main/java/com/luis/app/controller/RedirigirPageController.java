package com.luis.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class RedirigirPageController {
	
	public static final String PATH_VIEW = "/redirect/";

	@GetMapping("/redirect1")
	public String redirect() {
		//return "redirect:/app/index";
		return "forward:/app/index";
	}
}
