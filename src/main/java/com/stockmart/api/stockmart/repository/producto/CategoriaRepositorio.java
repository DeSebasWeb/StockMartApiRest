package com.stockmart.api.stockmart.repository.producto;

import com.stockmart.api.stockmart.entity.producto.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Integer> {
    Optional<Categoria> findByNombreCategoria(String nombreCategoria);
}
