package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "usuario")
public class usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_usu;
	private String email_usu;
	private String password_usu;
	private String nombre_usu;
	private String apellido_usu;
	private String telefono;
	private String cargo_usu;
	private String empresa_usu;
	private String foto_url_usu;
	
	public usuario() {
	}

	public usuario(String email_usu, String password_usu, String nombre_usu, String apellido_usu, String telefono,
			String cargo_usu, String empresa_usu, String foto_url_usu) {
		super();
		this.email_usu = email_usu;
		this.password_usu = password_usu;
		this.nombre_usu = nombre_usu;
		this.apellido_usu = apellido_usu;
		this.telefono = telefono;
		this.cargo_usu = cargo_usu;
		this.empresa_usu = empresa_usu;
		this.foto_url_usu = foto_url_usu;
	}

	public int getId_usu() {
		return id_usu;
	}

	public void setId_usu(int id_usu) {
		this.id_usu = id_usu;
	}

	public String getEmail_usu() {
		return email_usu;
	}

	public void setEmail_usu(String email_usu) {
		this.email_usu = email_usu;
	}

	public String getPassword_usu() {
		return password_usu;
	}

	public void setPassword_usu(String password_usu) {
		this.password_usu = password_usu;
	}

	public String getNombre_usu() {
		return nombre_usu;
	}

	public void setNombre_usu(String nombre_usu) {
		this.nombre_usu = nombre_usu;
	}

	public String getApellido_usu() {
		return apellido_usu;
	}

	public void setApellido_usu(String apellido_usu) {
		this.apellido_usu = apellido_usu;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCargo_usu() {
		return cargo_usu;
	}

	public void setCargo_usu(String cargo_usu) {
		this.cargo_usu = cargo_usu;
	}

	public String getEmpresa_usu() {
		return empresa_usu;
	}

	public void setEmpresa_usu(String empresa_usu) {
		this.empresa_usu = empresa_usu;
	}

	public String getFoto_url_usu() {
		return foto_url_usu;
	}

	public void setFoto_url_usu(String foto_url_usu) {
		this.foto_url_usu = foto_url_usu;
	}

	
}
