package com.example.demo.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.usuario;
import com.example.demo.service.usuarioService;

@RestController
@RequestMapping("/usuario/")
public class usuarioRest {

	@Autowired
	private usuarioService usuarioService;
	
	@GetMapping
	private ResponseEntity<List<usuario>> getAllusuario (){
		return ResponseEntity.ok(usuarioService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<usuario> guardarUsuario (@RequestBody usuario usuario){
		
		try {
			usuario usuarioGuardado = usuarioService.save(usuario);
			return ResponseEntity.created(new URI("/proyecto/" + usuarioGuardado.getId_usu())).body(usuarioGuardado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping(value = "delete/{id}")
	private ResponseEntity<Void> eliminarUsuario (@PathVariable int id){
		try {
			usuarioService.deleteById(id);
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	@PutMapping(value = "editar/{id}")
	private ResponseEntity<usuario> editarUsuario (@PathVariable int id, @RequestBody usuario usuario){
		if (!usuarioService.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		
		usuario.setId_usu(id);
		usuario nuevoUsuario = usuarioService.save(usuario);
		
		return ResponseEntity.ok(nuevoUsuario);
	}
}
