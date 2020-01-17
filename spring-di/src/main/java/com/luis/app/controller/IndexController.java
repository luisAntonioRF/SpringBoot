package com.luis.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luis.app.service.MyService;

@Controller 
@RequestMapping("/di")
public class IndexController {
	
	public static final String PATH_VIEW = "/view/";

	@Autowired
	MyService servicio;
	
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("obj",servicio.operation());
		return PATH_VIEW+"index";
	}
}
