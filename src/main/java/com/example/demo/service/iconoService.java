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

import com.example.demo.model.icono;
import com.example.demo.repository.iconoRespository;

@Service
public class iconoService {

	@Autowired
	private iconoRespository iconoRespository;


	public List<icono> findAll() {
		return iconoRespository.findAll();
	}

	public <S extends icono> S save(S entity) {
		return iconoRespository.save(entity);
	}

	public boolean existsById(Integer id) {
		return iconoRespository.existsById(id);
	}

	public void deleteById(Integer id) {
		iconoRespository.deleteById(id);
		
	}

	public void delete(icono entity) {
		iconoRespository.delete(entity);
		
	}

	public List<icono> findAll(Sort sort) {
		return iconoRespository.findAll();
	}

}
