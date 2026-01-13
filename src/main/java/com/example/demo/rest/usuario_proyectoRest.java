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

import com.example.demo.model.usuario_proyecto;
import com.example.demo.service.usuario_proyectoService;

@RestController
@RequestMapping("/usuario_proyecto/")
public class usuario_proyectoRest {

	@Autowired
	private usuario_proyectoService usuario_proyectoService;
	
	@GetMapping
	private ResponseEntity<List<usuario_proyecto>> getAllusuario_proyecto (){
		return ResponseEntity.ok(usuario_proyectoService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<usuario_proyecto> guargarDetalle (@RequestBody usuario_proyecto usuario_proyecto){
		try {
			usuario_proyecto detalleGuardado = usuario_proyectoService.save(usuario_proyecto);
			return ResponseEntity.created(new URI("/usuario_proyecto/" + detalleGuardado.getId_usu_pro())).body(detalleGuardado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping(value = "delete/{id}")
	private ResponseEntity<Void> eliminarDetalle (@PathVariable int id){
		try {
			usuario_proyectoService.deleteById(id);
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	@PutMapping(value = "editar/{id}")
	private ResponseEntity<usuario_proyecto> editarDetalle (@PathVariable int id, @RequestBody usuario_proyecto usuario_proyecto){
		if (!usuario_proyectoService.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		
		usuario_proyecto.setId_usu_pro(id);
		usuario_proyecto actualizarDetalle = usuario_proyectoService.save(usuario_proyecto);
		return ResponseEntity.ok(actualizarDetalle);
	}
}
