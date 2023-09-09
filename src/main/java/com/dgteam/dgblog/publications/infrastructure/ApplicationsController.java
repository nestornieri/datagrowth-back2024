package com.dgteam.dgblog.publications.infrastructure;

import com.dgteam.dgblog.publications.domain.model.applications;
import com.dgteam.dgblog.publications.domain.service.ApplicationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
    @RequestMapping("/api/applications")
    public class ApplicationsController {

        private final ApplicationsService applicationsService;

        @Autowired
        public ApplicationsController(ApplicationsService applicationsService) {
            this.applicationsService = applicationsService;
        }

    @GetMapping("/{id}") // Mapeo para obtener una aplicación por su ID
    public ResponseEntity<applications> obtenerApplicationPorId(@PathVariable Long id) {
        Optional<applications> application = applicationsService.obtenerApplicationsPorId(id);

        if (application.isPresent()) {
            return ResponseEntity.ok(application.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

        // Otros controladores y métodos relacionados con aplicaciones
    }

