package com.brunonevesdev.acesso_api.core.ports.saida;

import com.brunonevesdev.acesso_api.domain.Usuario;

public interface UsuarioRepositoryPort {

    public Usuario create(Usuario usuario);
    public Usuario ObtenEmail(String email);
}
