package com.sumachef.spring.app.services;

import com.sumachef.spring.app.entities.Detalle;
import com.sumachef.spring.app.repositories.DetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleService {

    @Autowired
    private DetalleRepository detalleRepository;

    public List<Detalle> listar() {
        return detalleRepository.findAll();
    }

    public Optional<Detalle> obtenerPorId(Integer id) {
        return detalleRepository.findById(id);
    }

    public Detalle guardar(Detalle detalle) {
        return detalleRepository.save(detalle);
    }

    public void eliminar(Integer id) {
        detalleRepository.deleteById(id);
    }

    public List<Detalle> listarPorPedido(Integer idPedido) {
        return detalleRepository.findByIdPedido(idPedido);
    }

    public List<Detalle> listarPorProducto(Integer idProd) {
        return detalleRepository.findByIdProd(idProd);
    }
}
