package com.stockmart.api.stockmart.entity.producto;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "estado_producto")
public class EstadoProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_producto")
    private Integer idEstadoProducto;

    @Column(name = "nombre_estado")
    private String nombreEstado;
}