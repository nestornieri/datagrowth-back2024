package com.dgteam.dgblog.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgteam.dgblog.domain.entity.Comentarios;
import com.dgteam.dgblog.persistence.ComentarioRepo;
@Service
public class ComentarioService {
	
	@Autowired
    private  ComentarioRepo repoComentario ;
	
	public List<Comentarios> getAll(){
        return  repoComentario.getAll();
    }
    //Obtener Por id
    public Optional<Comentarios> obterPorIdComentarios(Integer id){
        return repoComentario.obtComentariosPorId(id);
    }
    //Insertar una publicacion
    public Comentarios insertarComentario(Comentarios ComentariosNueva){
        return repoComentario.isertarComentarios(ComentariosNueva);
    }
    //Actualizar Publicacion 
    public Comentarios acatulailzarComentario(Comentarios ComentariosActualizar){
        return repoComentario.actualizarCoemntarios(ComentariosActualizar);
    }
    
    public void eliminarComentario(Integer idInteger){
        repoComentario.elimiarComentario(idInteger);
    }
}
