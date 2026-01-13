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

import com.example.demo.model.icono;
import com.example.demo.service.iconoService;

@RestController
@RequestMapping("/icono/")
public class iconoRest {

	@Autowired
	private iconoService iconoService;
	
	@GetMapping
	private ResponseEntity<List<icono>> getAllicono () {
		return ResponseEntity.ok(iconoService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<icono> guardarIcono (@RequestBody icono icono){
		try {
			icono guardarIcono = iconoService.save(icono);
			return ResponseEntity.created(new URI("/icono/" + guardarIcono.getId_ico())).body(guardarIcono);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping(value = "delete/{id}")
	private ResponseEntity<icono> eliminarIcono (@PathVariable int id){
		try {
			iconoService.deleteById(id);
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	@PutMapping(value = "editar/{id}")
	private ResponseEntity<icono> editarIcono (@PathVariable int id, @RequestBody icono icono){
		if (!iconoService.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		
		icono.setId_ico(id);
		icono nuevoIcono = iconoService.save(icono);
		
		return ResponseEntity.ok(nuevoIcono);
	}
}
