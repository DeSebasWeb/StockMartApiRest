package com.stockmart.api.stockmart.entity.usuario;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "estado_usuario")
public class EstadoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_usuario")
    private Long idEstadoUsuario;

    @Column(name = "nombre_estado")
    private String nombreEstado;
}
