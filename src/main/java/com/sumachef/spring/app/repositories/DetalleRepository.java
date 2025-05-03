package com.sumachef.spring.app.repositories;

import com.sumachef.spring.app.entities.Detalle;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DetalleRepository extends JpaRepository<Detalle, Integer> {
    List<Detalle> findByIdPedido(int idPedido);
    List<Detalle> findByIdProd(int idProd);
}
