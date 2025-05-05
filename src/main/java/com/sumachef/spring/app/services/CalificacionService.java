package com.sumachef.spring.app.services;

import com.sumachef.spring.app.entities.Calificacion;
import com.sumachef.spring.app.entities.Producto;
import com.sumachef.spring.app.entities.Restaurante;
import com.sumachef.spring.app.repositories.CalificacionRepository;
import com.sumachef.spring.app.repositories.ProductoRepository;
import com.sumachef.spring.app.repositories.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalificacionService {

    @Autowired
    private CalificacionRepository calificacionRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private RestauranteRepository restauranteRepository;

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
        Optional<Producto> producto = productoRepository.findById(idProd);
        return producto.map(calificacionRepository::findByProducto).orElse(List.of());
    }

    public List<Calificacion> listarPorRestaurante(Integer idRest) {
        Optional<Restaurante> restaurante = restauranteRepository.findById(idRest);
        return restaurante.map(calificacionRepository::findByRestaurante).orElse(List.of());
    }
}
