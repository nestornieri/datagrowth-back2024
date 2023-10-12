package com.dgteam.dgblog.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dgteam.dgblog.domain.entity.Comentarios;

@Repository
public class ComentarioRepo {
  
	@Autowired
    private IComentarios iComentarios;

	  public List<Comentarios> getAll() {
	        return iComentarios.findAll();
	    }

	    public Optional<Comentarios> obtComentariosPorId(Integer id) {
	        return iComentarios.findById(id);
	    }

	    // 
	    public Comentarios isertarComentarios(Comentarios comentariosInsertar) {
	        return iComentarios.save(comentariosInsertar);
	    }
	    
	    public Comentarios actualizarCoemntarios(Comentarios comentarioActualizar) {
	        return iComentarios.save(comentarioActualizar);
	    }
	    
	    public void elimiarComentario(Integer id) {
	        iComentarios.deleteById(id);
	    }

    }
