package com.luis.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class PathVariableController {

	public static final String PATH_VIEW = "/pathVariable/";
	
	@GetMapping("/string/{txt}")
	public String path1(@PathVariable String txt,Model model) {
		model.addAttribute("txt",txt);
		return PATH_VIEW+"index";
	}
	
	@GetMapping("/string/{txt}/{numero}")
	public String path2(@PathVariable String txt,@PathVariable Integer numero,Model model) {
		model.addAttribute("txt",txt);
		model.addAttribute("numero",numero);
		return PATH_VIEW+"index";
	}
}
