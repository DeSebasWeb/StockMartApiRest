package com.stockmart.api.stockmart.service.usuario.clases;

import com.stockmart.api.stockmart.entity.usuario.EstadoUsuario;
import com.stockmart.api.stockmart.repository.usuario.EstadoUsuarioRepositorio;
import com.stockmart.api.stockmart.service.usuario.interfaces.IEstadoUsuarioGestionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EstadoUsuarioGestionServicio implements IEstadoUsuarioGestionServicio {
    private final EstadoUsuarioRepositorio estadoUsuarioRepositorio;

    @Autowired
    public EstadoUsuarioGestionServicio(EstadoUsuarioRepositorio estadoUsuarioRepositorio) {
        this.estadoUsuarioRepositorio = estadoUsuarioRepositorio;
    }

    @Override
    public EstadoUsuario guardarEstadoUsuario(EstadoUsuario estadoUsuario) {
        return  this.estadoUsuarioRepositorio.save(estadoUsuario);
    }

    @Override
    public EstadoUsuario actualizarEstadoUsuario(EstadoUsuario estadoUsuario) {
        return  this.estadoUsuarioRepositorio.save(estadoUsuario);
    }

    @Override
    public void eliminarEstadoUsuario(EstadoUsuario estadoUsuario) {
        this.estadoUsuarioRepositorio.delete(estadoUsuario);
    }
}
