package com.stockmart.api.stockmart.repository.venta;


import com.stockmart.api.stockmart.entity.producto.EstadoCategoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoVentaRepositorio extends JpaRepository<EstadoCategoria, Integer> {
}
