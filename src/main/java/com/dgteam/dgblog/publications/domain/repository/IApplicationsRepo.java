package com.dgteam.dgblog.publications.domain.repository;

import com.dgteam.dgblog.publications.domain.model.applications;
import org.springframework.data.repository.CrudRepository;

public interface IApplicationsRepo extends CrudRepository<applications,Long> {
}
