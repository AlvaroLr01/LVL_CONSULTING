package com.example.demo.model;

import jakarta.persistence.Column;
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
	@Column(name = "email_usu")
	private String emailusu;
	@Column(name = "password_usu")
	private String passwordusu;
	private String nombre_usu;
	private String apellido_usu;
	private String telefono;
	private String cargo_usu;
	private String empresa_usu;
	private String foto_url_usu;
	
	public usuario() {
	}

	public usuario(String emailusu, String passwordusu, String nombre_usu, String apellido_usu, String telefono,
			String cargo_usu, String empresa_usu, String foto_url_usu) {
		super();
		this.emailusu = emailusu;
		this.passwordusu = passwordusu;
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

	public String getEmailusu() {
		return emailusu;
	}

	public void setEmailusu(String emailusu) {
		this.emailusu = emailusu;
	}

	public String getPasswordusu() {
		return passwordusu;
	}

	public void setPasswordusu(String passwordusu) {
		this.passwordusu = passwordusu;
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
