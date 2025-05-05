package com.sumachef.spring.app.repositories;

import com.sumachef.spring.app.entities.Calificacion;
import com.sumachef.spring.app.entities.Producto;
import com.sumachef.spring.app.entities.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CalificacionRepository extends JpaRepository<Calificacion, Integer> {
    List<Calificacion> findByProducto(Producto producto);
    List<Calificacion> findByRestaurante(Restaurante restaurante);
}
