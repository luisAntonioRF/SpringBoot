package com.luis.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/param")
public class RequestParamsController {

	public static final String PATH_VIEW = "/requestParam/";
	
	@GetMapping("/")
	public String index() {
		return PATH_VIEW+"index";
	}
	
	@GetMapping("/var")
	public String param(@RequestParam String texto,@RequestParam(required = false) Integer num,Model model) {
		model.addAttribute("texto", texto);
		model.addAttribute("num", num);
		return PATH_VIEW+"ver";
	}
}
