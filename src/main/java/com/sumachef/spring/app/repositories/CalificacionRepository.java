package com.sumachef.spring.app.repositories;

import com.sumachef.spring.app.entities.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CalificacionRepository extends JpaRepository<Calificacion, Integer> {
    List<Calificacion> findByIdProd(int idProd);
    List<Calificacion> findByIdRest(int idRest);
}
