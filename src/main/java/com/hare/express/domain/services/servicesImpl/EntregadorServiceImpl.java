package com.hare.express.domain.services.servicesImpl;

import com.hare.express.domain.services.EntregadorService;
import com.hare.express.repositories.EntregadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntregadorServiceImpl implements EntregadorService {

    @Autowired
    private EntregadorRepository entregadorRepository;

}
