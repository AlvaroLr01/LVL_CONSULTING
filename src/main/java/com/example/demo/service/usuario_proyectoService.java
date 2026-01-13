package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.demo.model.usuario_proyecto;
import com.example.demo.repository.usuario_proyectoRepository;

@Service
public class usuario_proyectoService {

	@Autowired
	private usuario_proyectoRepository usuario_proyectoRepository;

	public List<usuario_proyecto> findAll() {
		return usuario_proyectoRepository.findAll();
	}

	public <S extends usuario_proyecto> S save(S entity) {
		return usuario_proyectoRepository.save(entity);
	}

	public boolean existsById(Integer id) {
		return usuario_proyectoRepository.existsById(id);
	}

	public void deleteById(Integer id) {
		usuario_proyectoRepository.deleteById(id);
		
	}

	public void delete(usuario_proyecto entity) {
		usuario_proyectoRepository.delete(entity);
		
	}

	public List<usuario_proyecto> findAll(Sort sort) {
		return usuario_proyectoRepository.findAll(sort);
	}

}
