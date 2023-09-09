package com.dgteam.dgblog.publications.domain.model;


import com.dgteam.dgblog.users.domain.model.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "publicaciones")
public class applications {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String contenido;
    private LocalDate fecha_Publicacion;

    private String autor_id;


}
