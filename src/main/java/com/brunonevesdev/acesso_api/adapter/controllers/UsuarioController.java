package com.brunonevesdev.acesso_api.adapter.controllers;

import com.brunonevesdev.acesso_api.adapter.dtos.UsuarioDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDTO create(@RequestBody UsuarioDTO usuarioDTO){
        return usuarioDTO;
    }
}
