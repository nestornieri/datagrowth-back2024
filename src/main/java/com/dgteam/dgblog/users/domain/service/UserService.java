package com.dgteam.dgblog.users.domain.service;


import com.dgteam.dgblog.users.domain.model.User;
import com.dgteam.dgblog.users.domain.respository.IUserRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService implements IUserService {
    private final IUserRepo iUserRepo;

    public UserService(IUserRepo iUserRepo) {
        this.iUserRepo = iUserRepo;
    }

    @Override
    public Optional<User> getUserById(Long id) { //ver info del usuario por id
        return this.iUserRepo.findById(id);
    }

    // ver contactos del usuario


}
