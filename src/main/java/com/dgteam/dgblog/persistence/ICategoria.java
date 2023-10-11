package com.dgteam.dgblog.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.dgteam.dgblog.domain.entity.Categoria;

public interface ICategoria extends JpaRepository<Categoria,Integer> {
    
}
