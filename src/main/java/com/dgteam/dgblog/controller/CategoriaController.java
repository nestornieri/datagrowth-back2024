package com.dgteam.dgblog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dgteam.dgblog.domain.entity.Categoria;
import com.dgteam.dgblog.domain.service.CategoriaService;

@RestController
public class CategoriaController {
    @Autowired
    private CategoriaService servicioCategoria;
    //Insertar Categoria
    @PostMapping("/NuevaCategoria")
    public Categoria InsertarNuevaCategoria(@RequestBody Categoria categoriNueva){
        return servicioCategoria.insertarCategoria(categoriNueva);
    }

    //Listar Categorias
    @GetMapping("/ListarCategorias")
    public List<Categoria> listarCategorias(){
        return servicioCategoria.listarCategorias();
    }

    //Listar categoria por id
    @GetMapping("/CategoriaPorId")
    public Optional<Categoria> encontrarCategoriaPorId(@RequestParam Integer id){
        return servicioCategoria.EncontrarPorId(id);
    }

    //Actualizar Categoria
    @PutMapping("/ActualizarCategoria")
    public Categoria UpdateCategoria(@RequestBody Categoria categoriaEnviada){
        return servicioCategoria.UpdateCategoria(categoriaEnviada);
    }

}
