package com.ista.string.proyectofinalpw.models.service;

import java.util.List;

import com.ista.string.proyectofinalpw.models.entity.Usuario;

public interface IUsuarioService {
	

	public List<Usuario> findAll ();
	
	public Usuario save(Usuario usuario);

	public Usuario findbyid(Long id);

	public void delete(Long id);
}
