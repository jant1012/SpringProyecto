package com.janchondo.tienda.employeers.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.janchondo.tienda.employeers.model.Persona;


public interface iPersonaDao extends CrudRepository<Persona, Long>{

}
