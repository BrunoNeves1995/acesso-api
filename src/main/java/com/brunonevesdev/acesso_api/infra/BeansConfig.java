package com.brunonevesdev.acesso_api.infra;

import com.brunonevesdev.acesso_api.core.ports.entrada.MoradorServicePort;
import com.brunonevesdev.acesso_api.core.ports.entrada.UsuarioServicePort;
import com.brunonevesdev.acesso_api.core.ports.saida.MoradorRepositoryPort;
import com.brunonevesdev.acesso_api.core.ports.saida.UsuarioRepositoryPort;
import com.brunonevesdev.acesso_api.core.services.MoradorService;
import com.brunonevesdev.acesso_api.core.services.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeansConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    public UsuarioServicePort usuarioServiceImpl(UsuarioRepositoryPort usuarioRepositoryPort){
        return new UsuarioService(usuarioRepositoryPort);

    }

    @Bean
    public MoradorServicePort moradorServiceImpl(MoradorRepositoryPort moradorServicePort){
        return new MoradorService(moradorServicePort);

    }
}
