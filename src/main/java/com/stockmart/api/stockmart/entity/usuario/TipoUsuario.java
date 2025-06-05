package com.stockmart.api.stockmart.entity.usuario;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "tipo_usuario")
public class TipoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_usuario")
    private Integer idTipoUsuario;

    @Column(name = "nombre_tipo_usuario")
    private String nombreTipoUsuario;
}
