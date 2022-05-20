package com.hare.express.controllers;

import com.hare.express.domain.models.Cliente;
import com.hare.express.domain.models.Entregador;
import com.hare.express.domain.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/list-cliente")
    public ResponseEntity listCliente(){
        return ResponseEntity.ok(clienteService.listCliente());
    }

    @PostMapping("/cadastrar-cliente")
    public ResponseEntity<Object> cadastrarCliente(@RequestBody Cliente cliente) {
        try {
            Cliente clientes = clienteService.Cadastrar(cliente);
            return ResponseEntity.ok(clientes);
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }

    @PostMapping("/update-cliente")
    public ResponseEntity<Object> updateCliente(@RequestParam("id") Long id, @RequestBody Cliente cliente) {
        try {
            Cliente clientes = clienteService.update(cliente, id);
            return ResponseEntity.ok(clientes);
        }catch (Exception ex){
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }

    @PostMapping("/delete-cliente")
    public ResponseEntity<Object> deleteCliente(@RequestParam("id") Long id){
        try {
            clienteService.delete(id);
            return ResponseEntity.ok().build();
        }catch (Exception ex){
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
}
