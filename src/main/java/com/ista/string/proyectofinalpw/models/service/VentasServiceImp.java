package com.ista.string.proyectofinalpw.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ista.string.proyectofinalpw.models.dao.IVentasDao;

@Service
public class VentasServiceImp implements IVentasService{
		
	@Autowired
	private IVentasDao ventasDao;
	
}
