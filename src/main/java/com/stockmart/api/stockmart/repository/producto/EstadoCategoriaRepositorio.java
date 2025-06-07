package com.stockmart.api.stockmart.repository.producto;

import com.stockmart.api.stockmart.entity.producto.EstadoCategoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoCategoriaRepositorio extends JpaRepository<EstadoCategoria, Integer> {
}
