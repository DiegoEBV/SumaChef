package com.sumachef.spring.app.services;

import com.sumachef.spring.app.entities.Entrega;
import com.sumachef.spring.app.repositories.EntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntregaService {

    @Autowired
    private EntregaRepository entregaRepository;

    public List<Entrega> listar() {
        return entregaRepository.findAll();
    }

    public Optional<Entrega> obtenerPorId(Integer id) {
        return entregaRepository.findById(id);
    }

    public Entrega guardar(Entrega entrega) {
        return entregaRepository.save(entrega);
    }

    public void eliminar(Integer id) {
        entregaRepository.deleteById(id);
    }

    public List<Entrega> listarPorPedido(Integer idPedido) {
        return entregaRepository.findByIdPedido(idPedido);
    }

    public List<Entrega> listarPorEstado(String estado) {
        return entregaRepository.findByEstadoEntrega(estado);
    }
}
