package com.sumachef.spring.app.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "detalles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Detalle {

    @Id
    @Column(name = "id_detalle")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_prod")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    @Column(name = "cantidad_detalle")
    private Integer cantidad;

    @Column(name = "subtotal_detalle")
    private Float subtotal;
}
