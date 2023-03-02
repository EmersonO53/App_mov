package com.ista.string.proyectofinalpw.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.ista.string.proyectofinalpw.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository <Usuario,Long>{

}
