package com.dgteam.dgblog.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dgteam.dgblog.domain.entity.Publicaciones;

@Repository
public class PublicacionRepo {
    @Autowired
    private IPublicaciones iPublicacion;

    public List<Publicaciones> getAll() {
        return iPublicacion.findAll();
    }

    public Optional<Publicaciones> obtPublicacionesPorId(Integer id) {
        return iPublicacion.findById(id);
    }

    // Metodo insertar un nuevo usuario
    public Publicaciones isertarPublicacion(Publicaciones publicacionInsertar) {
        return iPublicacion.save(publicacionInsertar);
    }

    // Actulizar publicacion
    public Publicaciones actualizarPublicacion(Publicaciones publicacionActualizar) {
        return iPublicacion.save(publicacionActualizar);
    }

    // Eliminar publicaciones
    public void elimiarPublicacione(Integer id) {
        iPublicacion.deleteById(id);
    }

}
