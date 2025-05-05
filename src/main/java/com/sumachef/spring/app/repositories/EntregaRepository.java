package com.sumachef.spring.app.repositories;

import com.sumachef.spring.app.entities.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EntregaRepository extends JpaRepository<Entrega, Integer> {
    List<Entrega> findByIdPedido(int pedido);
    List<Entrega> findByEstadoEntrega(String estado);
}
