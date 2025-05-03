package com.sumachef.spring.app.services;

import com.sumachef.spring.app.entities.Proveedor;
import com.sumachef.spring.app.repositories.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    public List<Proveedor> listar() {
        return proveedorRepository.findAll();
    }

    public Optional<Proveedor> obtenerPorId(Integer id) {
        return proveedorRepository.findById(id);
    }

    public Proveedor guardar(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public void eliminar(Integer id) {
        proveedorRepository.deleteById(id);
    }

    public List<Proveedor> buscarPorNombre(String nombre) {
        return proveedorRepository.findByNombreProvContainingIgnoreCase(nombre);
    }
}
