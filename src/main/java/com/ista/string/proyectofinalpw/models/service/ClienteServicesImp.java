package com.ista.string.proyectofinalpw.models.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.ista.string.proyectofinalpw.models.dao.IClienteDao;
import com.ista.string.proyectofinalpw.models.entity.Cliente;

@Service
public class ClienteServicesImp implements IClienteService{

	
	@Autowired
	private IClienteDao ClienteDao;
	
	
	
	@Override
	@Transactional
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>)ClienteDao.findAll();
	}

	@Override
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return ClienteDao.save(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findbyid(Long id) {
		// TODO Auto-generated method stub

		return ClienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ClienteDao.deleteById(id);
	}

}
