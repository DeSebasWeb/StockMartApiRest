package com.stockmart.api.stockmart.entity.venta;

import com.stockmart.api.stockmart.entity.producto.Producto;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "detalle_venta")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_venta")
    private Long idDetalleVenta;

    @ManyToOne
    @JoinColumn(name = "id_venta")
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Column(name = "valor_unitario")
    private BigDecimal valorUnitario;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "subtotal")
    private BigDecimal subtotal;
}
