package com.dgteam.dgblog.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dgteam.dgblog.domain.entity.Categoria;

@Repository
public class CategoriaRepo {
    @Autowired
    private ICategoria iCategoria;

    // Insertar Categoria
    public Categoria InsertarCategoria(Categoria nuevCategoria) {
        return iCategoria.save(nuevCategoria);
    }
    //Listar Categorias
    public List<Categoria> listarCategorias(){
        return iCategoria.findAll();
    }
    //Listar Categoria por Id
    public Optional<Categoria> findCategoriById(Integer idCategoria){
        return iCategoria.findById(idCategoria);
    }
    //Actualizar Categoria
    public Categoria  ActualizarCategoria(Categoria categoria){
        return iCategoria.save(categoria);   }
    }
