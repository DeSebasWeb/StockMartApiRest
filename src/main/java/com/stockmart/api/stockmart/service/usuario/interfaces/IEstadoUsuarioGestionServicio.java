package com.stockmart.api.stockmart.service.usuario.interfaces;


import com.stockmart.api.stockmart.entity.usuario.EstadoUsuario;

public interface IEstadoUsuarioGestionServicio {
    public EstadoUsuario guardarEstadoUsuario(EstadoUsuario estadoUsuario);

    public EstadoUsuario actualizarEstadoUsuario(EstadoUsuario estadoUsuario);

    public void eliminarEstadoUsuario(EstadoUsuario estadoUsuario);
}