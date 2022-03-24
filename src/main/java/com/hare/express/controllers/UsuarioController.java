package com.hare.express.controllers;

import com.hare.express.domain.models.Usuario;
import com.hare.express.domain.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value="/hello-world", method=RequestMethod.GET)
    public ModelAndView helloWorld() {
        ModelAndView mv = new ModelAndView("usuarios");
        List<Usuario> usuarios = usuarioService.findAll();
        mv.addObject("usuarios", usuarios);
        return mv;
    }

}
