package com.dgteam.dgblog.controller;

import org.springframework.web.bind.annotation.RestController;

import com.dgteam.dgblog.domain.entity.Publicaciones;
import com.dgteam.dgblog.domain.service.PublicaionService;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class PublicacionController {
    @Autowired
    private PublicaionService publicacionServicio;

    @GetMapping("/ListarPublicaciones")
    public List<Publicaciones> listPublicaciones() {
        return publicacionServicio.getAll();
    }

    @GetMapping("/PublicacionesPorId")
    public Optional<Publicaciones> publicacionesPorId(@RequestParam Integer id) {
        return publicacionServicio.obterPorIdPublicaciones(id);
    }

    @PostMapping("/NuevaPublicacion")
    public Publicaciones nuevaPublicacion(@RequestBody Publicaciones nuevaPublicacion) {
        return publicacionServicio.insertarPublicacion(nuevaPublicacion);
    }

    @PutMapping("/ActualizarPublicacion")
    public Publicaciones updatePublicaciones(@RequestBody Publicaciones nuevaPublicacion) {
        // Primero comprobaremos si este ID de publicacion Existe
        Optional<Publicaciones> publiOptional = publicacionServicio.obterPorIdPublicaciones(nuevaPublicacion.getId());
        // La linea anterior devolvera un null si no existe
        Publicaciones publicacionActualizar = new Publicaciones();
        if (publiOptional.isPresent()) {
            // Quiere decire que si existe una publicacion con este ID
            publicacionActualizar.setId(nuevaPublicacion.getId());
            publicacionActualizar.setAutor_id(nuevaPublicacion.getAutor_id());
            publicacionActualizar.setContenido(nuevaPublicacion.getContenido());
            publicacionActualizar.setFecha_publicacion(nuevaPublicacion.getFecha_publicacion());
            publicacionActualizar.setTitulo(nuevaPublicacion.getTitulo());
            return publicacionServicio.insertarPublicacion(publicacionActualizar);
        } else {
            publicacionActualizar.setAutor_id(nuevaPublicacion.getAutor_id());
            publicacionActualizar.setContenido("No se encontro el id de esta publicacion");
            publicacionActualizar.setFecha_publicacion(new Timestamp(0, 00, 0, 0,0 , 0, 0));
            publicacionActualizar.setTitulo("No se encontro el id de esta publicacion");

                        return publicacionActualizar;

        }

    }

    //Controlador Eliminar
    @DeleteMapping("/EliminarPublicacion")
    public void eliminarProducto(@RequestParam Integer id){
        publicacionServicio.eliminarPublicacion(id);
    }

}
