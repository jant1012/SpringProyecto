package com.janchondo.tienda.employeers.controller;





import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;


import com.janchondo.tienda.employeers.model.Persona;
import com.janchondo.tienda.employeers.service.EmpleadoServiceImpl;




@Controller
public class Controlador {
	@Autowired
	private EmpleadoServiceImpl empleado;
	
	@GetMapping("/empleados")
	public String listarEmpleados(Model modelo) {
		var personas = empleado.listarEmpleados();
		modelo.addAttribute("personas",personas);
		return "index";
	}
	
	@GetMapping("/empleados/agregar")
	public String agregarEmpleado(Persona persona) {
		return "agregar";
	}
	
	@PostMapping("/empleados/guardar")
	public String guardarEmpleado(@Valid Persona persona, Errors errores) {
		if(errores.hasErrors()) {
			return "agregar";
		}
		empleado.guardarEmpleado(persona);
		return "redirect:/empleados";
	}
	
	@GetMapping("/empleados/eliminar/{id}")
	public String eliminarEmpleado(Persona persona) {
		empleado.eliminarEmpleado(persona);
		return "redirect:/empleados";
	}
	
	
	@GetMapping("/empleados/modificar/{id}")
	public String modificarEmpleado(Persona persona, Model model) {
		persona = empleado.encontrarPersona(persona);
		model.addAttribute("persona", persona);
		return "agregar";
	}
	
}
