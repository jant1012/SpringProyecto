package com.janchondo.tienda.employeers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.janchondo.tienda.employeers.dao.iPersonaDao;
import com.janchondo.tienda.employeers.model.Persona;

@Service
public class EmpleadoServiceImpl implements iEmpleadoService{

	@Autowired
	private iPersonaDao personaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Persona> listarEmpleados() {
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	@Transactional
	public void guardarEmpleado(Persona persona) {
		personaDao.save(persona);
		
	}

	@Override
	@Transactional
	public void eliminarEmpleado(Persona persona) {
		personaDao.delete(persona);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Persona encontrarPersona(Persona persona) {
		return personaDao.findById(persona.getId()).orElse(null);
	}

}
