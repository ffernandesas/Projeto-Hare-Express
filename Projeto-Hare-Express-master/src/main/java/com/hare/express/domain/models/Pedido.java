package com.hare.express.domain.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String identificacaoPedido;
    private String produto;
    private String rota;
    private String faturamento;
    private String solicitante;
    private String entregador;
    private String localizacaoAtual;
}
