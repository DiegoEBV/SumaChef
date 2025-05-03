package com.sumachef.spring.app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "entregas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Entrega {

    @Id
    @Column(name = "id_entrega")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    @Column(name = "transp_entrega")
    private String transporte;

    @Column(name = "salida_entrega")
    private LocalDate salida;

    @Column(name = "llegada_entrega")
    private LocalDate llegada;

    @Column(name = "estado_entrega")
    private String estado;
}
