
package com.sumachef.spring.app.repositories;

import com.sumachef.spring.app.entities.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RestauranteRepository extends JpaRepository<Restaurante, Integer> {
    List<Restaurante> findByDistrito(String distrito);
}