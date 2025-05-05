package com.sumachef.spring.app.services;

import com.sumachef.spring.app.entities.Restaurante;
import com.sumachef.spring.app.repositories.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    public List<Restaurante> listar() {
        return restauranteRepository.findAll();
    }

    public Optional<Restaurante> obtenerPorId(Integer id) {
        return restauranteRepository.findById(id);
    }

    public Restaurante guardar(Restaurante restaurante) {
        return restauranteRepository.save(restaurante);
    }

    public void eliminar(Integer id) {
        restauranteRepository.deleteById(id);
    }

    public List<Restaurante> buscarPorDistrito(String distrito) {
        return restauranteRepository.findByDistrito(distrito);
    }
}