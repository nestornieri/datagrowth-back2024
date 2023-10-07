package com.dgteam.dgblog.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dgteam.dgblog.domain.entity.Usuario;

@Repository
public class UsuarioRepo {
	
	private IUsuarioRepo iUserRepo;
	
    public List<Usuario> getAll(){
        return (List<Usuario>) iUserRepo.findAll();
    }
    
    public Usuario guardar(Usuario usuario) {
		return iUserRepo.save(usuario);
    	
    }

}
