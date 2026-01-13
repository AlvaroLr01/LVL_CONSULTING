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

import com.example.demo.model.usuario;
import com.example.demo.repository.usuarioRepository;

@Service
public class usuarioService {

	@Autowired
	private usuarioRepository usuarioRepository;

	public List<usuario> findAll() {
		return usuarioRepository.findAll();
	}

	public <S extends usuario> S save(S entity) {
		return usuarioRepository.save(entity);
	}

	public boolean existsById(Integer id) {
		return usuarioRepository.existsById(id);
	}

	public void deleteById(Integer id) {
		usuarioRepository.deleteById(id);
		
	}

	public void delete(usuario entity) {
		usuarioRepository.delete(entity);
		
	}

	public List<usuario> findAll(Sort sort) {
		return usuarioRepository.findAll(sort);
	}

}
