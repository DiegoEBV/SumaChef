package com.sumachef.spring.app.controllers;

import com.sumachef.spring.app.entities.Calificacion;
import com.sumachef.spring.app.services.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calificaciones")
public class CalificacionController {

    @Autowired
    private CalificacionService service;

    @GetMapping
    public List<Calificacion> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Calificacion obtener(@PathVariable Integer id) {
        return service.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public Calificacion guardar(@RequestBody Calificacion calificacion) {
        return service.guardar(calificacion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }

    @GetMapping("/producto/{idProd}")
    public List<Calificacion> listarPorProducto(@PathVariable Integer idProd) {
        return service.listarPorProducto(idProd);
    }

    @GetMapping("/restaurante/{idRest}")
    public List<Calificacion> listarPorRestaurante(@PathVariable Integer idRest) {
        return service.listarPorRestaurante(idRest);
    }
}
