package com.hare.express.controllers;

import com.hare.express.domain.models.Cliente;
import com.hare.express.domain.models.Pedido;
import com.hare.express.domain.services.ClienteService;
import com.hare.express.domain.services.PedidoService;
import com.hare.express.domain.services.servicesImpl.PedidoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/list-pedidos")
    public ResponseEntity listPedido(){
        return ResponseEntity.ok(pedidoService.listPedido());
    }

////    @PostMapping("/cadastrar")
//    public ResponseEntity<Object> cadastrarPedido(@RequestBody Pedido pedido) {
//        try {
//            Pedido pedidos = pedidoService.Cadastrar(pedido);
//            return ResponseEntity.ok(pedidos);
//        } catch (Exception ex) {
//            return ResponseEntity.badRequest().body(ex.getMessage());
//        }
//    }
}
