package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "icono")
public class icono {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_ico;
	private String url_ico;
	
	public icono() {
	}

	public icono(String url_ico) {
		this.url_ico = url_ico;
	}

	public int getId_ico() {
		return id_ico;
	}

	public void setId_ico(int id_ico) {
		this.id_ico = id_ico;
	}

	public String getUrl_ico() {
		return url_ico;
	}

	public void setUrl_ico(String url_ico) {
		this.url_ico = url_ico;
	}

	
}
