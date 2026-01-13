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

import com.example.demo.model.categoria;
import com.example.demo.repository.categoriaRepository;

@Service
public class categoriaService {

	@Autowired
	private categoriaRepository categoriaRepository;


	public List<categoria> findAll() {
		return categoriaRepository.findAll();
	}

	public <S extends categoria> S save(S entity) {
		return categoriaRepository.save(entity);
	}

	public boolean existsById(Integer id) {
		return categoriaRepository.existsById(id);
	}

	public void deleteById(Integer id) {
		categoriaRepository.deleteById(id);
		
	}

	public void delete(categoria entity) {
		categoriaRepository.delete(entity);
		
	}

	public List<categoria> findAll(Sort sort) {
		return categoriaRepository.findAll(sort);
	}
	
}
