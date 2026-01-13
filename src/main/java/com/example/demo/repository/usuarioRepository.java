package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.usuario;

public interface usuarioRepository extends JpaRepository<usuario, Integer>{

	Optional<usuario> findByEmailusuAndPasswordusu(String email_usu, String password_usu);
}
