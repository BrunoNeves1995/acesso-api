package com.brunonevesdev.acesso_api.adapter.entities;

import com.brunonevesdev.acesso_api.adapter.entities.PessoaEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsuarioEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String email;
    private String senha;
    private Boolean administrador;

    //cria uma chave estrangeira com o nome (pessoa_id) na tabela usuario
    @OneToOne
    @JoinColumn(name = "pessoa_id")
    private PessoaEntity pessoaEntity;


}
