package com.hare.express.domain.services.servicesImpl;

import com.hare.express.domain.models.Cliente;
import com.hare.express.domain.services.ClienteService;
import com.hare.express.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listCliente() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente Cadastrar(Cliente cliente) {
        cliente.setNomeCompelto(cliente.getNomeCompelto());
        cliente.setCpf(cliente.getCpf());
        cliente.setEndereco(cliente.getEndereco());
        cliente.setTelefoneCelular(cliente.getTelefoneCelular());
        cliente.setEmail(cliente.getEmail());
        cliente.setLogin(cliente.getLogin());
        cliente.setSenha(cliente.getSenha());
       cliente.setFormaPagamento(cliente.isFormaPagamento());

       Cliente newCliente = clienteRepository.save(cliente);
       return newCliente;
    }

    @Override
    public Cliente update(Cliente cliente, Long id) {
        Assert.notNull(id,"Não foi possível atualizar o registro");

        Optional<Cliente> optional = clienteRepository.findById(id);
        if(optional.isPresent()) {
            Cliente db = optional.get();
            cliente.setNomeCompelto(cliente.getNomeCompelto());
            cliente.setCpf(cliente.getCpf());
            cliente.setEndereco(cliente.getEndereco());
            cliente.setTelefoneCelular(cliente.getTelefoneCelular());
            cliente.setEmail(cliente.getEmail());
            cliente.setLogin(cliente.getLogin());
            cliente.setSenha(cliente.getSenha());
            cliente.setFormaPagamento(cliente.isFormaPagamento());

            System.out.println("Cliente id " + db.getId());

            clienteRepository.save(db);

            return db;
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro");
        }

    }

    private Optional<Cliente> getUserById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente delete(Long id) {
        Optional<Cliente> cliente = getUserById(id);
        if (cliente.isPresent()) {
            clienteRepository.deleteById(id);
            return cliente.get();
        }
        return null;
    }


}
