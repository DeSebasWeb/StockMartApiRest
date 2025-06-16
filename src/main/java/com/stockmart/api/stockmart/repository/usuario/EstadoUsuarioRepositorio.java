package com.stockmart.api.stockmart.repository.usuario;


import com.stockmart.api.stockmart.entity.usuario.EstadoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoUsuarioRepositorio extends JpaRepository<EstadoUsuario, Integer> {
    EstadoUsuario findByNombre(String nombreEstadoUsuario);
}