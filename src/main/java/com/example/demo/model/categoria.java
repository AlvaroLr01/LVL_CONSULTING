package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "categoria")
public class categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cat;
	private String nombre_cat;
	
	
	public categoria() {
	}


	public categoria(String nombre_cat) {
		this.nombre_cat = nombre_cat;
	}


	public int getId_cat() {
		return id_cat;
	}


	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
	}


	public String getNombre_cat() {
		return nombre_cat;
	}


	public void setNombre_cat(String nombre_cat) {
		this.nombre_cat = nombre_cat;
	}
}
