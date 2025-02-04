package com.brunonevesdev.acesso_api.adapter.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pessoa")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PessoaEntity {


    @Id
    @GeneratedValue
    private Long id;
    private String nome;
}
