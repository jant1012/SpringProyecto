package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Controlador {

	@GetMapping("/")
	public String sayHello() {
		return "index";
	}
}
