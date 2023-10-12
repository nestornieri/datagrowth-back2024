package com.dgteam.dgblog.domain.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comentarios")
public class Comentarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String contenido;
    private Date fecha_comentario;
    private Integer autor_id;
    private Integer publicacion_id;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public Date getFecha_comentario() {
		return fecha_comentario;
	}
	public void setFecha_comentario(Date fecha_comentario) {
		this.fecha_comentario = fecha_comentario;
	}
	public Integer getAutor_id() {
		return autor_id;
	}
	public void setAutor_id(Integer autor_id) {
		this.autor_id = autor_id;
	}
	public Integer getPublicacion_id() {
		return publicacion_id;
	}
	public void setPublicacion_id(Integer publicacion_id) {
		this.publicacion_id = publicacion_id;
	}
	
     
    
    
    
}
