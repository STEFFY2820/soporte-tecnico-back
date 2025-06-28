package com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "det_preg_frecuentes")
public class DetPregFrecuentes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String titulo;
	private String descripcion;

	@Column(name = "preg_frec_id")
	private Long preguntaFrecuenteId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getPreguntaFrecuenteId() {
		return preguntaFrecuenteId;
	}

	public void setPreguntaFrecuenteId(Long preguntaFrecuenteId) {
		this.preguntaFrecuenteId = preguntaFrecuenteId;
	} 

	
	
}



