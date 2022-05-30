package com.janchondo.tienda.employeers.controller;


import java.util.Arrays;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.janchondo.tienda.employeers.model.Persona;



@Controller
public class Controlador {
	
	
	@GetMapping("/empleados")
	public String sayHello(Model modelo) {
		var persona = new Persona();
		var persona2 = new Persona();
		
		persona.setNombre("Jesus");
		persona.setApellido("Anchondo");
		persona.setEmail("janchondo@gmail.com");
		persona.setTelefono("625105");
		
		persona2.setNombre("Jes");
		persona2.setApellido("Aondo");
		persona2.setEmail("jancdo@gmail.com");
		persona2.setTelefono("6205");
		
		var personas = Arrays.asList(persona,persona2);
		
		modelo.addAttribute("personas",personas);
		
		return "index";
	}
}
