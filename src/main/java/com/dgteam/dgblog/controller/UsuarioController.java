package com.dgteam.dgblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dgteam.dgblog.domain.service.UsuarioService;
import com.dgteam.dgblog.persistence.entity.Usuario;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
    @GetMapping("/all")
    public List<Usuario> getAll() {
        return usuarioService.getAll();
    }

}
