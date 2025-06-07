package com.stockmart.api.stockmart.repository.venta;

import com.stockmart.api.stockmart.entity.usuario.Usuario;
import com.stockmart.api.stockmart.entity.venta.EstadoVenta;
import com.stockmart.api.stockmart.entity.venta.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VentaRepositorio extends JpaRepository<Venta, Integer> {
    List<Venta> findByUsuario(Usuario vendedor);
    List<Venta> findByEstado(EstadoVenta estadoVenta);
}
