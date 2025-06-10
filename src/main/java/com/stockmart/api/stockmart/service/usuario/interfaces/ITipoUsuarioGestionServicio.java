package com.stockmart.api.stockmart.service.usuario.interfaces;

import com.stockmart.api.stockmart.entity.usuario.TipoUsuario;

public interface ITipoUsuarioGestionServicio {
    public TipoUsuario guardarTipoUsuario(TipoUsuario tipoUsuario);

    public TipoUsuario actualizarTipoUsuario(TipoUsuario tipoUsuario);

    public void eliminarTipoUsuario(TipoUsuario tipoUsuario);
}
