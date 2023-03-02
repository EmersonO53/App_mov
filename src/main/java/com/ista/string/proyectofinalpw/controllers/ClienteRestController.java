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

import com.ista.string.proyectofinalpw.models.entity.Cliente;
import com.ista.string.proyectofinalpw.models.service.IClienteService;

@RestController
@RequestMapping("/api")
public class ClienteRestController {
	@Autowired 
	private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> indext(){
		return clienteService.findAll();
				
	}
	@GetMapping("/clientes/{id}")
	public Cliente show (@PathVariable Long id) {
		return clienteService.findbyid(id);
		
	}
	
	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	
	@PutMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
		Cliente ClienteActual = clienteService.findbyid(id);
		ClienteActual.setId(cliente.getId());
		ClienteActual.setCedula(cliente.getCedula());
		ClienteActual.setNombre(cliente.getNombre());
		ClienteActual.setApellido(cliente.getApellido());
		ClienteActual.setTelefono(cliente.getTelefono());
		ClienteActual.setCorreo(cliente.getCorreo());
		ClienteActual.setDireccion(cliente.getDireccion());
		ClienteActual.setFecha_nacimiento(cliente.getFecha_nacimiento());
		ClienteActual.setUsuario(cliente.getUsuario());
		ClienteActual.setClave(cliente.getClave());
		
		return clienteService.save(ClienteActual);
		
		
	}
	
	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.delete(id);
	}
		
	

}
