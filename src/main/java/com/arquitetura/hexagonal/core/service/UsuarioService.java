package com.arquitetura.hexagonal.core.service;

import com.arquitetura.hexagonal.core.domain.Usuario;
import com.arquitetura.hexagonal.core.ports.in.UsuarioServicePort;
import com.arquitetura.hexagonal.core.ports.out.UsuarioRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsuarioService implements UsuarioServicePort {

    @Autowired
    private UsuarioRepositoryPort usuarioRepositoryPort;

    @Override
    public Usuario salvar(Usuario usuario) {
        return usuarioRepositoryPort.create(usuario);
    }

    @Override
    public List<Usuario> listar() {
        return usuarioRepositoryPort.findAll();
    }
}
