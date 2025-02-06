package com.brunonevesdev.acesso_api.core.ports.saida;

import com.brunonevesdev.acesso_api.domain.Morador;

public interface MoradorRepositoryPort {

    Morador create(Morador morador);
    Morador obtenPorCPF(String cpf);




}
