package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "proyecto")
public class proyecto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_pro;
	private String codigo_pro;
	private String nombre_pro;
	private String descripcion_pro;
	private Date fecha_inicio_pro;
	private Date fecha_fin_pro;
	
	@ManyToOne
	@JoinColumn(name = "id_est")
	private estado_proyecto estado;
	@ManyToOne
	@JoinColumn(name = "id_ico")
	private icono icono;
	@ManyToOne
	@JoinColumn(name = "id_cat")
	private categoria categoria;
	
	public proyecto() {
	}

	public proyecto(String codigo_pro, String nombre_pro, String descripcion_pro, Date fecha_inicio_pro,
			Date fecha_fin_pro, estado_proyecto estado, com.example.demo.model.icono icono,
			com.example.demo.model.categoria categoria) {
		this.codigo_pro = codigo_pro;
		this.nombre_pro = nombre_pro;
		this.descripcion_pro = descripcion_pro;
		this.fecha_inicio_pro = fecha_inicio_pro;
		this.fecha_fin_pro = fecha_fin_pro;
		this.estado = estado;
		this.icono = icono;
		this.categoria = categoria;
	}

	public int getId_pro() {
		return id_pro;
	}

	public void setId_pro(int id_pro) {
		this.id_pro = id_pro;
	}

	public String getCodigo_pro() {
		return codigo_pro;
	}

	public void setCodigo_pro(String codigo_pro) {
		this.codigo_pro = codigo_pro;
	}

	public String getNombre_pro() {
		return nombre_pro;
	}

	public void setNombre_pro(String nombre_pro) {
		this.nombre_pro = nombre_pro;
	}

	public String getDescripcion_pro() {
		return descripcion_pro;
	}

	public void setDescripcion_pro(String descripcion_pro) {
		this.descripcion_pro = descripcion_pro;
	}

	public Date getFecha_inicio_pro() {
		return fecha_inicio_pro;
	}

	public void setFecha_inicio_pro(Date fecha_inicio_pro) {
		this.fecha_inicio_pro = fecha_inicio_pro;
	}

	public Date getFecha_fin_pro() {
		return fecha_fin_pro;
	}

	public void setFecha_fin_pro(Date fecha_fin_pro) {
		this.fecha_fin_pro = fecha_fin_pro;
	}

	public estado_proyecto getEstado() {
		return estado;
	}

	public void setEstado(estado_proyecto estado) {
		this.estado = estado;
	}

	public icono getIcono() {
		return icono;
	}

	public void setIcono(icono icono) {
		this.icono = icono;
	}

	public categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
