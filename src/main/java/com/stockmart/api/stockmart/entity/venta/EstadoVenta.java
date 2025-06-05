package com.stockmart.api.stockmart.entity.venta;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class EstadoVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_venta")
    private Long idEstadoVenta;

    @Column(name = "nombre_estado_venta")
    private String nombreEstadoVenta;
}