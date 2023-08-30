package com.dgteam.dgblog.users.domain.respository;

import com.dgteam.dgblog.users.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface IUserRepo extends CrudRepository<User, Long> {
    //User getProductbyId (Long id);
}
