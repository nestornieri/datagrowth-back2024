package com.dgteam.dgblog.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dgteam.dgblog.domain.entity.Publicaciones;

@Repository
public class PublicacionRepo {
    @Autowired
    private IPublicaciones iPublicacion;

    public List<Publicaciones> getAll(){
        return iPublicacion.findAll() ;
    }


}
