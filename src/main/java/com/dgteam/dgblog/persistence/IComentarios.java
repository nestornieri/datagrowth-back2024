package com.dgteam.dgblog.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dgteam.dgblog.domain.entity.Comentarios;


public interface IComentarios extends JpaRepository<Comentarios,Integer>{
    
}
