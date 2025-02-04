package com.brunonevesdev.acesso_api.core.services;

import com.brunonevesdev.acesso_api.core.ports.entrada.UsuarioServicePort;
import com.brunonevesdev.acesso_api.core.ports.saida.UsuarioRepositoryPort;
import com.brunonevesdev.acesso_api.domain.Usuario;

import org.springframework.stereotype.Service;


public class UsuarioService implements UsuarioServicePort {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public UsuarioService(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        Usuario usuarioExistente  = usuarioRepositoryPort.ObtenEmail(usuario.getEmail());
        if (usuarioExistente != null){
            throw  new IllegalArgumentException("Usuario ja existe!");
        }
        return usuarioRepositoryPort.create(usuario);
    }
}
