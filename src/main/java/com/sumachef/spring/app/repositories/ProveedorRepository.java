package com.sumachef.spring.app.repositories;

import com.sumachef.spring.app.entities.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
    List<Proveedor> findByNombreContainingIgnoreCase(String nombre);
}