package com.stockmart.api.stockmart.service.usuario.interfaces;


import com.stockmart.api.stockmart.entity.usuario.TipoUsuario;

public interface ITipoUsuarioConsultaServicio {
    public TipoUsuario buscarTipoUsuarioPorId(Integer idTipoUsuario);

    public TipoUsuario buscarUsuarioPorNombreTipoUsuario(String nombreTipoUsuario);
}
