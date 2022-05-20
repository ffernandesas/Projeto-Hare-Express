package com.hare.express.domain.services;

import com.hare.express.domain.models.Entregador;

import java.util.List;

public interface EntregadorService {
    List<Entregador> listEntregador();
    Entregador Cadastrar(Entregador entregador);
    Entregador update(Entregador entregador, Long id);
    Entregador delete(Long id);
}
