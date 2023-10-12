package com.dgteam.dgblog.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dgteam.dgblog.domain.entity.Comentarios;
import com.dgteam.dgblog.domain.service.ComentarioService;

@RestController
public class ComentariosController {
	
	@Autowired
    private ComentarioService serviceComentarios;
	

    @GetMapping("/ListaComentarios")
    public List<Comentarios> ListaComentarios() {
        return  serviceComentarios.getAll();
    }
    @GetMapping("/ListarPorIdComentarios")
    public Optional<Comentarios> ListarPorIdComentarios(@RequestParam Integer id) {
        return  serviceComentarios.obterPorIdComentarios(id);
    }
    @GetMapping("/NuevoComentario")
    public Comentarios NuevoComentario(@RequestBody Comentarios NuevoComentario) {
        return  serviceComentarios.insertarComentario(NuevoComentario);
    }
    
    @PutMapping("/ActualizarCoementario")
    public Comentarios updateComentarios(@RequestBody Comentarios NuevoComentario) {
        // Primero comprobaremos si este ID de publicacion Existe
        Optional<Comentarios> Comentarioptional = serviceComentarios.obterPorIdComentarios(NuevoComentario.getId());
        // La linea anterior devolvera un null si no existe
        Comentarios ComentariosActualizar = new Comentarios();
        if (Comentarioptional.isPresent()) {
            // Quiere decire que si existe una publicacion con este ID
        	ComentariosActualizar.setId(NuevoComentario.getId());
        	ComentariosActualizar.setContenido(NuevoComentario.getContenido());
        	ComentariosActualizar.setFecha_comentario(NuevoComentario.getFecha_comentario());
        	ComentariosActualizar.setAutor_id(NuevoComentario.getAutor_id());
        	ComentariosActualizar.setPublicacion_id(NuevoComentario.getPublicacion_id());
            return serviceComentarios.acatulailzarComentario(ComentariosActualizar);
        } else {
            
       
          
         

                        return null;

        }

    }
    
    @DeleteMapping("/EliminarComentario")
    public void eliminarComentario(@RequestParam Integer id){
    	serviceComentarios.eliminarComentario(id);
    }
}
    



