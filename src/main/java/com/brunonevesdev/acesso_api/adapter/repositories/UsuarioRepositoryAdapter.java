package com.brunonevesdev.acesso_api.adapter.repositories;


import com.brunonevesdev.acesso_api.adapter.entities.UsuarioEntity;
import com.brunonevesdev.acesso_api.core.ports.saida.UsuarioRepositoryPort;
import com.brunonevesdev.acesso_api.domain.Usuario;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    private final UsuarioRepository usuarioRepository;
    private final ModelMapper modelMapper;

    @Override
    public Usuario create(Usuario usuario) {

        UsuarioEntity novoUsuario = usuarioRepository.save(modelMapper.map(usuario, UsuarioEntity.class));
        return modelMapper.map(novoUsuario, Usuario.class);
    }
}
