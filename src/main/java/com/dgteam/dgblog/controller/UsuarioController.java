package com.dgteam.dgblog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dgteam.dgblog.domain.entity.Usuario;
import com.dgteam.dgblog.domain.service.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> getAll() {
        List<Usuario> usuarios = usuarioService.getAll();

        if (!usuarios.isEmpty()) {
            return ResponseEntity.ok(usuarios);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping("/usuario")
    public ResponseEntity<?> save(@RequestBody Usuario usuario) {
        // Verificar si el correo electrónico ya existe
        if (usuarioService.existsByEmail(usuario.getEmail())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("El correo electrónico ya está registrado.");
        }

        // Si el correo electrónico no existe, intentar guardar el usuario
        Usuario savedUsuario = usuarioService.save(usuario);
        if (savedUsuario != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(savedUsuario);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/usuario")
    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario) {
        Usuario savedUsuario = usuarioService.save(usuario);

        if (savedUsuario != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(savedUsuario);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/usuario")
    public ResponseEntity<Usuario> getUserById(@RequestParam("id") int id) {
        Optional<Usuario> optionalUsuario = usuarioService.getId(id);

        if (optionalUsuario.isPresent()) {
            return ResponseEntity.ok(optionalUsuario.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/usuario")
    public ResponseEntity<Void> deleteById(@RequestParam("id") int id) {
        Optional<Usuario> optionalUsuario = usuarioService.getId(id);

        if (optionalUsuario.isPresent()) {
            usuarioService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
