package com.dgteam.dgblog.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dgteam.dgblog.domain.entity.Usuario;

@Repository
public class UsuarioRepo {

    @Autowired
	private IUsuarioRepo iUserRepo;
	
    public List<Usuario> getUsers(){
        return (List<Usuario>) iUserRepo.findAll();
    }
    
    public Usuario createUser(Usuario usuario) {
		return iUserRepo.save(usuario);
    }

    public Optional<Usuario> getUser(Integer id) {
        return iUserRepo.findById(id);
    }

    public void deleteUser(Integer id) {
        iUserRepo.deleteById(id);
    }

    public boolean existEmail(String email) {
        return iUserRepo.existsByEmail(email);
    }

}
