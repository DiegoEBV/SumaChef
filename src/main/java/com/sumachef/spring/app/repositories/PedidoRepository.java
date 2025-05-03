package com.sumachef.spring.app.repositories;

import com.sumachef.spring.app.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    List<Pedido> findByIdRest(int idRest);
    List<Pedido> findByEstadoPedido(String estado);
}
