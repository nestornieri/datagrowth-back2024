package com.dgteam.dgblog.publications.application;

import com.dgteam.dgblog.publications.domain.model.applications;

import java.util.List;
import java.util.Optional;

public interface  UCUapplicationsUseCase {
    List<applications> obtenerTodasLasApplications();
    Optional<applications> obtenerApplicationsPorId(Long id);
}
