package com.dgteam.dgblog.users.infrastructure.rest;

import com.dgteam.dgblog.users.application.usecase.UCUserForId;
import com.dgteam.dgblog.users.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private final UCUserForId ucUserForId;

    public UserController(UCUserForId ucUserForId) {
        this.ucUserForId = ucUserForId;
    }



    /*@GetMapping("/{id}")
    public ResponseEntity<User> getProduct (@PathVariable Long id){
        return new ResponseEntity<>(this.userService.getUserById(id), HttpStatus.OK);

    }*/

    @GetMapping("/{id}")
    public Optional<User> getProductById(@PathVariable("id") long userId) {
        return ucUserForId.ucuserforid(userId);
    }

    @GetMapping("/hola")
    public String saludo(){
        String nombre = "raul";
        return nombre;
    }
}
