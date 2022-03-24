package com.hare.express.domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter @Setter
public class SignUpDTO {

    private Character cpf;
    private String nomeCompelto;
    private Integer telefoneCelular;
    private String endereco;
    private String login;
    private String email;
    private String senha;
}
