package com.hare.express.domain.services.servicesImpl;

import com.hare.express.domain.models.Cliente;
import com.hare.express.domain.models.Entregador;
import com.hare.express.domain.services.EntregadorService;
import com.hare.express.repositories.EntregadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class EntregadorServiceImpl implements EntregadorService {

    @Autowired
    private EntregadorRepository entregadorRepository;


    @Override
    public List<Entregador> listEntregador() {
        return entregadorRepository.findAll();
    }

    @Override
    public Entregador Cadastrar(Entregador entregador) {

        entregador.setCidadeEntrega(entregador.getCidadeEntrega());
        entregador.setTipoVeiculo(entregador.getTipoVeiculo());

        Entregador newEntregador = entregadorRepository.save(entregador);
        return newEntregador;
    }

    @Override
    public Entregador update(Entregador entregador, Long id) {
        Assert.notNull(id,"Não foi possível atualizar o registro");

        Optional<Entregador> optional = entregadorRepository.findById(id);
        if(optional.isPresent()) {
            Entregador db = optional.get();
            entregador.setCidadeEntrega(entregador.getCidadeEntrega());
            entregador.setTipoVeiculo(entregador.getTipoVeiculo());

            System.out.println("Entregador id " + db.getId());
            entregadorRepository.save(db);

            return db;
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro");
        }
    }

    private Optional<Entregador> getUserById(Long id) {
        return entregadorRepository.findById(id);
    }

    @Override
    public Entregador delete(Long id) {
        Optional<Entregador> cliente = getUserById(id);
        if (cliente.isPresent()) {
            entregadorRepository.deleteById(id);
            return cliente.get();
        }
        return null;
    }
}
