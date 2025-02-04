package com.brunonevesdev.acesso_api.core.ports.entrada;

import com.brunonevesdev.acesso_api.domain.Morador;
import com.brunonevesdev.acesso_api.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public interface MoradorServicePort {

    Morador createMorador(Morador morador);
}
