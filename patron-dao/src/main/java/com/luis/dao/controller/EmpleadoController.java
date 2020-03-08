package com.luis.dao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luis.dao.Entity.EmpleadosEntity;
import com.luis.dao.service.IEmpleados;

@Controller
@RequestMapping("/app")
public class EmpleadoController {
	
	public static final String PATH_VIEW = "/view/";
	
	@Autowired
	private IEmpleados empleadoService;
	
	@GetMapping("/index")
	public String index() {
		return PATH_VIEW+"index";
	}
	
	@GetMapping("/formulario")
	public String getForm(Model model) {
		EmpleadosEntity empleado = new EmpleadosEntity();
		model.addAttribute("empleado",empleado);
		return PATH_VIEW+"formulario";
	}
	
	@PostMapping("/save")
	public String guardarClientes(EmpleadosEntity empleado) {
		empleadoService.save(empleado);
		return "redirect:listar";
	}
	
	@GetMapping("/listar")
	public String listarClientes(Model model) {
		model.addAttribute("empleados",empleadoService.allEmpleados());
		return PATH_VIEW+"listar";
	}
	
	
}
