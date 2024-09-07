package com.arquitetura.hexagonal.core.service;

import com.arquitetura.hexagonal.core.domain.Usuario;
import com.arquitetura.hexagonal.core.ports.UsuarioServicePort;

public class UsuarioService implements UsuarioServicePort {

    @Override
    public Usuario salvar(Usuario usuario) {
        return usuario;
    }
}
