package com.dgteam.dgblog.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgteam.dgblog.persistence.crud.IUsuarioRepo;
import com.dgteam.dgblog.persistence.entity.Usuario;


@Service
public class UsuarioService implements IUsuarioService {
	
	@Autowired
	private IUsuarioRepo iUsuarioRepo;
	

	public List<Usuario> getAll() {
		return (List<Usuario>) iUsuarioRepo.findAll();		
	}
	


}
