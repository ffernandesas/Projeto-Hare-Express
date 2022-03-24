package com.hare.express.controllers;

import com.hare.express.domain.services.EntregadorService;
import com.hare.express.domain.services.EntregadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntregadorController {

    @Autowired
    private EntregadorService entregadorService;
}
