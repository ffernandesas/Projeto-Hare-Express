package com.hare.express.controllers;

import com.hare.express.domain.models.Cliente;
import com.hare.express.domain.models.Identidade;
import com.hare.express.domain.models.Entregador;
import com.hare.express.domain.services.EntregadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class EntregadorController extends Identidade {

    @Autowired
    private EntregadorService entregadorService;


    @GetMapping("/list-entregador")
    public ResponseEntity listEntregador() {
        return ResponseEntity.ok(entregadorService.listEntregador());
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<Object> cadastrar(@RequestBody Entregador entregador) {
        try {
            Entregador entregadores = entregadorService.Cadastrar(entregador);
            return ResponseEntity.ok(entregadores);
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }


    @PostMapping("/update-entregador")
    public ResponseEntity<Object> updateEntregador(@RequestParam("id") Long id, @RequestBody Entregador entregador) {
        try {
            Entregador entregadores = entregadorService.update(entregador, id);
            return ResponseEntity.ok(entregadores);
        }catch (Exception ex){
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }

    @GetMapping("/deleteEntregador/{id}")
    public ResponseEntity<Object> deleteEntregador(@PathVariable Long id){
        try {
            entregadorService.delete(id);
            return ResponseEntity.ok().build();
        }catch (Exception ex){
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
}