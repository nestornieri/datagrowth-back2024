package com.dgteam.dgblog.persistence.crud;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dgteam.dgblog.persistence.entity.Usuario;

public interface IUsuarioRepo  extends CrudRepository<Usuario, Integer>{


}
