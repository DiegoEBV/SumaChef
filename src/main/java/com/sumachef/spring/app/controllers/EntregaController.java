package com.sumachef.spring.app.controllers;

import com.sumachef.spring.app.entities.Entrega;
import com.sumachef.spring.app.services.EntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entregas")
public class EntregaController {

    @Autowired
    private EntregaService service;

    @GetMapping
    public List<Entrega> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Entrega obtener(@PathVariable Integer id) {
        return service.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public Entrega guardar(@RequestBody Entrega entrega) {
        return service.guardar(entrega);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }

    @GetMapping("/pedido/{idPedido}")
    public List<Entrega> listarPorPedido(@PathVariable Integer idPedido) {
        return service.listarPorPedido(idPedido);
    }

    @GetMapping("/estado")
    public List<Entrega> listarPorEstado(@RequestParam String estado) {
        return service.listarPorEstado(estado);
    }
}
