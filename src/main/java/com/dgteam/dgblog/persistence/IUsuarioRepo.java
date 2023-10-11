package com.dgteam.dgblog.persistence;


import org.springframework.data.repository.CrudRepository;

import com.dgteam.dgblog.domain.entity.Usuario;

public interface IUsuarioRepo  extends CrudRepository<Usuario, Integer>{


}
