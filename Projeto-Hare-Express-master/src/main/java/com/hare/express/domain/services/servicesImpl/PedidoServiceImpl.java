package com.hare.express.domain.services.servicesImpl;

import com.hare.express.domain.models.Pedido;
import com.hare.express.domain.services.PedidoService;
import com.hare.express.repositories.EntregadorRepository;
import com.hare.express.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public List<Pedido> listPedido() {
        return pedidoRepository.findAll();
    }

    @Override
    public Pedido Cadastrar(Pedido pedido) {
        pedido.setIdentificacaoPedido(pedido.getIdentificacaoPedido());
        pedido.setProduto(pedido.getProduto());
        pedido.setRota(pedido.getRota());
        pedido.setFaturamento(pedido.getFaturamento());
        pedido.setSolicitante(pedido.getSolicitante());
        pedido.setEntregador(pedido.getEntregador());
        pedido.setLocalizacaoAtual(pedido.getLocalizacaoAtual());

        Pedido newPedido = pedidoRepository.save(pedido);
        return newPedido;
    }
}
