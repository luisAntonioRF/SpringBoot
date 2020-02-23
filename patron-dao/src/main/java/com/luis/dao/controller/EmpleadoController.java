package com.luis.dao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luis.dao.service.IEmpleados;

@Controller
@RequestMapping("/app")
public class EmpleadoController {
	
	public static final String PATH_VIEW = "/view/";
	
	@Autowired
	private IEmpleados empleadoService;
	
	@GetMapping("/listar")
	public String listarClientes(Model model) {
		model.addAttribute("empleados",empleadoService.allEmpleados());
		return PATH_VIEW+"listar";
	}
}
