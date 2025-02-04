package com.brunonevesdev.acesso_api.adapter.repositories;

import com.brunonevesdev.acesso_api.adapter.entities.PessoaEntity;
import com.brunonevesdev.acesso_api.adapter.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {

}
