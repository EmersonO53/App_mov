package com.ista.string.proyectofinalpw.models.service;

import java.util.List;


import com.ista.string.proyectofinalpw.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll ();
	
	public Producto save(Producto producto);

	public Producto findbyid(Long id);

	public void delete(Long id);

}
