package com.stockmart.api.stockmart.service.usuario.clases;

import com.stockmart.api.stockmart.entity.usuario.EstadoUsuario;
import com.stockmart.api.stockmart.service.usuario.interfaces.IEstadoUsuarioConsultaServicio;
import org.springframework.stereotype.Service;

@Service
public class EstadoUsuarioConsultaServicio implements IEstadoUsuarioConsultaServicio {

    @Override
    public EstadoUsuario buscarEstadoUsuarioPorId(Integer idEstadoUsuario) {
        return null;
    }

    @Override
    public EstadoUsuario buscarEstadoUsuarioPorNombreEstado(String nombreEstadoUsuario) {
        return null;
    }
}
