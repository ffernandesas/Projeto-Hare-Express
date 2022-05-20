package com.hare.express.domain.services;


import com.hare.express.domain.models.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> findAll();

}
