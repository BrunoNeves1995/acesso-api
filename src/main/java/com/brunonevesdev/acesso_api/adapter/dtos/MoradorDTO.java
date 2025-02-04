package com.brunonevesdev.acesso_api.adapter.dtos;

import com.brunonevesdev.acesso_api.domain.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MoradorDTO {
    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
    private String celular;


}
