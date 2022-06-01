package com.janchondo.tienda.employeers.service;

import java.util.List;
import java.util.Optional;

import com.janchondo.tienda.employeers.model.Persona;

public interface iEmpleadoService {

	public List<Persona> listarEmpleados();
	
	public void guardarEmpleado(Persona persona);
	
	public void eliminarEmpleado(Persona persona);
	
	public Persona encontrarPersona(Persona persona);
	
}
