package com.hare.express.domain.models;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Entregador {

    @Id
    @GeneratedValue
    private Long id;
    private String cidadeEntrega;
    private String tipoVeiculo;
    private boolean status;

}
