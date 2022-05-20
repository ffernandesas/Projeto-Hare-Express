package com.hare.express.domain.services;

import com.hare.express.domain.models.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> listCliente();
    Cliente Cadastrar(Cliente cliente);
    Cliente update(Cliente cliente, Long id);
    Cliente delete(Long id);
}
