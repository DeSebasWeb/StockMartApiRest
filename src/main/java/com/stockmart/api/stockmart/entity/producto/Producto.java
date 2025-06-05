package com.stockmart.api.stockmart.entity.producto;

import com.stockmart.api.stockmart.entity.tienda.Tienda;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    @Column(name = "nombre_producto", nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_tienda")
    private Tienda tienda;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_estado_producto")
    private EstadoProducto estadoProducto;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    @Column(name = "precio_compra", nullable = false)
    private BigDecimal precioCompra;

    @Column(name = "precio_venta", nullable = false)
    private BigDecimal precioVenta;

    @Column(name = "marca")
    private String marca;

    @Column(name = "fecha_creacion", insertable = false, updatable = false)
    private LocalDateTime fechaRegistro;

    @Column(name = "fecha_modificacion", insertable = false, updatable = false)
    private LocalDateTime fechaModificacion;

    @Column(name = "fecha_eliminacion")
    private LocalDateTime fechaEliminacion;
}
