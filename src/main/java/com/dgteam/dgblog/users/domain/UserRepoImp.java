package com.dgteam.dgblog.users.domain;

import com.dgteam.dgblog.users.domain.model.User;
import com.dgteam.dgblog.users.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepoImp   {

    @Autowired
    private UserService userService;
    public Optional<User> getUser(Long id) {
        return userService.getUserById(id);
    }
}
