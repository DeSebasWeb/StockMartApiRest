package com.stockmart.api.stockmart.repository.usuario;


import com.stockmart.api.stockmart.entity.usuario.EstadoUsuario;
import com.stockmart.api.stockmart.entity.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCedula(Long cedula);
    List<Usuario> findByEstado(EstadoUsuario estadoUsuario);
    Optional<Usuario> findByCorreo(String correo);
}