package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "estado_proyecto")
public class estado_proyecto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_est;
	private String nombre_est;
	
	public estado_proyecto() {
	}

	public estado_proyecto(String nombre_est) {
		this.nombre_est = nombre_est;
	}

	public int getId_est() {
		return id_est;
	}

	public void setId_est(int id_est) {
		this.id_est = id_est;
	}

	public String getNombre_est() {
		return nombre_est;
	}

	public void setNombre_est(String nombre_est) {
		this.nombre_est = nombre_est;
	}
	
	
}
