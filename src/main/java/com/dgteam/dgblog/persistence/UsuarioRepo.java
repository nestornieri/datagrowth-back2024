package com.dgteam.dgblog.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dgteam.dgblog.persistence.crud.IUsuarioRepo;
import com.dgteam.dgblog.persistence.entity.Usuario;

@Repository
public class UsuarioRepo {
	private IUsuarioRepo iUserRepo;
	
    public List<Usuario> getAll(){
        return (List<Usuario>) iUserRepo.findAll();
    }

}
