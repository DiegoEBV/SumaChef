package com.sumachef.spring.app.services;

import com.sumachef.spring.app.entities.Calificacion;
import com.sumachef.spring.app.repositories.CalificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalificacionService {

    @Autowired
    private CalificacionRepository calificacionRepository;

    public List<Calificacion> listar() {
        return calificacionRepository.findAll();
    }

    public Optional<Calificacion> obtenerPorId(Integer id) {
        return calificacionRepository.findById(id);
    }

    public Calificacion guardar(Calificacion calificacion) {
        return calificacionRepository.save(calificacion);
    }

    public void eliminar(Integer id) {
        calificacionRepository.deleteById(id);
    }

    public List<Calificacion> listarPorProducto(Integer idProd) {
        return calificacionRepository.findByIdProd(idProd);
    }

    public List<Calificacion> listarPorRestaurante(Integer idRest) {
        return calificacionRepository.findByIdRest(idRest);
    }
}
