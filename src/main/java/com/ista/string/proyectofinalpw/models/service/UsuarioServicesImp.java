package com.ista.string.proyectofinalpw.models.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.string.proyectofinalpw.models.dao.IUsuarioDao;
import com.ista.string.proyectofinalpw.models.entity.Usuario;

@Service
public class UsuarioServicesImp implements IUsuarioService{

	@Autowired
	private IUsuarioDao UsuarioDao;

	@Override
	@Transactional
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>)UsuarioDao.findAll();
	}

	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return UsuarioDao.save(usuario);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findbyid(Long id) {
		// TODO Auto-generated method stub
		return UsuarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional	
	public void delete(Long id) {
		// TODO Auto-generated method stub
		UsuarioDao.deleteById(id);
		
	}
	
	

}
