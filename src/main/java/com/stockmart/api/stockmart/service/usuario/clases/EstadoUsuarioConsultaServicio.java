package com.stockmart.api.stockmart.service.usuario.clases;

import com.stockmart.api.stockmart.entity.usuario.EstadoUsuario;
import com.stockmart.api.stockmart.repository.usuario.EstadoUsuarioRepositorio;
import com.stockmart.api.stockmart.service.usuario.interfaces.IEstadoUsuarioConsultaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoUsuarioConsultaServicio implements IEstadoUsuarioConsultaServicio {

    @Autowired
    private EstadoUsuarioRepositorio estadoUsuarioRepositorio;

    @Override
    public EstadoUsuario buscarEstadoUsuarioPorId(Integer idEstadoUsuario) {
        return this.estadoUsuarioRepositorio.findById(idEstadoUsuario).orElseThrow(()-> new RuntimeException("No se ha encontrado el estado con el id indicado"));
    }

    @Override
    public EstadoUsuario buscarEstadoUsuarioPorNombreEstado(String nombreEstadoUsuario) {
        return null;
    }
}
