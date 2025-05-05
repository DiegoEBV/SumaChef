package com.sumachef.spring.app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "restaurantes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurante {

    @Id
    @Column(name = "id_rest")
    private Integer id;

    @Column(name = "nombre_rest")
    private String nombre;

    @Column(name = "desc_rest")
    private String descripcion;

    @Column(name = "correo_rest")
    private String correo;

    @Column(name = "direc_rest")
    private String direccion;

    @Column(name = "distrito_rest")
    private String distrito;

    @Column(name = "registro_rest")
    private LocalDate registro;
}