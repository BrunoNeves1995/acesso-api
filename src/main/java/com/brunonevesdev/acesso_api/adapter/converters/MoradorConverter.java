package com.brunonevesdev.acesso_api.adapter.converters;

import com.brunonevesdev.acesso_api.adapter.dtos.MoradorDTO;
import com.brunonevesdev.acesso_api.adapter.dtos.UsuarioDTO;
import com.brunonevesdev.acesso_api.domain.Morador;
import com.brunonevesdev.acesso_api.domain.Pessoa;
import com.brunonevesdev.acesso_api.domain.Usuario;

public class MoradorConverter {

    public Morador toDomain(MoradorDTO moradorDTO){
        return new Morador(
                moradorDTO.getId(),
                moradorDTO.getCpf(),
                moradorDTO.getEndereco(),
                moradorDTO.getCelular(),
                new Pessoa(null, moradorDTO.getNome())
        );
    }

    public MoradorDTO toDTO(Morador morador){
        return new MoradorDTO(morador.getId(), morador.getPessoa().getNome(),morador.getCpf(), morador.getEndereco(), morador.getCelular());
    }
}
