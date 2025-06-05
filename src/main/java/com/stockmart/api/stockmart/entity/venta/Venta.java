package com.stockmart.api.stockmart.entity.venta;

import com.stockmart.api.stockmart.entity.usuario.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Long idVenta;

    @Column(name = "total")
    private BigDecimal total;

    @ManyToOne
    @JoinColumn(name = "id_vendedor", referencedColumnName = "id_usuario")
    private Usuario vendedor;

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_usuario")
    private Usuario cliente;

    @ManyToOne
    @JoinColumn(name = "id_estado_venta")
    private EstadoVenta estadoVenta;

    @Column(name = "fecha_venta")
    private LocalDateTime fechaVenta;

    @Column(name = "fecha_modificacion")
    private LocalDateTime fechaModificacion;
}