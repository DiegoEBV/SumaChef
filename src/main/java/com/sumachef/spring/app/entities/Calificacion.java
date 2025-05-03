package com.sumachef.spring.app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "calificaciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calificacion {

    @Id
    @Column(name = "id_calificacion")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_prod")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "id_rest")
    private Restaurante restaurante;

    @Column(name = "puntos_calificacion")
    private Float puntos;

    @Column(name = "comentario_calificacion")
    private String comentario;

    @Column(name = "fecha_calificacion")
    private LocalDateTime fecha;
}
