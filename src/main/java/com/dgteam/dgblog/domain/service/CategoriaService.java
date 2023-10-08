package com.dgteam.dgblog.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgteam.dgblog.domain.entity.Categoria;
import com.dgteam.dgblog.persistence.CategoriaRepo;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepo categoriaRepo;
    //Insertar nuevaCategoria
    public Categoria insertarCategoria(Categoria nuevaCategoria){
        return categoriaRepo.InsertarCategoria(nuevaCategoria);
    }

    //Listar categorias
    public List<Categoria> listarCategorias(){
        return categoriaRepo.listarCategorias();
    }
    //Encontrar categoria por Id
    public Optional<Categoria> EncontrarPorId(Integer idCategoria){
        return categoriaRepo.findCategoriById(idCategoria);
    }

    //Actulizar Categoria
    public Categoria UpdateCategoria(Categoria categoriaValidar){

        //Validar si esta categoria  existe
        Optional<Categoria> CategoriaOpcional = EncontrarPorId(categoriaValidar.getId());
        if(CategoriaOpcional.isPresent()){//Si existe la categorira
            Categoria categoriaEncontrada = new Categoria();
            categoriaEncontrada.setId(categoriaValidar.getId());
             categoriaEncontrada.setNombre(categoriaValidar.getNombre());
            return categoriaRepo.InsertarCategoria(categoriaEncontrada);
        }else{
        Categoria noEncontrada = new Categoria();
            noEncontrada.setNombre("No se encontro esta categoria");
            return noEncontrada;
        }
    }

}
