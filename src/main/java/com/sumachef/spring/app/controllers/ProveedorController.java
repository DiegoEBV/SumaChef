package com.sumachef.spring.app.controllers;

import com.sumachef.spring.app.entities.Proveedor;
import com.sumachef.spring.app.services.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorService service;

    @GetMapping
    public List<Proveedor> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Proveedor obtener(@PathVariable Integer id) {
        return service.obtenerPorId(id).orElse(null);
    }

    @PostMapping
    public Proveedor guardar(@RequestBody Proveedor proveedor) {
        return service.guardar(proveedor);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }

    @GetMapping("/buscar")
    public List<Proveedor> buscarPorNombre(@RequestParam String nombre) {
        return service.buscarPorNombre(nombre);
    }
}
