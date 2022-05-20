package com.hare.express.domain.services.servicesImpl;

import com.hare.express.domain.models.Usuario;
import com.hare.express.domain.services.UsuarioService;
import com.hare.express.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicesImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }
}
