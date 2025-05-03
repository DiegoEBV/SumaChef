package com.sumachef.spring.app.services;

import com.sumachef.spring.app.entities.Pedido;
import com.sumachef.spring.app.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> listar() {
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> obtenerPorId(Integer id) {
        return pedidoRepository.findById(id);
    }

    public Pedido guardar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public void eliminar(Integer id) {
        pedidoRepository.deleteById(id);
    }

    public List<Pedido> listarPorRestaurante(Integer idRest) {
        return pedidoRepository.findByIdRest(idRest);
    }

    public List<Pedido> listarPorEstado(String estado) {
        return pedidoRepository.findByEstadoPedido(estado);
    }
}
