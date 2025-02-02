package com.brunonevesdev.acesso_api.adapter.converters;

import com.brunonevesdev.acesso_api.adapter.dtos.UsuarioDTO;
import com.brunonevesdev.acesso_api.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter {

    public Usuario toDomain(UsuarioDTO usuarioDTO){
        return new Usuario(usuarioDTO.getId(), usuarioDTO.getEmail(), usuarioDTO.getSenha(), usuarioDTO.getAdministrador());
    }

    public UsuarioDTO toDTO(Usuario usuario){
        return new UsuarioDTO(usuario.getId(),null, usuario.getEmail(), usuario.getSenha(), usuario.getAdministrador());
    }

}
