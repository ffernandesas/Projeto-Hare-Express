package com.hare.express.domain.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Produto extends Pedido{

    @Id
    @GeneratedValue
    private Long id;
    public String identificacao;
    public String volume;
    public double quantidade;
    public double peso;
}
