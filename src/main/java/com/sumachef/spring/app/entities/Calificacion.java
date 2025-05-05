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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_calificacion", nullable = false)
    private Integer idCalificacion;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_prod", nullable = false,
                foreignKey = @ForeignKey(name = "FK_productos_TO_calificaciones"))
    private Producto producto;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_rest", nullable = false,
                foreignKey = @ForeignKey(name = "FK_restaurantes_TO_calificaciones"))
    private Restaurante restaurante;

    @Column(name = "puntos_calificacion")
    private Float puntosCalificacion;

    @Column(name = "comentario_calificacion", length = 50)
    private String comentarioCalificacion;

    @Column(name = "fecha_calificacion")
    private LocalDateTime fechaCalificacion;
}
