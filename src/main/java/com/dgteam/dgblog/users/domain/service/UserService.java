package com.dgteam.dgblog.users.domain.service;


import com.dgteam.dgblog.users.domain.model.User;
import com.dgteam.dgblog.users.domain.respository.IUserRepo;

import java.util.Optional;

public class UserService implements IUserService {
    private final IUserRepo iUserRepo;

    public UserService(IUserRepo iUserRepo) {
        this.iUserRepo = iUserRepo;
    }

    @Override
    public User getUserById(Long id) {
        return this.iUserRepo.getProductbyId(id);
    }
}
