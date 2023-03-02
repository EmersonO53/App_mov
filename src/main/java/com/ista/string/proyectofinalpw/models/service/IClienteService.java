package com.ista.string.proyectofinalpw.models.service;

import java.util.List;

import com.ista.string.proyectofinalpw.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll ();
	
	public Cliente save(Cliente cliente);

	public Cliente findbyid(Long id);

	public void delete(Long id);

}
