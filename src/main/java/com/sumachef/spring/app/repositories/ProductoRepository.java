package com.sumachef.spring.app.repositories;

import com.sumachef.spring.app.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    List<Producto> findByIdProv(int idProv);
    List<Producto> findByNombreProdContainingIgnoreCase(String nombre);
}
