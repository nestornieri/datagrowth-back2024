package com.dgteam.dgblog.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dgteam.dgblog.domain.entity.Publicaciones;

public interface IPublicaciones extends JpaRepository<Publicaciones,Integer>{
    
}
