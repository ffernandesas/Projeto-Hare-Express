package com.hare.express.domain.services;

import com.hare.express.domain.models.Pedido;

import java.util.List;

public interface PedidoService {
    List<Pedido> listPedido();
    Pedido Cadastrar(Pedido pedido);
}
