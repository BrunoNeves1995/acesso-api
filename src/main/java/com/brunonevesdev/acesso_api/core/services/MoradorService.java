package com.brunonevesdev.acesso_api.core.services;

import com.brunonevesdev.acesso_api.core.ports.entrada.MoradorServicePort;
import com.brunonevesdev.acesso_api.core.ports.saida.MoradorRepositoryPort;
import com.brunonevesdev.acesso_api.domain.Morador;


public class MoradorService implements MoradorServicePort {

    private final MoradorRepositoryPort moradorRepositoryPort;

    public MoradorService(MoradorRepositoryPort moradorRepositoryPort) {
        this.moradorRepositoryPort = moradorRepositoryPort;
    }

    @Override
    public Morador createMorador(Morador morador) {
        Morador moradorExiste = moradorRepositoryPort.obtenPorCPF(morador.getCpf());
        if (moradorExiste != null){
            throw  new IllegalArgumentException("Morador ja existe!");
        }
        return moradorRepositoryPort.create(morador);
    }
}
