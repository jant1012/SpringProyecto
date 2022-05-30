package com.janchondo.tienda.employeers.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.janchondo.tienda.employeers.dao.iPersonaDao;




@Controller
public class Controlador {
	@Autowired
	private iPersonaDao personaDao;
	
	@GetMapping("/empleados")
	public String sayHello(Model modelo) {
		var personas = personaDao.findAll();
		
		modelo.addAttribute("personas",personas);
		
		return "index";
	}
}
