package com.brunonevesdev.acesso_api.adapter.repositories;


import com.brunonevesdev.acesso_api.adapter.entities.PessoaEntity;
import com.brunonevesdev.acesso_api.adapter.entities.UsuarioEntity;
import com.brunonevesdev.acesso_api.core.ports.saida.UsuarioRepositoryPort;
import com.brunonevesdev.acesso_api.domain.Pessoa;
import com.brunonevesdev.acesso_api.domain.Usuario;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    private final UsuarioRepository usuarioRepository;
    private final PessoaRepository pessoaRepository;
    private final ModelMapper modelMapper;

    @Override
    public Usuario create(Usuario usuario) {

        UsuarioEntity usuarioEntityMap = modelMapper.map(usuario, UsuarioEntity.class);
        usuarioEntityMap.setPessoaEntity(createPessoa(usuario.getPessoa()));
        UsuarioEntity novoUsuarioEntity = usuarioRepository.save(usuarioEntityMap);

        return modelMapper.map(novoUsuarioEntity, Usuario.class);
    }

    @Override
    public Usuario ObtenEmail(String email) {

        UsuarioEntity usuarioEntity = usuarioRepository.findByEmail(email);
        if (usuarioEntity == null) {
            return null;
        }
        return modelMapper.map(usuarioEntity, Usuario.class);

    }

    private PessoaEntity createPessoa(Pessoa pessoa){
        PessoaEntity pessoaEntityMap = modelMapper.map(pessoa, PessoaEntity.class);
        return pessoaRepository.save(pessoaEntityMap);
    }
}
