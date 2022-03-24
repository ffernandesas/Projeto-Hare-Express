package com.hare.express.domain.models;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Entregador extends Usuario{


    private String cidadeEntrega;
    private String tipoVeiculo;

}
