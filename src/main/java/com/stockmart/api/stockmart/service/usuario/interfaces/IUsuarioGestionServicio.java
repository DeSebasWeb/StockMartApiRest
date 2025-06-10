package com.stockmart.api.stockmart.service.usuario.interfaces;

import com.stockmart.api.stockmart.entity.usuario.Usuario;

public interface IUsuarioGestionServicio {
    public Usuario guardarUsuario(Usuario usuario);

    public Usuario softDelete(Usuario usuario);

    public void hardDelete(Usuario usuario);

    public Usuario recuperar(Usuario usuario);
}