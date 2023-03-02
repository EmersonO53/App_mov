package com.ista.string.proyectofinalpw.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.string.proyectofinalpw.models.entity.Usuario;
import com.ista.string.proyectofinalpw.models.service.IUsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/usuarios")
	public List<Usuario> indext(){
		return usuarioService.findAll();
				
	}
	@GetMapping("/usuarios/{id}")
	public Usuario show (@PathVariable Long id) {
		return usuarioService.findbyid(id);
		
	}
	
	@PostMapping("/usuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}
	
	@PutMapping("/usuarios/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id) {
		Usuario UsuarioActual = usuarioService.findbyid(id);
		UsuarioActual.setId(usuario.getId());
		UsuarioActual.setNombre(usuario.getNombre());
		UsuarioActual.setApellido(usuario.getApellido());
		UsuarioActual.setCorreo(usuario.getCorreo());
		UsuarioActual.setUsuario(usuario.getUsuario());
		UsuarioActual.setClave(usuario.getClave());
		
		return usuarioService.save(UsuarioActual);
		
		
	}
	
	@DeleteMapping("/usuarios/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		usuarioService.delete(id);
	}
}
