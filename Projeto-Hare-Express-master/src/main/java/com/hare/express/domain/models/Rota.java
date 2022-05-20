package com.hare.express.domain.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Rota extends Pedido{

    @Id
    @GeneratedValue
    private Long id;
    public String enderecoInicial;
    public String enderecoFinal;

}
