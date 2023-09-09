package com.dgteam.dgblog.publications.domain.service;

import com.dgteam.dgblog.publications.application.UCUapplicationsUseCase;
import com.dgteam.dgblog.publications.domain.model.Applications;
import com.dgteam.dgblog.publications.domain.repository.IApplicationsRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationsService implements UCUapplicationsUseCase {
    private final IApplicationsRepo applicationsRepo;


    public ApplicationsService(IApplicationsRepo applicationsRepo) {
        this.applicationsRepo = applicationsRepo;
    }

    @Override
    public List<Applications> obtenerTodasLasApplications() {
        return (List<Applications>) applicationsRepo.findAll();
    }

    @Override
    public Optional<Applications> obtenerApplicationsPorId(Long id) {
        return applicationsRepo.findById(id);
    }
}
