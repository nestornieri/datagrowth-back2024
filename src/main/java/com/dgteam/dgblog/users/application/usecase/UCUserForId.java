package com.dgteam.dgblog.users.application.usecase;

import com.dgteam.dgblog.users.domain.UserRepoImp;
import com.dgteam.dgblog.users.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UCUserForId {

    @Autowired
    private UserRepoImp userRepoImp;

    public Optional<User> ucuserforid(long id) {
        return userRepoImp.getUser(id);
    }
}
