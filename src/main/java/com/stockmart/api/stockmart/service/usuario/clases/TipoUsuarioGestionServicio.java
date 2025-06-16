package com.stockmart.api.stockmart.service.usuario.clases;

import com.stockmart.api.stockmart.entity.usuario.TipoUsuario;
import com.stockmart.api.stockmart.repository.usuario.TipoUsuarioRepositorio;
import com.stockmart.api.stockmart.service.usuario.interfaces.ITipoUsuarioGestionServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TipoUsuarioGestionServicio implements ITipoUsuarioGestionServicio {
    private final TipoUsuarioRepositorio tipoUsuarioRepositorio;
    private static final Logger logger = LoggerFactory.getLogger(TipoUsuarioGestionServicio.class);

    @Autowired
    public TipoUsuarioGestionServicio(TipoUsuarioRepositorio tipoUsuarioRepositorio) {
        this.tipoUsuarioRepositorio = tipoUsuarioRepositorio;
    }

    @Override
    public TipoUsuario guardarTipoUsuario(TipoUsuario tipoUsuario) {
        return this.tipoUsuarioRepositorio.save(tipoUsuario);
    }

    @Override
    public TipoUsuario actualizarTipoUsuario(TipoUsuario tipoUsuario) {
        return this.tipoUsuarioRepositorio.save(tipoUsuario);
    }

    @Override
    public void eliminarTipoUsuario(TipoUsuario tipoUsuario) {
        logger.info("Se ha eliminado el usuario con id: "+tipoUsuario.getIdTipoUsuario());
        this.tipoUsuarioRepositorio.delete(tipoUsuario);
    }
}
