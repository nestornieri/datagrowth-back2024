package com.dgteam.dgblog.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgteam.dgblog.domain.entity.Usuario;
import com.dgteam.dgblog.persistence.IUsuarioRepo;



@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioRepo iUsuarioRepo;
	

	public List<Usuario> getAll() {
		return (List<Usuario>) iUsuarioRepo.findAll();		
	}
	
	public Usuario save(Usuario usuario) {
		return iUsuarioRepo.save(usuario);
	}
	
	public Optional<Usuario> getId(int id) {
		return iUsuarioRepo.findById(id);
	}
	
	public void deleteById(int id) {
		iUsuarioRepo.deleteById(id);
	}

	


}
