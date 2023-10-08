package com.dgteam.dgblog.domain.service;

import java.util.List;
import java.util.Optional;

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
    //Obtener Por id
    public Optional<Publicaciones> obterPorIdPublicaciones(Integer id){
        return rPublicacionRepo.obtPublicacionesPorId(id);
    }
    //Insertar una publicacion
    public Publicaciones insertarPublicacion(Publicaciones publicacionNueva){
        return rPublicacionRepo.isertarPublicacion(publicacionNueva);
    }
    //Actualizar Publicacion 
    public Publicaciones acatulailzarPublicacion(Publicaciones publicacionActualizar){
        return rPublicacionRepo.actualizarPublicacion(publicacionActualizar);
    }
    //Eliminar repositorio
    public void eliminarPublicacion(Integer idInteger){
        rPublicacionRepo.elimiarPublicacione(idInteger);
    }
}
