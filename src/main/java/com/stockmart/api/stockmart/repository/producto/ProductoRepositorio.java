package com.stockmart.api.stockmart.repository.producto;


import com.stockmart.api.stockmart.entity.producto.Categoria;
import com.stockmart.api.stockmart.entity.producto.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long> {
    List<Producto> findByCategoria(Categoria categoria);
    // Consulta personalizada que devuelve los productos ordenados por cantidad vendida (descendente).
    // El uso de Pageable permite aplicar un límite dinámico de resultados directamente desde la base de datos.
}
