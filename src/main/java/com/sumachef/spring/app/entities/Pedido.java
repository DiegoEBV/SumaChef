package com.sumachef.spring.app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.time.LocalDate;

@Entity
@Table(name = "pedidos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    @Id
    @Column(name = "id_pedido")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_rest")
    private Restaurante restaurante;

    @Column(name = "desc_pedido")
    private String descripcion;

    @Column(name = "fecha_pedido")
    private LocalDateTime fecha;

    @Column(name = "estado_pedido")
    private String estado;

    @Column(name = "entrega_pedido")
    private LocalDate entrega;

    @Column(name = "monto_pedido")
    private Float monto;
}
