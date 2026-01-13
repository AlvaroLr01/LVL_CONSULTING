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

import com.example.demo.model.proyecto;
import com.example.demo.repository.proyectoRepository;

@Service
public class proyectoService {

	@Autowired
	private proyectoRepository proyectoRepository;

	public List<proyecto> findAll() {
		return proyectoRepository.findAll();
	}

	public <S extends proyecto> S save(S entity) {
		return proyectoRepository.save(entity);
	}

	public boolean existsById(Integer id) {
		return proyectoRepository.existsById(id);
	}

	public void deleteById(Integer id) {
		proyectoRepository.deleteById(id);
		
	}

	public void delete(proyecto entity) {
		proyectoRepository.delete(entity);
		
	}

	public List<proyecto> findAll(Sort sort) {
		return proyectoRepository.findAll();
	}

}
