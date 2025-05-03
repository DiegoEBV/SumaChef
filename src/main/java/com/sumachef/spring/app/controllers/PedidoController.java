package com.sumachef.spring.app.controllers;

import com.sumachef.spring.app.entities.Pedido;
import com.sumachef.spring.app.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping
    public List<Pedido> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Pedido obtener(@PathVariable Integer id) {
        return service.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public Pedido guardar(@RequestBody Pedido pedido) {
        return service.guardar(pedido);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }

    @GetMapping("/restaurante/{idRest}")
    public List<Pedido> listarPorRestaurante(@PathVariable Integer idRest) {
        return service.listarPorRestaurante(idRest);
    }

    @GetMapping("/estado")
    public List<Pedido> listarPorEstado(@RequestParam String estado) {
        return service.listarPorEstado(estado);
    }
}
