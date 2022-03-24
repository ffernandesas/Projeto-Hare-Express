package com.hare.express.domain.services.servicesImpl;

import com.hare.express.domain.services.ClienteService;
import com.hare.express.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
}
