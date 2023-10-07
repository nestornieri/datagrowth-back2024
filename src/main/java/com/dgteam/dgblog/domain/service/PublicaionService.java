package com.dgteam.dgblog.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgteam.dgblog.domain.entity.Publicaciones;
import com.dgteam.dgblog.persistence.PublicacionRepo;

@Service
public class PublicaionService {
    @Autowired
    private PublicacionRepo rPublicacionRepo;
    // listar
    public List<Publicaciones> getAll(){
        return rPublicacionRepo.getAll();
    }

}
