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

import com.example.demo.model.estado_proyecto;
import com.example.demo.repository.estado_proyectoRepository;

@Service
public class estado_proyecttoService {

	@Autowired
	private estado_proyectoRepository estado_proyectoRepository;

	public List<estado_proyecto> findAll() {
		return estado_proyectoRepository.findAll();
	}

	public <S extends estado_proyecto> S save(S entity) {
		return estado_proyectoRepository.save(entity);
	}

	public boolean existsById(Integer id) {
		return estado_proyectoRepository.existsById(id);
	}

	public void deleteById(Integer id) {
		estado_proyectoRepository.deleteById(id);
		
	}

	public void delete(estado_proyecto entity) {
		estado_proyectoRepository.delete(entity);
		
	}

	public List<estado_proyecto> findAll(Sort sort) {
		return estado_proyectoRepository.findAll(sort);
	}

}
