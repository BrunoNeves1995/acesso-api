package com.brunonevesdev.acesso_api.adapter.repositories;

import com.brunonevesdev.acesso_api.adapter.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
