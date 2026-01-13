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

import com.example.demo.model.categoria;
import com.example.demo.service.categoriaService;

@RestController
@RequestMapping("/categoria/")
public class categoriaRest {

	@Autowired
	private categoriaService categoriaService;
	
	@GetMapping
	private ResponseEntity<List<categoria>> getAllcategoria (){
		return ResponseEntity.ok(categoriaService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<categoria> guardarCategoria (@RequestBody categoria categoria){
		
		try {
			categoria categoriaGuardada = categoriaService.save(categoria);
			return ResponseEntity.created(new URI("/categoria/" + categoriaGuardada.getId_cat())).body(categoriaGuardada);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping(value = "delete/{id}")
	private ResponseEntity<Void> eliminarCategoria (@PathVariable int id){
		try {
			categoriaService.deleteById(id);
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	@PutMapping(value = "editar/{id}")
	private ResponseEntity<categoria> editarCategoria (@PathVariable int id, @RequestBody categoria categoria){
		if (!categoriaService.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		
		categoria.setId_cat(id);
		categoria nuevaCategoria = categoriaService.save(categoria);
		
		return ResponseEntity.ok(nuevaCategoria);
	}
}
