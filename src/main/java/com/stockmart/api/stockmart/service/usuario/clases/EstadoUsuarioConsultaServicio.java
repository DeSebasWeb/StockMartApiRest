package com.stockmart.api.stockmart.service.usuario.clases;

import com.stockmart.api.stockmart.entity.usuario.EstadoUsuario;
import com.stockmart.api.stockmart.repository.usuario.EstadoUsuarioRepositorio;
import com.stockmart.api.stockmart.service.usuario.interfaces.IEstadoUsuarioConsultaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class EstadoUsuarioConsultaServicio implements IEstadoUsuarioConsultaServicio {

    private final EstadoUsuarioRepositorio estadoUsuarioRepositorio;

    @Autowired
    public EstadoUsuarioConsultaServicio(EstadoUsuarioRepositorio estadoUsuarioRepositorio) {
        this.estadoUsuarioRepositorio = estadoUsuarioRepositorio;
    }

    @Override
    public EstadoUsuario buscarEstadoUsuarioPorId(Integer idEstadoUsuario) {
        return this.estadoUsuarioRepositorio.findById(idEstadoUsuario).orElseThrow(()-> new RuntimeException("No se ha encontrado el estado con el id indicado"));
    }

    @Override
    public EstadoUsuario buscarEstadoUsuarioPorNombreEstado(String nombreEstadoUsuario) {
        return this.estadoUsuarioRepositorio.findByNombre(nombreEstadoUsuario);
    }
}
