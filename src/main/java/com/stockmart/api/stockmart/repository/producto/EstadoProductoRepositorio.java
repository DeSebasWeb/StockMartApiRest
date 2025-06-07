package com.stockmart.api.stockmart.repository.producto;

import com.stockmart.api.stockmart.entity.producto.EstadoProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoProductoRepositorio extends JpaRepository<EstadoProducto, Integer> {
}
