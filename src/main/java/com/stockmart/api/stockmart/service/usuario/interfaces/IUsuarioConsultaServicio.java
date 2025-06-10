package com.stockmart.api.stockmart.service.usuario.interfaces;

import com.stockmart.api.stockmart.entity.usuario.EstadoUsuario;
import com.stockmart.api.stockmart.entity.usuario.Usuario;

import java.util.List;

public interface IUsuarioConsultaServicio {
    public Usuario buscarUsuarioPorId(Usuario usuario);

    public Usuario buscarUsuarioPorCedula(Long cedula);

    public List<Usuario> mostrarUsuariosPorEstado(EstadoUsuario estadoUsuario);

    public Usuario buscarUsuarioPorCorreo(String correo);

    public List<Usuario> mostrarTodosUsuarios();
}