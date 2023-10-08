package com.dgteam.dgblog.domain.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "publicaciones")
public class Publicaciones {
    /*Para las llaves foraneas se uso el sigueinte video informativo
     * https://www.youtube.com/watch?v=kuFBlxwsDFc
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String titulo;
    private String contenido;
    private Timestamp fecha_publicacion;
   // @ManyToOne
    //@JoinColumn(name = "autor_id", referencedColumnName = "id")
    private Integer autor_id;
    //hasta donde se entiende referencedColumnName , debe hacer referencia 
    //al nombre de la columa en del mismo MySql
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Timestamp getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(Timestamp fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public Integer getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(Integer autor_id) {
        this.autor_id = autor_id;
    }

    

}
