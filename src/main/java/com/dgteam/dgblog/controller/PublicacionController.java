package com.dgteam.dgblog.controller;

import org.springframework.web.bind.annotation.RestController;

import com.dgteam.dgblog.domain.entity.Publicaciones;
import com.dgteam.dgblog.domain.service.PublicaionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PublicacionController {
    @Autowired
    private PublicaionService publicacionServicio;
    @GetMapping("/ListarPublicaciones")
    public List<Publicaciones> listPublicaciones() {
        return publicacionServicio.getAll()  ;
    }
    
}
