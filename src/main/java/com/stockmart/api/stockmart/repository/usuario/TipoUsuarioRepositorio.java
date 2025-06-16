package com.stockmart.api.stockmart.repository.usuario;


import com.stockmart.api.stockmart.entity.usuario.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoUsuarioRepositorio extends JpaRepository<TipoUsuario, Integer> {
    TipoUsuario findByNombreTipoUsuario(String nombreTipoUsuario);
}
