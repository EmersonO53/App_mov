package com.ista.string.proyectofinalpw.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.string.proyectofinalpw.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto,Long>{

}
