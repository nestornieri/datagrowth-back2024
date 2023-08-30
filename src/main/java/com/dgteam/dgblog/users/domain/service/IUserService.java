package com.dgteam.dgblog.users.domain.service;


import com.dgteam.dgblog.users.domain.model.User;

import java.util.Optional;

public interface IUserService {
    Optional<User> getUserById (Long id);

}
