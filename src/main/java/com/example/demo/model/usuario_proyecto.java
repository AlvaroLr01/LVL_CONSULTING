package com.example.demo.model;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "usuario_proyecto")
public class usuario_proyecto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usu_pro;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp fecha_asignacion;
	
	@ManyToOne
	@JoinColumn(name = "id_usu")
	private usuario usuario;
	@ManyToOne
	@JoinColumn(name = "id_pro")
	private proyecto proyecto;
	
	public usuario_proyecto() {
	}

	public usuario_proyecto(Timestamp fecha_asignacion, com.example.demo.model.usuario usuario,
			com.example.demo.model.proyecto proyecto) {
		this.fecha_asignacion = fecha_asignacion;
		this.usuario = usuario;
		this.proyecto = proyecto;
	}

	public int getId_usu_pro() {
		return id_usu_pro;
	}

	public void setId_usu_pro(int id_usu_pro) {
		this.id_usu_pro = id_usu_pro;
	}

	public Timestamp getFecha_asignacion() {
		return fecha_asignacion;
	}

	public void setFecha_asignacion(Timestamp fecha_asignacion) {
		this.fecha_asignacion = fecha_asignacion;
	}

	public usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(usuario usuario) {
		this.usuario = usuario;
	}

	public proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(proyecto proyecto) {
		this.proyecto = proyecto;
	}

}
