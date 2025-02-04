package com.brunonevesdev.acesso_api.adapter.controllers;

import com.brunonevesdev.acesso_api.adapter.converters.MoradorConverter;
import com.brunonevesdev.acesso_api.adapter.dtos.MoradorDTO;
import com.brunonevesdev.acesso_api.core.ports.entrada.MoradorServicePort;
import com.brunonevesdev.acesso_api.domain.Morador;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/moradores")
@RequiredArgsConstructor
public class MoradorController {

    private final MoradorServicePort moradorServicePort;
    private final MoradorConverter moradorConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MoradorDTO create(@RequestBody MoradorDTO moradorDTO){

        Morador moradorNovo = moradorServicePort.createMorador(moradorConverter.toDomain(moradorDTO));
        return  moradorConverter.toDTO(moradorNovo);
    }
}
