package com.brunonevesdev.acesso_api.adapter.repositories;


import com.brunonevesdev.acesso_api.adapter.entities.MoradorEntity;
import com.brunonevesdev.acesso_api.adapter.entities.PessoaEntity;
import com.brunonevesdev.acesso_api.adapter.entities.UsuarioEntity;
import com.brunonevesdev.acesso_api.core.ports.saida.MoradorRepositoryPort;
import com.brunonevesdev.acesso_api.core.ports.saida.UsuarioRepositoryPort;
import com.brunonevesdev.acesso_api.domain.Morador;
import com.brunonevesdev.acesso_api.domain.Pessoa;
import com.brunonevesdev.acesso_api.domain.Usuario;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.processing.Find;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Throw;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MoradorRepositoryAdapter implements MoradorRepositoryPort {

    private final MoradorRepository moradorRepository;
    private final PessoaRepositoryAdapter pessoaRepositoryAdapter;
    private final ModelMapper modelMapper;

    @Override
    public Morador create(Morador morador) {

        MoradorEntity moradorEntityMap = modelMapper.map(morador, MoradorEntity.class);
        moradorEntityMap.setPessoaEntity(pessoaRepositoryAdapter.createPessoa(morador.getPessoa()));
        MoradorEntity novoMorador = moradorRepository.save(moradorEntityMap);

        return modelMapper.map(novoMorador, Morador.class);
    }

    @Override
    public Morador obtenPorCPF(String cpf) {
        MoradorEntity moradorEntity = moradorRepository.findByCpf(cpf);
        if (moradorEntity == null){
            return null;
        }
        return modelMapper.map(moradorEntity, Morador.class);
    }


}
