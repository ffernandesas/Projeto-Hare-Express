package com.hare.express.domain.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Faturamento {

    @Id
    @GeneratedValue
    private Long id;
    private String pedido;
    private Integer valor;
    private double tarifaEntregador;

}
