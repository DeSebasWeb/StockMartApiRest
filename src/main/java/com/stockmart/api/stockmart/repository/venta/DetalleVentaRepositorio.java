package com.stockmart.api.stockmart.repository.venta;

import com.stockmart.api.stockmart.entity.venta.DetalleVenta;
import com.stockmart.api.stockmart.entity.venta.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleVentaRepositorio extends JpaRepository<DetalleVenta, Long> {
    List<DetalleVenta> findByVenta(Venta venta);
}