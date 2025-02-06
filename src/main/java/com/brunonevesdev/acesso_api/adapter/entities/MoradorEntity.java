package com.brunonevesdev.acesso_api.adapter.entities;

import com.brunonevesdev.acesso_api.domain.Pessoa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "morador")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MoradorEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String cpf;
    private String endereco;
    private String celular;


    //cria uma chave estrangeira com o nome (pessoa_id) na tabela morador
    @OneToOne
    @JoinColumn(name = "pessoa_id")
    private PessoaEntity pessoaEntity;


}
