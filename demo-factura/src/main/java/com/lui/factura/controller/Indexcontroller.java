package com.lui.factura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lui.factura.entity.Factura;

@Controller
@RequestMapping("/app")
public class Indexcontroller {

	@Autowired
	private Factura factura;

	@GetMapping("/factura")
	public String ver(Model model) {
		model.addAttribute("factura", factura);
		model.addAttribute("obj", "Ejemplo Factura");
		return "/facturas/index";
	}
}
