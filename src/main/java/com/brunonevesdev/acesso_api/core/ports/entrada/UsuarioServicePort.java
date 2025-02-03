package com.brunonevesdev.acesso_api.core.ports.entrada;

import com.brunonevesdev.acesso_api.domain.Usuario;

public interface UsuarioServicePort {

    Usuario createUsuario(Usuario usuario);
}
