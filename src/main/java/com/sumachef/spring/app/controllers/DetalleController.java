package com.sumachef.spring.app.controllers;

import com.sumachef.spring.app.entities.Detalle;
import com.sumachef.spring.app.services.DetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalles")
public class DetalleController {

    @Autowired
    private DetalleService service;

    @GetMapping
    public List<Detalle> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Detalle obtener(@PathVariable Integer id) {
        return service.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public Detalle guardar(@RequestBody Detalle detalle) {
        return service.guardar(detalle);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }

    @GetMapping("/pedido/{idPedido}")
    public List<Detalle> listarPorPedido(@PathVariable Integer idPedido) {
        return service.listarPorPedido(idPedido);
    }

    @GetMapping("/producto/{idProd}")
    public List<Detalle> listarPorProducto(@PathVariable Integer idProd) {
        return service.listarPorProducto(idProd);
    }
}
