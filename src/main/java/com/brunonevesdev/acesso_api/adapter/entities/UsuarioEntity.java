package com.brunonevesdev.acesso_api.adapter.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String senha;
    private Boolean administrador;


}
