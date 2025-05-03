package com.sumachef.spring.app.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "proveedores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor {

    @Id
    @Column(name = "id_prov")
    private Integer id;

    @Column(name = "nombre_prov")
    private String nombre;

    @Column(name = "desc_prov")
    private String descripcion;

    @Column(name = "correo_prov")
    private String correo;

    @Column(name = "direc_prov")
    private String direccion;

    @Column(name = "distrito_prov")
    private String distrito;
}
