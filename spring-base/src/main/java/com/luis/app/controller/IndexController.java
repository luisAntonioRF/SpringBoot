package com.luis.app.controller;

import java.util.ArrayList;
import java.util.List;
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
		usuario.setEmail("jse@gmail.com");
		model.addAttribute("usuario",usuario);
		return PATH_VIEW+"perfil";
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Usuario>usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Miguel","Perez","mi@gmail.com"));
		usuarios.add(new Usuario("Maria","Rodriguez","maria@gmail.com"));
		usuarios.add(new Usuario("Juan Manuel","Pereira","J@gmail.com"));
		usuarios.add(new Usuario("Leonel","Mesi","leo@gmail.com"));
		usuarios.add(new Usuario("Joel","Mortero","joe@gmail.com"));
		model.addAttribute("usuarios",usuarios);
		return PATH_VIEW+"listar";
	}
}
