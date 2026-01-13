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

import com.example.demo.model.estado_proyecto;
import com.example.demo.service.estado_proyecttoService;

@RestController
@RequestMapping("/estado_proyecto/")
public class estado_proyectoRest {

	@Autowired
	private estado_proyecttoService estado_proyecttoService;
	
	@GetMapping
	private ResponseEntity<List<estado_proyecto>> getAllestado_proyecto (){
		return ResponseEntity.ok(estado_proyecttoService.findAll());
	}

	@PostMapping
	private ResponseEntity<estado_proyecto> guardarEstado (@RequestBody estado_proyecto estado_proyecto){
		try {
			estado_proyecto estadoGuardado = estado_proyecttoService.save(estado_proyecto);
			return ResponseEntity.created(new URI("/estado_proyecto/" + estadoGuardado.getId_est())).body(estadoGuardado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping(value = "delete/{id}")
	private ResponseEntity<Void> eliminarEstado (@PathVariable int id){
		try {
			estado_proyecttoService.deleteById(id);
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	@PutMapping(value = "editar/{id}")
	private ResponseEntity<estado_proyecto> editarCategoria (@PathVariable int id, @RequestBody estado_proyecto estado_proyecto){
		if (!estado_proyecttoService.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		
		estado_proyecto.setId_est(id);
		estado_proyecto nuevoEstado = estado_proyecttoService.save(estado_proyecto);
		
		return ResponseEntity.ok(nuevoEstado);
	}
}
