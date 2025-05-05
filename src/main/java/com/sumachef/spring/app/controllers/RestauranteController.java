package com.sumachef.spring.app.controllers;

import com.sumachef.spring.app.entities.Restaurante;
import com.sumachef.spring.app.services.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurantes")
public class RestauranteController {

    @Autowired
    private RestauranteService service;

    @GetMapping
    public List<Restaurante> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Restaurante obtener(@PathVariable Integer id) {
        return service.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public Restaurante guardar(@RequestBody Restaurante restaurante) {
        return service.guardar(restaurante);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }

    @GetMapping("/{distrito}")
    public List<Restaurante> buscarPorDistrito(@RequestParam String distrito) {
        return service.buscarPorDistrito(distrito);
    }
}