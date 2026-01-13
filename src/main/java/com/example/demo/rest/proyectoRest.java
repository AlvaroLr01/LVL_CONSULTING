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

import com.example.demo.model.proyecto;
import com.example.demo.service.proyectoService;

@RestController
@RequestMapping("/proyecto/")
public class proyectoRest {

	@Autowired
	private proyectoService proyectoService;
	
	@GetMapping
	private ResponseEntity<List<proyecto>> getAllproyecto () {
		return ResponseEntity.ok(proyectoService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<proyecto> guardarProyecto (@RequestBody proyecto proyecto){
		
		try {
			proyecto proyectoGuardado = proyectoService.save(proyecto);
			return ResponseEntity.created(new URI("/proyecto/" + proyectoGuardado.getId_pro())).body(proyectoGuardado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping(value = "delete/{id}")
	private ResponseEntity<Void> eliminarProyecto (@PathVariable int id){
		try {
			proyectoService.deleteById(id);
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	@PutMapping(value = "editar/{id}")
	private ResponseEntity<proyecto> editarProyecto (@PathVariable int id, @RequestBody proyecto proyecto){
		if (!proyectoService.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		
		proyecto.setId_pro(id);
		proyecto nuevoProyecto = proyectoService.save(proyecto);
		
		return ResponseEntity.ok(nuevoProyecto);
	}
}
