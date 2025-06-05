package com.stockmart.api.stockmart.entity.usuario;


import com.stockmart.api.stockmart.entity.tienda.Tienda;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "id_tienda", nullable = false)
    private Tienda tienda;

    @Column(name = "cedula")
    private Long cedula;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_estado_usuario")
    private EstadoUsuario estadoUsuario;

    @ManyToOne
    @JoinColumn(name = "id_tipo_usuario")
    private TipoUsuario tipoUsuario;

    @Column(name = "fecha_creacion", insertable = false, updatable = false)
    private LocalDateTime fechaCreacion;

    @Column(name = "fecha_modificacion", insertable = false, updatable = false)
    private LocalDateTime fechaModificacion;

    @Column(name = "fecha_eliminacion_logica")
    private LocalDateTime fechaEliminacion;
}