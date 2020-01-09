package com.luis.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.luis.app.model.Usuario;


@Controller
@RequestMapping("/app")
public class IndexController {

	public static final String PATH_VIEW = "/view/";
	
	@GetMapping("/index")//@GetMapping({"/index","/","/home"})
	public String msn(Model model) {
		model.addAttribute("saludo","Saludos desde Spring Boot2");
		return PATH_VIEW+"index";
	}
	
	@GetMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Jose");
		usuario.setApellido("Pulido");
		model.addAttribute("usuario",usuario);
		return PATH_VIEW+"perfil";
	}
}
