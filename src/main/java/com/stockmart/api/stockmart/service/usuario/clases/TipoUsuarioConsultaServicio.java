package com.stockmart.api.stockmart.service.usuario.clases;

import com.stockmart.api.stockmart.entity.usuario.TipoUsuario;
import com.stockmart.api.stockmart.repository.usuario.TipoUsuarioRepositorio;
import com.stockmart.api.stockmart.service.usuario.interfaces.ITipoUsuarioConsultaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@Transactional(readOnly = true)
public class TipoUsuarioConsultaServicio implements ITipoUsuarioConsultaServicio {
    private final TipoUsuarioRepositorio tipoUsuarioRepositorio;

    @Autowired
    public TipoUsuarioConsultaServicio(TipoUsuarioRepositorio tipoUsuarioRepositorio) {
        this.tipoUsuarioRepositorio = tipoUsuarioRepositorio;
    }

    @Override
    public TipoUsuario buscarTipoUsuarioPorId(Integer idTipoUsuario) {
        return this.tipoUsuarioRepositorio.findById(idTipoUsuario).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Tipo Usuario no ha sido encontrado"));
    }

    @Override
    public TipoUsuario buscarUsuarioPorNombreTipoUsuario(String nombreTipoUsuario) {
        return this.tipoUsuarioRepositorio.findByNombreTipoUsuario(nombreTipoUsuario);
    }
}
