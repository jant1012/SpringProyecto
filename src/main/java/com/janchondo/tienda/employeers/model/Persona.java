package com.janchondo.tienda.employeers.model;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Data;


@Data
@Entity
@Table(name="Empleados")
public class Persona  {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	@NotEmpty
	private String nombre;
	
	@Column(name="apellido")
	@NotEmpty
	private String apellido;
	
	@Column(name="email")
	@NotEmpty
	@Email
	private String email;
	
	@Column(name="telefono")
	private String telefono;
	

}
