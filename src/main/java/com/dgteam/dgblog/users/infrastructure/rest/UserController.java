package com.dgteam.dgblog.users.infrastructure.rest;

import com.dgteam.dgblog.users.domain.model.User;
import com.dgteam.dgblog.users.domain.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getProduct (@PathVariable Long id){
        return new ResponseEntity<>(this.userService.getUserById(id), HttpStatus.OK);

    }
}
