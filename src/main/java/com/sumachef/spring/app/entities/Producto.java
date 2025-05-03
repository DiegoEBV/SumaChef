package com.sumachef.spring.app.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @Column(name = "id_prod")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_prov")
    private Proveedor proveedor;

    @Column(name = "nombre_prod")
    private String nombre;

    @Column(name = "desc_prod")
    private String descripcion;

    @Column(name = "stock_prod")
    private Integer stock;

    @Column(name = "precioun_prod")
    private Float precioUnitario;
}
