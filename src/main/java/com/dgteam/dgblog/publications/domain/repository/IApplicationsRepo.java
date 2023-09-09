package com.dgteam.dgblog.publications.domain.repository;

import com.dgteam.dgblog.publications.domain.model.Applications;
import org.springframework.data.repository.CrudRepository;

public interface IApplicationsRepo extends CrudRepository<Applications,Long> {
}
