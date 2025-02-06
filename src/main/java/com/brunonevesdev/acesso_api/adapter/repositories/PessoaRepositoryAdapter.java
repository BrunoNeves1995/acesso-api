package com.brunonevesdev.acesso_api.adapter.repositories;


import com.brunonevesdev.acesso_api.adapter.entities.PessoaEntity;
import com.brunonevesdev.acesso_api.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PessoaRepositoryAdapter {

    private final MoradorRepository moradorRepository;
    private final PessoaRepository pessoaRepository;
    private final ModelMapper modelMapper;

    public PessoaEntity createPessoa(Pessoa pessoa){
        PessoaEntity pessoaEntityMap = modelMapper.map(pessoa, PessoaEntity.class);
        return pessoaRepository.save(pessoaEntityMap);
    }
}
