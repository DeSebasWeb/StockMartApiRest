package com.stockmart.api.stockmart.entity.producto;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "estado_categoria")
public class EstadoCategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_categoria")
    private Integer idEstadoCategoria;

    @Column(name = "nombre_estado")
    private String nombreEstado;
}
