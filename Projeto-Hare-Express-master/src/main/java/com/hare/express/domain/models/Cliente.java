package com.hare.express.domain.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Cliente extends Identidade {

    @Id
    @GeneratedValue
    private Long id;
    private boolean formaPagamento;

}
