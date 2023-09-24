package com.dgteam.dgblog.domain.service;

import java.util.List;

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
	


}
