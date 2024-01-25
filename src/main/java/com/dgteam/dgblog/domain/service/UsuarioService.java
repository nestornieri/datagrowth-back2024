package com.dgteam.dgblog.domain.service;

import java.util.List;
import java.util.Optional;

import com.dgteam.dgblog.persistence.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgteam.dgblog.domain.entity.Usuario;
import com.dgteam.dgblog.persistence.IUsuarioRepo;



@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepo usuarioRepo;
	

	public List<Usuario> getAll() {
		return (List<Usuario>) usuarioRepo.getUsers();
	}
	
	public Usuario save(Usuario usuario) {
		return usuarioRepo.createUser(usuario);
	}
	
	public Optional<Usuario> getId(int id) {
		return usuarioRepo.getUser(id);
	}
	
	public void deleteById(int id) {
		usuarioRepo.deleteUser(id);
	}

	


}
