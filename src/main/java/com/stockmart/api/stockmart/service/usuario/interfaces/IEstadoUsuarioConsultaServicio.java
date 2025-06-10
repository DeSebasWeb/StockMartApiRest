package com.stockmart.api.stockmart.service.usuario.interfaces;


import com.stockmart.api.stockmart.entity.usuario.EstadoUsuario;

public interface IEstadoUsuarioConsultaServicio {
    public EstadoUsuario buscarEstadoUsuarioPorId(Integer idEstadoUsuario);

    public EstadoUsuario buscarEstadoUsuarioPorNombreEstado(String nombreEstadoUsuario);
}
