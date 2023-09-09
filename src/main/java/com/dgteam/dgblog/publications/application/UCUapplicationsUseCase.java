package com.dgteam.dgblog.publications.application;

import com.dgteam.dgblog.publications.domain.model.Applications;

import java.util.List;
import java.util.Optional;

public interface  UCUapplicationsUseCase {
    List<Applications> obtenerTodasLasApplications();
    Optional<Applications> obtenerApplicationsPorId(Long id);
}
