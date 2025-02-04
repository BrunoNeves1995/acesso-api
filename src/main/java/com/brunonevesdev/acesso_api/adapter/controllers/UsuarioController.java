package com.brunonevesdev.acesso_api.adapter.controllers;

import com.brunonevesdev.acesso_api.adapter.converters.UsuarioConverter;
import com.brunonevesdev.acesso_api.adapter.dtos.UsuarioDTO;
import com.brunonevesdev.acesso_api.core.ports.entrada.UsuarioServicePort;
import com.brunonevesdev.acesso_api.domain.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioServicePort usuarioServicePort;
    private final UsuarioConverter usuarioConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDTO create(@RequestBody UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioServicePort.createUsuario(usuarioConverter.toDomain(usuarioDTO));
        return usuarioConverter.toDTO(usuario);
    }


}
